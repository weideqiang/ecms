package com.siroinfo.ecms.dao.ds1;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.siroinfo.ecms.model.SysMenuInfoModel;
import com.siroinfo.ecms.model.SysRoleInfoModel;
import com.siroinfo.ecms.model.SysUserInfoModel;

import java.util.List;
import java.util.Map;

/**
 * 用户管理
 * create by zhoujh
 */

@Mapper
public interface SysUserInfoDao {
    public SysUserInfoModel getUserByNo(String userNo);
    
    public int updateUserStatus(@Param("params") Map<String, Object> params);
    
    public boolean updateUserPwd(@Param("updateUserMap") Map<String, Object> updateUserMap);
    
    public Map getUserByNoAndPwd(@Param("userNo") String userNo, @Param("password") String password);
    
    public Map getPwdNum(String userNo);
    
    public List<SysMenuInfoModel> getUserMenuByUserNo(String userNo);
    
    public List<SysRoleInfoModel> getUserRoleByUserNo(String userNo);
    
    public boolean updateUserPwdStatus(@Param("updateUserPwdStatusMap") Map<String, Object> updateUserPwdStatusMap);
    /**
     * 根据输入条件查询用户的基本信息
     * @param usermngMap    用户信息
     * @return
     * @throws Exception
     */
    public List<SysUserInfoModel> getUserInfoList(@Param("usermngMap") Map<String, Object> usermngMap) throws Exception;
    /**
     * 修改用户的基本信息
     * @param usermngMap        用户信息
     * @return
     * @throws Exception
     */
    public boolean updateUserBaseInfo(@Param("usermngMap") Map<String, Object> usermngMap) throws Exception;
    /**
     * 增加用户的基本信息
     * @param usermngMap        用户信息
     * @return
     * @throws Exception
     */
    public boolean addUserBaseInfo(@Param("usermngMap") Map<String, Object> usermngMap) throws Exception;

    /**
     * 根据柜员号删除用户的基本信息
     * @param userNo        用户号
     * @return
     * @throws Exception
     */
    public boolean deleteUserBaseInfo(String userNo) throws Exception;
    
    /**
     * 根据柜员号删除用户密码
     * @param userNo        用户号
     * @return
     * @throws Exception
     */
    public boolean deleteUserPwd(String userNo) throws Exception;
    
    /**
     * 增加用户密码
     * @param userPwdMap
     * @return
     * @throws Exception
     */
    public boolean addUserPwd(@Param("userPwdMap") Map<String, Object> userPwdMap) throws Exception;
    
    
    /**
    
    
    
    public List<TrxModel> getUserTrxByUserNo(String userNo);
    public String getUserTrxByUsernoAndTrxno(String userNo, String trxNo);
    public List<UserModel> getAllUser();

    public boolean updateUserPwdStatus(@Param("updateUserPwdStatusMap") Map<String, Object> updateUserPwdStatusMap);
    public boolean updateUserPwd(@Param("updateUserMap") Map<String, Object> updateUserMap);
    public int insertUsrInfo(@Param("aa") Map<String, Object> map);

    public int updateUserStatus(@Param("params") Map<String, Object> params);
    public List<Map<String, Object>>  selectEcms_roleInfo(@Param(value = "paramsMap") Map<String, Object> paramsMap) throws Exception;
    public Map  selectEcms_trxLevel(@Param(value = "trxNo")String trxNo);
    public   List<Map<String, Object>>  selectEcms_trxByLevel(@Param(value = "branchNo") String branchNo);
    
    **/

}
