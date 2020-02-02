package com.siroinfo.ecms.service;

import java.util.List;
import java.util.Map;

import com.siroinfo.ecms.comm.Result;
import com.siroinfo.ecms.model.SysMenuInfoModel;
import com.siroinfo.ecms.model.SysRoleInfoModel;
import com.siroinfo.ecms.model.SysUserInfoModel;

/**
 * 用户管理
 * create by zhoujh
 */

public interface SysUserInfoService {
	/**
     * 检查用户状态
     * create by zhoujh
     * @param userNo
     * @return
     */
	public Map<String,Object> checkUserStatus(String userNo);
	
	public void ModifyUserStatus(String userNo);
	
	public SysUserInfoModel getUserByNo(String userNo);
	
	public Map<String,Object> handlePwdErr(String userNo);
	
	public Result updateUserPwd(Map<String, Object> updateUserMap);
	
	public List<SysRoleInfoModel> getUserRoleByUserNo(String userNo);
	
	public List<SysMenuInfoModel> getUserMenuByUserNo(String userNo);
	
	public Map<String,Object> getUserInfoByNo(String userNo);
	
	public List<String> getUserMenuList(String userNo);
	
	public Result updateUserStatus(Map<String, Object> userNo);
	
	/**
     * 根据输入条件查询用户的基本信息
     * @param pageNum       查询页数
     * @param pageSize      查询条数
     * @param inputForm     用户信息数据
     * @return
     * @throws Exception
     */
    public Result getUserInfoList(int pageNum, int pageSize, Map<String, Object> inputForm) throws Exception;
    
    /**
     * 修改用户的基本信息
     * @param ruleForm        用户信息
     * @return
     * @throws Exception
     */
    public Result updateUserBaseInfo(Map<String, Object> ruleForm) throws Exception;
    /**
     * 增加用户的基本信息
     * @param ruleForm        用户信息
     * @return
     * @throws Exception
     */
    public Result addUserBaseInfo(Map<String, Object> ruleForm) throws Exception;

    /**
     * 根据柜员号删除用户的基本信息
     * @param userNo        用户号
     * @return
     * @throws Exception
     */
    public Result deleteUserBaseInfo(List<String> userNo) throws Exception;
	
//    UserModel getUserByNo(String userNo);
//    
//    List<RoleModel> getUserRoleByUserNo(String userNo);
//    List<TrxModel> getUserTrxByUserNo(String userNo);
//    Map<String,List<TrxModel>> getUserTrxByUserNoGp(String userNo);
//    List<String> getUserTrxList(String userNo);
//    String getUserTrxByUsernoAndTrxno(String userNo,String trxNo);
//    PageInfo<UserModel> getAllUser(int pageNum, int pageSize);
//
//    int insertUserInfo(Map<String,Object> params);
//
//    public Result updateUserStatus(Map<String, Object> userNo);
//    public Result updateUserPwd(Map<String, Object> updateUserMap);
//
//    void loginDb(String userNo);
//    Map<String,Object> handlePwdErr(String userNo);
//    public Result selectEcms_roleInfo(Map<String, Object> paramsMap) throws Exception;
}
