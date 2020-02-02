package com.siroinfo.ecms.dao.ds3;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface WarnDao {

    /**
     * 根据主流水号查询异常流水信息
     * @param mainSerialno
     * @return
     */

    Map<String, Object> getWarnTrxDataInfoBySerialno(String mainSerialno);

    /*
    获取异常交易信息
     */
    public List<Map<String,Object>> getWarnTrxDataInfo(@Param("params") Map<String, Object> params);

    public List<Map<String,Object>> getWarnTrxData01(@Param("params") Map<String, Object> params);

    /**
     * 更改异常交易流水状态
     * @param params
     * @return 0-失败 >0-成功
     */
    public int updateWarnTrxDataStatus(@Param("params") Map<String, Object> params);

}

