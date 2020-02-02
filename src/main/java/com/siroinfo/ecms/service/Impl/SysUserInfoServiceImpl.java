package com.siroinfo.ecms.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.siroinfo.ecms.comm.Result;
import com.siroinfo.ecms.comm.ResultGenerator;
import com.siroinfo.ecms.dao.ds1.SysUserInfoDao;
import com.siroinfo.ecms.model.SysMenuInfoModel;
import com.siroinfo.ecms.model.SysRoleInfoModel;
import com.siroinfo.ecms.model.SysUserInfoModel;
import com.siroinfo.ecms.service.SysUserInfoService;
import com.siroinfo.ecms.shrio.UserUtil;

import org.apache.shiro.authc.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 用户管理
 * create by zhoujh
 */

@Service(value = "UserService")
public class SysUserInfoServiceImpl implements SysUserInfoService {

    private final static Logger logger = LoggerFactory.getLogger(SysUserInfoService.class);

    @Resource
    SysUserInfoDao userDao;
//    @Resource
//    SystemDao systemDao;
    
    @Override
    public Map<String, Object> checkUserStatus(String userNo) {
        Map<String, Object> returnMap = new HashMap<>();
        // 用户号是否存在
        SysUserInfoModel sysUserInfo = userDao.getUserByNo(userNo);
        if (sysUserInfo == null) {
            returnMap.put("TrxCode", "Login_001");
            returnMap.put("TrxMessage", "用户不存在");
            return returnMap;
        }
        // 用户密码状态是否正常  0-初始 需先修改密码  2-锁定需先解锁
        if ("0".equals(sysUserInfo.getPwdStatus())) {
            returnMap.put("TrxCode", "Login_003");
            returnMap.put("TrxMessage", "当前用户[" + userNo + "]密码为初始状态，需先更改密码");
            return returnMap;
        }
        if ("2".equals(sysUserInfo.getPwdStatus())) {
            returnMap.put("TrxCode", "Login_004");
            returnMap.put("TrxMessage", "当前用户[" + userNo + "]密码已锁定，需先解锁密码");
            return returnMap;
        }
        // 用户状态是否正常  1-登录 0-签退
        if ("1".equals(sysUserInfo.getStat())) {
            returnMap.put("TrxCode", "Login_002");
            returnMap.put("TrxMessage", "当前用户[" + userNo + "]已登录");
            return returnMap;
        }
        // 用户权限校验
//        List<TrxModel> trxList = this.userDao.getUserTrxByUserNo(userNo);
//        if (trxList == null || trxList.size() == 0) {
//            returnMap.put("TrxCode", "Login_005");
//            returnMap.put("TrxMessage", "当前用户[" + userNo + "]未分配权限");
//            return returnMap;
//        }
        returnMap.put("TrxCode", "000000");
        return returnMap;
    }
    
    @Override
    public void ModifyUserStatus(String userNo) {
        // 用户状态改为 已登录
        Map<String, Object> params0 = new HashMap<>();
        params0.put("userNo", userNo);
        params0.put("userStatus", "1");
        this.userDao.updateUserStatus(params0);
        // 如果用户密码错误次数大于0 则归零
        SysUserInfoModel user = this.userDao.getUserByNo(userNo);
        if (user.getErrnum() > 0) {
            Map<String, Object> updateUserPwdStatusMap = new HashMap<String, Object>();
            updateUserPwdStatusMap.put("userNo", userNo);//用户号
            updateUserPwdStatusMap.put("errnum", 0);//密码错误次数
            this.userDao.updateUserPwd(updateUserPwdStatusMap);
        }
    }
    
    @Override
    public SysUserInfoModel getUserByNo(String userNo) {
        return this.userDao.getUserByNo(userNo);
    }
    
    @Override
    public Map<String, Object> handlePwdErr(String userNo) {
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("TrxCode", "Login_005");
        returnMap.put("TrxMessage", "密码错误，登录失败");
        SysUserInfoModel user = this.userDao.getUserByNo(userNo);
        int errNum = user.getErrnum() + 1;
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userNo", userNo);
        params.put("errnum", errNum);
        params.put("upddate", new SimpleDateFormat("yyyyMMdd").format(new Date()));
        if (errNum >= 5) {
            params.put("status", "2");
            returnMap.put("TrxMessage", "密码错误次数超过5次，密码已锁定");
        }
        this.userDao.updateUserPwd(params);
        return returnMap;

    }
    
