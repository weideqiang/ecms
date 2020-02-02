package com.siroinfo.ecms.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.siroinfo.ecms.comm.Result;
import com.siroinfo.ecms.comm.ResultGenerator;
import com.siroinfo.ecms.model.SysUserInfoModel;
import com.siroinfo.ecms.service.SysUserInfoService;
import com.siroinfo.ecms.shrio.UserUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//@CrossOrigin
@RestController
@Api(value = "用户管理")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    SysUserInfoService userService;
    /**
     * 获取用户信息
     */
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    @ApiOperation(value="用户查询", notes="用户查询")
    public Result getUserInfo(String userNo){
    	Map<String,Object> resultData = this.userService.getUserInfoByNo(userNo);
    	return ResultGenerator.genSuccessResult(resultData);
    }
    /**
     * 获取菜单
     */
    @RequestMapping(value = "/getUserTrxList",method = RequestMethod.POST)
    @ApiOperation(value="菜单查询", notes="菜单查询")
    public List<String> getUserTrx(){
    	String userNo = UserUtil.getCurUser().getUserNo();
    	List<String> trxList = this.userService.getUserMenuList(userNo);
    	return trxList;
    }

    @RequestMapping(value = "/curuser",method = RequestMethod.POST)
    @ApiOperation(value="用户查询", notes="用户查询")
    public SysUserInfoModel login(String code){
    	SysUserInfoModel curUser = UserUtil.getCurUser();
        return curUser;
    }
    
    /**
     * 查询用户基本信息
     * @param pageNum    查询页数
     * @param pageSize   查询条数
     * @param inputForm  用户信息
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getUserInfoList",method = RequestMethod.POST)
    @ApiOperation(value="用户列表查询", notes="用户列表查询")
    public Result getUserInfoList(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
                                  @RequestParam(value = "pageSize", required = false, defaultValue = "10") int pageSize,
                                  @RequestParam("inputForm") String inputForm) throws Exception {

        Map<String, Object> map = new HashMap<String, Object>();
        if(inputForm.startsWith("[")){
            List<Map<String, Object>> usermngList = JSON.parseObject(inputForm, List.class);
        for (Map<String, Object> usermngMap : usermngList){
            map.put((String) usermngMap.get("value"),usermngMap.get("lable"));
        }
        }else{
             map = JSON.parseObject(inputForm, Map.class);
        }
        Result userManageModel =  userService.getUserInfoList(pageNum, pageSize, map);
        
        return userManageModel;
    }
    /**
     * 增加用户基本信息
     * @param ruleForm
     * @return
     * @throws Exception
     */
    @PostMapping("/addUserBaseInfo")
    public Result addUserBaseInfo(@RequestParam("ruleForm") String ruleForm) throws Exception {
        Map<String, Object> usermngMap = JSON.parseObject(ruleForm, Map.class);
        Result isUserManageModel =  this.userService.addUserBaseInfo(usermngMap);
        return isUserManageModel;
    }

    /**
     * 修改用户基本信息
     * @param ruleForm
     * @return
     * @throws Exception
     */
    @PostMapping("/updateUserBaseInfo")
    public Result updateUserBaseInfo(@RequestParam("ruleForm") String ruleForm) throws Exception {
        Map<String, Object> usermngMap = JSON.parseObject(ruleForm, Map.class);
        Result isUserManageModel =  this.userService.updateUserBaseInfo(usermngMap);
        return isUserManageModel;
    }

    /**
     * 删除用户基本信息
     * @param userNos
     * @return
     * @throws Exception
     */
    @PostMapping("/deleteUserBaseInfo")
    public Result deleteUserBaseInfo(@RequestParam("userNos") String userNos) throws Exception {
        List<String> userNoList = JSON.parseArray(userNos, String.class);
        Result isUserManageModel = this.userService.deleteUserBaseInfo(userNoList);
        return isUserManageModel;
    }
//
//
//    @RequestMapping("/getUserAuth")
//    public String getUserAuth(String trxNo){
//        String userNo = UserUtil.getCurUser().getUserNo();
//        String trxs = this.userService.getUserTrxByUsernoAndTrxno(userNo,trxNo);
//        return trxs;
//    }
//
//    @RequestMapping("/getAllUser")
//    public PageInfo<UserModel> getAllUser(@RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
//                                          @RequestParam(value = "pageSize", required = false, defaultValue = "2") int pageSize){
//        return this.userService.getAllUser(pageNum, pageSize);
//    }
//
//    @RequestMapping("/getUserTrxListGp")
//    public Map<String,List<TrxModel>> getUserTrxGp(){
//        String userNo = UserUtil.getCurUser().getUserNo();
//        Map<String,List<TrxModel>> trxList = this.userService.getUserTrxByUserNoGp(userNo);
//        return trxList;
//    }
//    @RequestMapping("/getUserTrxList")
//    public List<String> getUserTrx(){
//        String userNo = UserUtil.getCurUser().getUserNo();
//        List<String> trxList = this.userService.getUserTrxList(userNo);
//        return trxList;
//    }
//
//

//    @PostMapping(value = "/selectEcms_roleInfo")
//    public Result selectEcms_roleInfo(@RequestParam("ruleForm") String ruleForm) throws Exception{
//        Map<String, Object> paramsMap = JSON.parseObject(ruleForm, Map.class);
//        Result result =  userService.selectEcms_roleInfo(paramsMap);
//        return result;
//    }
}
