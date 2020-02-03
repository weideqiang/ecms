package com.siroinfo.ecms.service.Impl;

import com.siroinfo.ecms.dao.ds1.SysOrgInfoDao;
import com.siroinfo.ecms.model.SysOrgInfoModel;
import com.siroinfo.ecms.service.SysOrgInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 机构管理
 * create by weidq
 */

@Service(value = "OrgInfoService")
public class SysOrgInfoServceImpl implements SysOrgInfoService {

    private final static Logger logger = LoggerFactory.getLogger(SysOrgInfoService.class);

    @Resource
    SysOrgInfoDao orgDao;

    @Override
    public Map<String, Object> getOrgInfoByNo(String orgNo) {
        Map<String, Object> returnMap = new HashMap<>();
        SysOrgInfoModel orgInfo = orgDao.getOrgInfoByNo(orgNo);
        if (orgInfo == null) {
            returnMap.put("TrxCode", "Login_001");
            returnMap.put("TrxMessage", "机构不存在");
        } else {
            returnMap.put("TrxCode", "000000");
            returnMap.put("TrxData", orgInfo);
        }
        return returnMap;
    }

}
