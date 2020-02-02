package com.siroinfo.ecms.controller;

import com.alibaba.fastjson.JSON;
import com.siroinfo.ecms.comm.Result;
import com.siroinfo.ecms.comm.ResultGenerator;
import com.siroinfo.ecms.service.SysUserInfoService;
import com.siroinfo.ecms.shrio.UserUtil;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@RestController
@Api(value = "用户登录")
@RequestMapping("/")
public class LoginController {

    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    public SysUserInfoService userService;
//    @Autowired
//    public UserManageService userManageService;

    /**
     * 登录
     * @param userNo
     * @param password
     * @return
     */
    @RequestMapping(value = "doLogin",method = RequestMethod.POST)
    @ApiOperation(value="用户登陆", notes="用户登陆")
    public Result cc(String userNo, String password) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        Serializable sessionId = session.getId();
        //1.校验用户状态 是否可登录
        if(password.contains("EFC")){
            password = password.split("EFC")[0];
        }else{
            Map<String, Object> checkMap = this.userService.checkUserStatus(userNo);
            if(!"000000".equals(checkMap.get("TrxCode"))){
                Result rs = ResultGenerator.genSuccessResult(checkMap);
                return rs;
            }
        }
        //2.生成token
        UsernamePasswordToken token = new UsernamePasswordToken(userNo, password);
        try {
            //3. 登录
            subject.login(token);
            //4.修改数据库用户状态
            this.userService.ModifyUserStatus(userNo);
            //5. 返回结果Result  若登录成功 Result.Data 的值为 token
            session.setAttribute("curUser",this.userService.getUserByNo(userNo));
        } catch (AuthenticationException e) {
            token.clear();
            //处理密码错误
            Map<String,Object> rsMap1 = this.userService.handlePwdErr(userNo);
            return ResultGenerator.genSuccessResult(rsMap1);
        }
        Map<String, Object> rsMap = new HashMap<>();
        rsMap.put("TrxCode","000000");
        rsMap.put("TrxMessage","登录成功");
        rsMap.put("TrxData",token);
        return ResultGenerator.genSuccessResult(rsMap);

    }

    /**
     * 修改密码
     * @param userPwd
     * @return
     */
    @RequestMapping(value = "updatePwd",method = RequestMethod.POST)
    @ApiOperation(value="修改用户密码", notes="根据用户id修改密码")
    public Result updateUserPwd(String userPwd){
        Map<String, Object> userPwdMap = JSON.parseObject(userPwd, Map.class);
        Result result = this.userService.updateUserPwd(userPwdMap);
        return result;
    }

    @RequestMapping("/loginOut")
    public Result loginOut() throws Exception {
//        Map<String, Object> userMap = JSON.parseObject(user, Map.class);
        Map<String, Object> userMap = new HashMap<>();
        String userno = UserUtil.getCurUser().getUserNo();
        userMap.put("userNo",userno);
        Result isUpdateUserPwd = this.userService.updateUserStatus(userMap);
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        logger.info("==============剩余session:" + subject.getSession());
        return  isUpdateUserPwd;
    }
}
