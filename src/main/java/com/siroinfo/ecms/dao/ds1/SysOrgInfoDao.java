package com.siroinfo.ecms.dao.ds1;

import com.siroinfo.ecms.model.SysOrgInfoModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysOrgInfoDao {

    public SysOrgInfoModel getOrgInfoByNo(String orgNo);

}
