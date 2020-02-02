package com.siroinfo.ecms.dao.ds3;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PbUserStatisDao {

        public List<Map<String, Object>> getAuthStatisticsCountValueByMonth(@Param(value = "paramsMap") Map<String, Object> paramsMap) throws Exception;
        public List<Map<String, Object>> getAuthStatisticsTellerNumByMonthC(@Param(value = "paramsMap") Map<String, Object> paramsMap,
                                                                           @Param(value = "list") List list) throws Exception;
        public List<Map<String, Object>> getAuthStatisticsTellerNumByMonthG(@Param(value = "paramsMap") Map<String, Object> paramsMap,
                                                                            @Param(value = "list") List list) throws Exception;
        public boolean insertpb_auth_predicted_month(@Param("paramsMap1") Map<String, Object> paramsMap1) throws Exception;
        public boolean updatepb_auth_predicted_month(@Param("paramsMap2") Map<String, Object> paramsMap2) throws Exception;
        public boolean updatepb_auth_predicted_monthByMonth(@Param("paramsMap3") Map<String, Object> paramsMap3) throws Exception;
        public boolean updatepb_auth_predicted_monthByDayRate(@Param("paramsMap4") Map<String, Object> paramsMap4) throws Exception;
        public boolean updatepb_auth_predicted_monthByDayNum(@Param("paramsMap5") Map<String, Object> paramsMap5) throws Exception;
        public List<Map<String, Object>>  getpb_auth_predicted_monthInfo(@Param("paramsMap6") Map<String, Object> paramsMap6) throws Exception;
        public boolean Deletepb_auth_predicted_monthByDate(@Param("paramsMap7") Map<String, Object> paramsMap7) throws Exception;
        public boolean updatepb_auth_predicted_monthByEfficiacy(@Param("paramsMap8") Map<String, Object> paramsMap8) throws Exception;
        public List<Map<String, Object>>  getpb_auth_predicted_monthInfo1(@Param("paramsMap9") Map<String, Object> paramsMap9) throws Exception;
        public List<Map<String, Object>>  selectpb_auth_predicted_month_avgBymonth(@Param("paramsMap10") Map<String, Object> paramsMap10) throws Exception;




}