    @Override
    public Result updateUserPwd(Map<String, Object> updateUserMap) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("TrxCode", "000000");
        data.put("TrxMessage", "修改密码");
        System.out.println("updateUserMap => " + updateUserMap);
        String userNo = (String) updateUserMap.get("userNo");//用户名
        String oldPwd = (String) updateUserMap.get("oldPwd");//原密码
        String newPwd = (String) updateUserMap.get("newPwd");//新密码
        System.out.println("oldPwd : " + oldPwd);
        if (!"".equals(oldPwd) && oldPwd != null) { // 密码激活不校验原密码
            Map<String, Object> userModel = this.userDao.getUserByNoAndPwd(userNo, oldPwd);
            System.out.println("userModel => " + userModel);
            if (userModel == null || userModel.isEmpty()) {
                data.put("TrxCode", "Login_006");
                data.put("TrxMessage", "用户名或密码错误！");
                Map<String, Object> errNumMap = this.userDao.getPwdNum(userNo);
                if (userModel == null || userModel.isEmpty()) {
                    data.put("TrxCode", "Login_009");
                    data.put("TrxMessage", "用户名不存在！");
                    return ResultGenerator.genSuccessResult(data);
                }
                int errNum = Integer.parseInt((String) errNumMap.get("errnum"));
                errNum += 1;
                String errNumStr = Integer.toString(errNum);
                System.out.println("errNumStr : " + errNumStr);
                Map<String, Object> updateUserPwdStatusMap = new HashMap<String, Object>();
                updateUserPwdStatusMap.put("userNo", userNo);//用户号
                updateUserPwdStatusMap.put("errnum", errNumStr);//密码错误次数
                boolean isUpdateUserPwdStatus = this.userDao.updateUserPwd(updateUserPwdStatusMap);
                if (errNum >= 5) {
                    data.put("TrxCode", "Login_006");
                    data.put("TrxMessage", "用户名或密码错误，密码已锁定！");
                }
                return ResultGenerator.genSuccessResult(data);
            } else if ("2".equals(userModel.get("status"))) {
                data.put("TrxCode", "Login_007");
                data.put("TrxMessage", "密码已锁定请先解除锁定！");
                return ResultGenerator.genSuccessResult(data);
            }
        }
        //获取当前日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String updateDate = sdf.format(new Date());
        System.out.println("updateDate => " + updateDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, 1);
        String endDate = sdf.format(cal.getTime());
        Map<String, Object> updateUserPwdStatusMap = new HashMap<String, Object>();
        updateUserPwdStatusMap.put("userNo", userNo);//用户号
        updateUserPwdStatusMap.put("password", newPwd);//新密码
        updateUserPwdStatusMap.put("status", "1");//密码状态
        updateUserPwdStatusMap.put("errnum", "0");//错误次数
        updateUserPwdStatusMap.put("upddate", updateDate);//修改日期
        updateUserPwdStatusMap.put("enddate", endDate);//到期日期
        boolean isUpdateUserPwdStatus = this.userDao.updateUserPwd(updateUserPwdStatusMap);
        if (!isUpdateUserPwdStatus) {
            data.put("TrxCode", "Login_008");
            data.put("TrxMessage", "修改密码失败！");
            return ResultGenerator.genSuccessResult(data);
        }
        return ResultGenerator.genSuccessResult(data);
    }
    
    @Override
    public List<SysMenuInfoModel> getUserMenuByUserNo(String userNo) {
        List<SysMenuInfoModel> trxList = this.userDao.getUserMenuByUserNo(userNo);
        return trxList;
    }
    
    @Override
    public List<SysRoleInfoModel> getUserRoleByUserNo(String userNo) {
        return this.userDao.getUserRoleByUserNo(userNo);
    }
    
    @Override
    public Map<String, Object> getUserInfoByNo(String userNo) {
        Map<String, Object> returnMap = new HashMap<>();
        SysUserInfoModel userInfo = userDao.getUserByNo(userNo);
        if (userInfo == null) {
            returnMap.put("TrxCode", "Login_001");
            returnMap.put("TrxMessage", "用户不存在");
        } else {
            returnMap.put("TrxCode", "000000");
            returnMap.put("TrxData", userInfo);
        }
        return returnMap;
    }
    
    @Override
    public List<String> getUserMenuList(String userNo) {
        List<SysMenuInfoModel> trxList = userDao.getUserMenuByUserNo(userNo);
        List<String> trxListStr = new ArrayList<>();
        String branchNo=this.userDao.getUserByNo(UserUtil.getCurUser().getUserNo()).getOrgId();
        //String branchLevel=this.systemDao.getBranchLevel(branchNo).getBranchlevel();//柜员机构级别
        //根据用户机构、交易机构权限。进行交易筛选
//        if("019807".equals(branchNo)){//019807 按总行处理
//            for (SysMenuInfoModel trx : trxList) {
//                trxListStr.add(trx.getId());
//            }
//        }else{
//            List<Map<String, Object>> trx = this.userDao.selectEcms_trxByLevel(branchNo);
//            for(int i=0;i<trx.size();i++){
//                trxListStr.add(trx.get(i).get("trxNo").toString());
//            }
//        }
        for (SysMenuInfoModel trx : trxList) {
            trxListStr.add(trx.getId());
        }
        System.out.println("菜单列表："+trxListStr.size()+"|"+trxListStr.toString());
        return trxListStr;
    }
    
    @Override
    public Result updateUserStatus(Map<String, Object> userMap) {
        String userNo = (String) userMap.get("userNo");
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("TrxCode", "000000");
        data.put("TrxMessage", "退出成功");
        SysUserInfoModel userModel = this.userDao.getUserByNo(userNo);
        if (userModel == null) {
            data.put("TrxCode", "Login_010");
            data.put("TrxMessage", "退出失败，用户号不存在");
            return ResultGenerator.genSuccessResult(data);
        } else if (!"1".equals(userModel.getStat())) {
            data.put("TrxCode", "Login_011");
            data.put("TrxMessage", "退出失败，该用户未登录！");
            return ResultGenerator.genSuccessResult(data);
        }
        Map<String, Object> updateUserPwdStatusMap = new HashMap<String, Object>();
        updateUserPwdStatusMap.put("userNo", userNo);//用户号
        updateUserPwdStatusMap.put("userStatus", "2");//用户状态
        boolean isUpdateUserPwdStatus = this.userDao.updateUserPwdStatus(updateUserPwdStatusMap);
        if (!isUpdateUserPwdStatus) {
            data.put("TrxCode", "Login_012");
            data.put("TrxMessage", "退出失败！");
            return ResultGenerator.genSuccessResult(data);
        }
        return ResultGenerator.genSuccessResult(data);
    }
    
    @Override
    public Result getUserInfoList(int pageNum, int pageSize, Map<String, Object> usermngMap) throws Exception {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("TrxCode", "000000");
        data.put("TrxMessage", "SUCCESS");
//        String userNo = (String) usermngMap.get("userNo");//用户号
//        String userName = (String) usermngMap.get("userName");//用户名称
        PageHelper.startPage(pageNum, pageSize);
        List<SysUserInfoModel> userInfoList = userDao.getUserInfoList(usermngMap);
        if(userInfoList == null || userInfoList.size() == 0){
            data.put("TrxCode", "T1001_001");
            data.put("TrxMessage", "柜员号不存在");
            return  ResultGenerator.genSuccessResult(data);
        }
        PageInfo<SysUserInfoModel> pageInfo = new PageInfo<SysUserInfoModel>(userInfoList);
        data.put("PageInfo",pageInfo);
        return ResultGenerator.genSuccessResult(data);
    }
    
    @Override
    public Result updateUserBaseInfo(Map<String, Object> usermngMap) throws Exception {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("TrxCode", "000000");
        data.put("TrxMessage", "SUCCESS");
        String userNo = (String) usermngMap.get("userNo");//用户号
        String roleNo = (String) usermngMap.get("roleNo");//用户号
        boolean isUserManageModel = false;//维护用户信息返回结果
        
        SysUserInfoModel sysUserInfoModel =  userDao.getUserByNo(userNo);
        
        if(sysUserInfoModel == null){
            return ResultGenerator.genSuccessResult(data);
        }else {
                isUserManageModel = userDao.updateUserBaseInfo(usermngMap);
        }
        System.out.println("isUserManageModel :" + isUserManageModel);
        if (!isUserManageModel){
            data.put("TrxCode", "T1001_002");
            data.put("TrxMessage", "修改失败");
            return ResultGenerator.genSuccessResult(data);
        }
//        Map<String, Object> roleMap = new HashMap<String, Object>();
//        roleMap.put("userNo",userNo);
//        List<Map<String, Object>> getUserRoleRelationList = this.userManageDao.getUserRoleRelation(roleMap);
//        if(getUserRoleRelationList == null || getUserRoleRelationList.size() == 0){
//            data.put("TrxCode", "T1001_006");
//            data.put("TrxMessage", "修改用户信息成功，维护用户类别失败");
//            return  ResultGenerator.genSuccessResult(data);
//        }
//        roleMap.put("roleNo",roleNo);
//        this.userManageDao.updateUserRoleRelation(roleMap);
        return  ResultGenerator.genSuccessResult(data);
    }

    @Override
    public Result addUserBaseInfo(Map<String, Object> usermngMap) throws Exception {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("TrxCode", "000000");
        data.put("TrxMessage", "SUCCESS");
        String userNo = (String) usermngMap.get("userNo");//用户号
        String roleNo = (String) usermngMap.get("roleNo");//用户号
        boolean isUserManageModel = false;//维护用户信息返回结果

        SysUserInfoModel sysUserInfoModel =  userDao.getUserByNo(userNo);
        if(sysUserInfoModel == null){
            isUserManageModel =   userDao.addUserBaseInfo(usermngMap);
            this.addUserPwd(userNo);

        }else{
            if (!userNo.equals(sysUserInfoModel.getUserNo()))  {
                isUserManageModel =  userDao.addUserBaseInfo(usermngMap);
                this.addUserPwd(userNo);
            }else {
                data.put("TrxCode", "T1001_003");
                data.put("TrxMessage", "用户号已存在不允许新增");
                return ResultGenerator.genSuccessResult(data);
            }
        }
        if (!isUserManageModel) {
            data.put("TrxCode", "T1001_004");
            data.put("TrxMessage", "新增用户失败");
            return ResultGenerator.genSuccessResult(data);
        }
//        Map<String, Object> roleMap = new HashMap<String, Object>();
//        roleMap.put("userNo",userNo);
//        System.out.println("userNo : " + userNo);
//        List<Map<String, Object>> getUserRoleRelationList = this.userManageDao.getUserRoleRelation(roleMap);
//        System.out.println("getUserRoleRelationList : " + getUserRoleRelationList);
//        if(getUserRoleRelationList != null && getUserRoleRelationList.size() != 0){
//            data.put("TrxCode", "T1001_007");
//            data.put("TrxMessage", "增加用户信息成功，该用户类别信息已存在，增加用户类别失败");
//            return  ResultGenerator.genSuccessResult(data);
//        }
//        roleMap.put("roleNo",roleNo);
//        boolean isTrue = this.userManageDao.addUserRoleRelation(roleMap);
        return ResultGenerator.genSuccessResult(data);
    }

    @Override
    public Result deleteUserBaseInfo(List<String> userNoList) throws Exception {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("TrxCode", "000000");
        data.put("TrxMessage", "SUCCESS");
        boolean isUserManageModel  = false;
        for(String userNo : userNoList){
            isUserManageModel = userDao.deleteUserBaseInfo(userNo);
            if(!isUserManageModel){
                data.put("TrxCode", "T1001_005");
                data.put("TrxMessage", "删除用户失败");
                return ResultGenerator.genSuccessResult(data);
            }
              boolean isDltPwd = userDao.deleteUserPwd(userNo);
            if(!isUserManageModel){
                data.put("TrxCode", "T1001_006");
                data.put("TrxMessage", "删除用户信息成功，删除用户密码失败");
                return ResultGenerator.genSuccessResult(data);
            }
//            Map<String, Object> roleMap = new HashMap<String, Object>();
//            roleMap.put("userNo",userNo);
//            List<Map<String, Object>> getUserRoleRelationList = this.userManageDao.getUserRoleRelation(roleMap);
//            if(getUserRoleRelationList == null || getUserRoleRelationList.size() == 0){
//                data.put("TrxCode", "T1001_008");
//                data.put("TrxMessage", "删除用户信息成功，删除用户类别失败");
//                return  ResultGenerator.genSuccessResult(data);
//            }
//            this.userManageDao.deleteUserRoleRelation(roleMap);
        }
        return ResultGenerator.genSuccessResult(data);
    }
    
    public void addUserPwd(String userNo) throws Exception {
        Map<String, Object> userPwdMap = new HashMap<String, Object>();
        userPwdMap.put("userNo", userNo);
        userPwdMap.put("password", DigestUtils.md5Hex(userNo+"888888"));
        userPwdMap.put("salt", userNo);
        userPwdMap.put("errnum", "0");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String updateDate = sdf.format(new Date());
        System.out.println("updateDate => " + updateDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, 1);
        String endDate = sdf.format(cal.getTime());
        userPwdMap.put("upddate", updateDate);
        userPwdMap.put("enddate", endDate);
        userPwdMap.put("status", "0");
        userDao.addUserPwd(userPwdMap);
    }
}
