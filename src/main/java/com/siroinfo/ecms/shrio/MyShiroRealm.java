package com.siroinfo.ecms.shrio;
import com.siroinfo.ecms.model.SysMenuInfoModel;
import com.siroinfo.ecms.model.SysRoleInfoModel;
import com.siroinfo.ecms.model.SysUserInfoModel;
import com.siroinfo.ecms.service.SysUserInfoService;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

import java.util.List;

public class MyShiroRealm extends AuthorizingRealm {
    private final static Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    @Resource
    public SysUserInfoService userService;

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("============================授权=======================================");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        SysUserInfoModel user = (SysUserInfoModel) principals.getPrimaryPrincipal();
        try {
            //注入角色(查询所有的角色注入控制器）            L
            List<SysRoleInfoModel> list = userService.getUserRoleByUserNo(user.getUserNo());
            for (SysRoleInfoModel role: list){
                authorizationInfo.addRole(role.getRoleNo());
            }
            //注入角色所有权限（查询用户所有的权限注入控制器）
            List<SysMenuInfoModel> sysAuths = userService.getUserMenuByUserNo(user.getUserNo());
            for(SysMenuInfoModel sysAuth:sysAuths){
                authorizationInfo.addStringPermission(sysAuth.getId());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return authorizationInfo;
    }

    /**
     * 登录认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        logger.info("============================登录=======================================");
        //获取用户账号
        String userNo = token.getPrincipal().toString();

        String password = userService.getUserByNo(userNo).getPassword();
        if (password != null) {
            AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    userNo,   //认证通过后，存放在session,一般存放user对象
                    password,   //用户数据库中的密码
                    getName());    //返回Realm名
            return authenticationInfo;
        }
        return null;
    }
}
