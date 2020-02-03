package com.siroinfo.ecms.service;

import com.siroinfo.ecms.model.SysOrgInfoModel;

import java.util.Map;

/**
 * 机构管理
 * create by weidq
 */

public interface SysOrgInfoService {

    /**
     * 查询机构信息
     * create by weidq
     * @param orgNo
     * @return
     */
    public Map<String,Object> getOrgInfoByNo(String orgNo);

}
