package com.siroinfo.ecms.dao.ds3;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserStatisticsDao {
    /*
    获取交易量
     */
    public Integer getTrxNums(@Param("params") Map<String, String> params);

    /*
    获取网点排名
     */
    public Integer getTrxNumOrderInWd(@Param("params") Map<String, String> params);

    /*
    获取分行排名
     */
    public Integer getTrxNumOrderInFh(@Param("params") Map<String, String> params);

    /*
    获取全行排名
     */
    public Integer getTrxNumOrderInQh(@Param("params") Map<String, String> params);

    /*
    获取服务人次
     */
    public Integer getServiceNum(@Param("params") Map<String, String> params);

    /*
    获取服务总时长
     */
    public Long getServiceTimes(@Param("params") Map<String, String> params);

    /*
    获取平均服务时长
     */
    public Long getAvgServiceTimes(@Param("params") Map<String, String> params);

    /*
    获取交易量前10交易
     */
    public List<Map<String, Object>> getTop10Trx(@Param("params") Map<String, String> params);

    /*
    获取交易量前10的柜员操作时长
     */
    public List<String> getUserTop10TrxDuration(@Param("params") Map<String, String> params);

    /*
    获取交易量前10的网点平均操作时长
     */
    public List<String> getBrTop10TrxDuration(@Param("params") Map<String, String> params);

    /*
    获取交易量前10的分行平均操作时长
     */
    public List<String> getFhTop10TrxDuration(@Param("params") Map<String, String> params);

    /*
    获取交易量前10的全行平均操作时长
     */
    public List<String> getQhTop10TrxDuration(@Param("params") Map<String, String> params);

    /*
    获取某一之间段内交易量
     */
    public List<Map<String, Object>> getPeriodTrxNums(@Param("params") Map<String, String> params);

    /*
    获取某一时间段内服务人次
     */
    public List<Map<String, Object>> getPeriodServiceNum(@Param("params") Map<String, String> params);

    /*
    获取某一时间段内服务总时长
     */
    public List<Map<String, Object>> getPeriodServiceTimes(@Param("params") Map<String, String> params);


}
