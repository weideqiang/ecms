package com.siroinfo.ecms.dao.ds1;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public interface PbUserInfoDao {
    public boolean insertpb_auth_history_month(@Param("paramsMap1") Map<String, Object> paramsMap1) throws Exception;
    public List<Map<String, Object>> getAuthTellerInfoC(@Param(value = "paramsMap2") Map<String, Object> paramsMap2) throws Exception;
    public List<Map<String, Object>> getpb_auth_history_monthByDate(@Param(value = "paramsMap3") Map<String, Object> paramsMap3) throws Exception;
    public boolean insertpb_auth_history_month_avg(@Param("paramsMap4") Map<String, Object> paramsMap4) throws Exception;
    public List<Map<String, Object>> getpb_auth_history_monthAvgByDate(@Param(value = "paramsMap5") Map<String, Object> paramsMap5) throws Exception;
    public List<Map<String, Object>> getPisHolidayDateInfo(@Param(value = "paramsMap6") Map<String, Object> paramsMap6) throws Exception;
    public boolean updatepb_pb_class_info_personNum(@Param("paramsMap7") Map<String, Object> paramsMap7) throws Exception;
    public List<Map<String, Object>> selectpb_class_info(@Param("paramsMap8") Map<String, Object> paramsMap8) throws Exception;
    public List<Map<String, Object>> selectpb_class_infoNote1(@Param("paramsMap9") Map<String, Object> paramsMap9) throws Exception;
    public boolean insertpb_duty_info(@Param("paramsMap11") Map<String, Object> paramsMap11) throws Exception;
    public List<Map<String, Object>> selectpb_user_infoByUserno(@Param(value = "paramsMap11") Map<String, Object> paramsMap11,
                                                                        @Param(value = "list") List list) throws Exception;
    public List<Map<String, Object>>  selectpb_user_Queue(@Param(value = "paramsMap12") Map<String, Object> paramsMap12) throws Exception;
    public List<Map<String, Object>>  selectpb_user_nameByNo(@Param(value = "paramsMap13") Map<String, Object> paramsMap13) throws Exception;
    public List<Map<String, Object>>  selectpb_duty_infoByuserNo(@Param(value = "paramsMap14") Map<String, Object> paramsMap14) throws Exception;
    public boolean insertpb_duty_detail(@Param("paramsMap15") Map<String, Object> paramsMap15) throws Exception;
    public boolean Deletepb_duty_infoByDate(@Param("paramsMap16") Map<String, Object> paramsMap16) throws Exception;
    public boolean Deletepb_duty_detailByDate(@Param("paramsMap17") Map<String, Object> paramsMap17) throws Exception;
    public boolean Deletepb_auth_history_monthByDate(@Param("paramsMap18") Map<String, Object> paramsMap18) throws Exception;
    public boolean Deletepb_auth_history_month_avgByDate(@Param("paramsMap19") Map<String, Object> paramsMap19) throws Exception;
    public List<Map<String, Object>> selectpb_auth_history_month_avgBymonth(@Param("paramsMap20") Map<String, Object> paramsMap20) throws Exception;
    public List<Map<String, Object>> selectpb_user_rest_infoByDate(@Param("paramsMap21") Map<String, Object> paramsMap21) throws Exception;
    public boolean updatePb_duty_infoClass_byUserno(@Param("paramsMap22") Map<String, Object> paramsMap22) throws Exception;
    public boolean insertpb_queue_sequence_info(@Param("paramsMap23") Map<String, Object> paramsMap23) throws Exception;
    public List<Map<String, Object>> selectpb_queue_sequence_infoByDate(@Param("paramsMap24") Map<String, Object> paramsMap24) throws Exception;
    public List<Map<String, Object>> selectPb_user_infoByRowNo(@Param("paramsMap25") Map<String, Object> paramsMap25) throws Exception;
    public boolean updatepb_queue_sequence_info(@Param("paramsMap26") Map<String, Object> paramsMap26) throws Exception;
    public List<Map<String, Object>> getpb_dutyNumbyUserno(@Param("paramsMap27") Map<String, Object> paramsMap27) throws Exception;
    public List<Map<String, Object>> getpb_dutyNumbyClassName(@Param("paramsMap28") Map<String, Object> paramsMap28) throws Exception;
    public boolean updatepb_duty_infoByClassName(@Param("paramsMap29") Map<String, Object> paramsMap29) throws Exception;
    public List<Map<String, Object>> getpb_dutyINfobyClassNameAndDate(@Param("paramsMap30") Map<String, Object> paramsMap30) throws Exception;



}
