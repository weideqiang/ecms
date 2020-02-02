package com.siroinfo.ecms.shrio;

import com.siroinfo.ecms.model.SysUserInfoModel;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

public class UserUtil {
    public static SysUserInfoModel getCurUser(){
        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();
        SysUserInfoModel user = (SysUserInfoModel) session.getAttribute("curUser");
        return user;

    }
}
