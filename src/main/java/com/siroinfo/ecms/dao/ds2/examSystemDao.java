package com.siroinfo.ecms.dao.ds2;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface examSystemDao {

    public List<Map<String, Object>> getQuestionInfoQuanBu();

    /**
     * 查询题目列表
     * @param type          题型
     * @param busitype      业务类型
     * @param level         难度
     * @param title         题目关键字
     * @param note          备注
     * @param currentPage       查询页数
     * @param pageSize      查询笔数
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> getQuestionInfo(@Param(value = "type") String type,
                                                     @Param(value = "busitype") String busitype,
                                                     @Param(value = "level") String level,
                                                     @Param(value = "title") String title,
                                                     @Param(value = "note") String note,
                                                     @Param(value = "currentPage") String currentPage,
                                                     @Param(value = "pageSize") String pageSize);

    /**
     * 获取ID
     * @throws Exception
     */
    public List<Map<String, Object>> selectID(@Param(value = "classInfoMap") Map<String, Object> classInfoMap);

    /**
     * 进行排班列表染色
     * @throws Exception
     */
    public boolean commonInsertMethod(@Param(value = "classInfoMap") Map<String, Object> classInfoMap);

    public boolean commonInsertMethodEFS_EXAM_CHARQUESTION(@Param(value = "classInfoMap") Map<String, Object> classInfoMap);

    public boolean getMaxCharQuestionId(@Param(value = "classInfoMap") Map<String, Object> classInfoMap);

    public boolean addNumQuestion(@Param(value = "id") String id,
                                  @Param(value = "title") String title,
                                  @Param(value = "dataList") String dataList,
                                  @Param(value = "brno") String brno,
                                  @Param(value = "tlrno") String tlrno,
                                  @Param(value = "timestamp") String timestamp);

    /**
     * 进行排班列表染色
     * @throws Exception
     */
    public boolean commonUpdateMethod(@Param(value = "classInfoMap") Map<String, Object> classInfoMap,
                                                        @Param(value = "map") Map<String, Object> map);

    public boolean commonUpdateMethodOne(@Param(value = "classInfoMap") Map<String, Object> classInfoMap,
                                      @Param(value = "map") Map<String, Object> map);

    public boolean cancelPlan(@Param(value = "EXAMID") String EXAMID,
                                         @Param(value = "NOTE") String NOTE);

    public boolean commonUpdateMethodEFS_EXAM_CHARQUESTION(@Param(value = "classInfoMap") Map<String, Object> classInfoMap,
                                                           @Param(value = "map") Map<String, Object> map);

    public List<Map<String, Object>> getTlrTestScoreSailing(@Param(value = "examid") String examid,
                                                     @Param(value = "tlrno") String tlrno);

    public List<Map<String, Object>> getSelectManagerZonenoSailing();

    public List<Map<String, Object>> getNumQuestionTitle();

    public List<Map<String, Object>> getAllPlanInfo();

    public List<Map<String, Object>> getTestPersionInfo(@Param(value = "EXAMID") String EXAMID);

    public boolean updateTestPersionInfo(@Param(value = "EXAMID") String EXAMID);

    public List<Map<String, Object>> submitPlanInfo(@Param(value = "EXAMID") String EXAMID);

    public List<Map<String, Object>> getNumQuestion(@Param(value = "ID") String ID);

    public boolean updateNumQuestion(@Param(value = "DATALISTMY") Map<String, Object> DATALISTMY);

    public boolean insertNumQuestion(@Param(value = "DATALISTMY") Map<String, Object> DATALISTMY,
                                     @Param(value = "BRNO") String BRNO,
                                     @Param(value = "TLRNO") String TLRNO,
                                     @Param(value = "TIMESTAMP") String TIMESTAMP);

    public List<Map<String, Object>> getSelectManagerFromZonenoSailing(@Param(value = "ZONENO") String ZONENO);

    public List<Map<String, Object>> getTradeScoreInfo(@Param(value = "BRNO") String BRNO,
                                                               @Param(value = "TLRNO") String TLRNO,
                                                               @Param(value = "ID") String ID);

    public List<Map<String, Object>> getTlrTestScoreTotalScore(@Param(value = "BRNO") String BRNO,
                                                               @Param(value = "TLRNO") String TLRNO,
                                                               @Param(value = "ID") String ID);

    public List<Map<String, Object>> getEFS_EXAM_TRXPARAM(@Param(value = "TRXNO") String TRXNO);

    public List<Map<String, Object>> getTlrTestDetail(@Param(value = "BRNO") String BRNO,
                                                      @Param(value = "TLRNO") String TLRNO,
                                                      @Param(value = "ID") String ID);

    public List<Map<String, Object>> getMaxNumQuestionId();

    public List<Map<String, Object>> getQuestionInfoOne(@Param(value = "ID") String ID);

    public List<Map<String, Object>> getPlanInfo(@Param(value = "begindate") String begindate,
                                                 @Param(value = "enddate") String enddate,
                                                 @Param(value = "examid") String examid,
                                                 @Param(value = "tlrno") String tlrno,
                                                 @Param(value = "examtype") String examtype);

    public List<Map<String, Object>> getCharQuestionTitle();

    public List<Map<String, Object>> getCharQuestion(@Param(value = "id") String id);

    /**
     * 进行排班列表染色
     * @throws Exception
     */
    public boolean commonDeleteMethod(@Param(value = "classInfoMap") Map<String, Object> classInfoMap);

    //判断是否有策略
    public String  selectMaxIdFromEFS_EXAM_SELECTMANAGER(@Param(value = "ID") String ID) throws Exception;
    //插入EFS_EXAM_SELECTMANAGER
    public boolean insertEFS_EXAM_SELECTMANAGER(@Param("paramsMap") Map<String, Object> paramsMap) throws Exception;
    //插入EFS_EXAM_SELECTSCORE
    public boolean insertEFS_EXAM_SELECTSCORE(@Param("paramsMap1") Map<String, Object> paramsMap1) throws Exception;

    public List<Map<String, Object>> getMaxCharQuestionId();

    //通过地区号获取机构列表
    public List<Map<String, Object>>   getBranchInfoListByZoneNo(@Param(value = "zoneNo") String zoneNo) throws Exception;
    //通过机构号获取学员信息列表
    public List<Map<String, Object>>   getBranchUserInfoByBranch(@Param(value = "branchno") String branchno) throws Exception;
    //通过机用户号+用户姓名获取学员信息列表
    public List<Map<String, Object>>   getBranchUserInfoByIdOrName(@Param(value = "tlrno") String tlrno,@Param(value = "tlrname") String tlrname) throws Exception;
    //查询考试地区01
    public List<Map<String, Object>>   getSelectManagerZoneno() throws Exception;
    //查询考试地区02
    public List<Map<String, Object>>   getTradeSelectZoneno() throws Exception;
    //查询策略01
    public List<Map<String, Object>>   getSelectManagerFromZoneno(String ClResource) throws Exception;
    //查询策略02
    public List<Map<String, Object>>   getTradeSelectFromZoneno(String ClResource) throws Exception;
    //获取策略ID的详细信息
    public List<Map<String, Object>>   getSelectManagerInfo(String id) throws Exception;
    //根据策略id查询交易考试策略信息
    public List<Map<String, Object>>   getTradeSelectManagerInfo(String id) throws Exception;
    //获取考场ID
    public Map<String, Object>   getPlanSeq(String ID) throws Exception;
    //随机获取考题
    public Map<String, Object>   getQuestionByRandomAlgm(Map<String, Object> _map) throws Exception;
    //随机获取交易信息
    public Map<String, Object>   getTradeQuestionByRandomAlgm(Map<String, Object> _map) throws Exception;
    //删除EFS_EXAM_PLANPERSONINFO
    public boolean   deleteEFS_EXAM_PLANPERSONINFO(String ID) throws Exception;
    //插入EFS_EXAM_PLANPERSONINFO
    public boolean   insertEFS_EXAM_PLANPERSONINFO(@Param("parasMap") Map<String, Object> parasMap) throws Exception;
    //删除EFS_EXAM_PLANTESTINFO
    public boolean   deleteEFS_EXAM_PLANTESTINFO(String ID) throws Exception;
    //插入EFS_EXAM_PLANTESTINFO
    public boolean   insertEFS_EXAM_PLANTESTINFO(@Param("parasMap") Map<String, Object> parasMap) throws Exception;
    //插入insertPlanInfo
    public boolean   insertPlanInfo(@Param("parasMap") Map<String, Object> parasMap) throws Exception;
    //根据题目类型，获取该类型最大id
    public String  getMaxQuestionId(@Param(value = "Type") String Type) throws Exception;
    //插入insertEFS_EXAM_BUSIQUESTION
    public boolean   insertEFS_EXAM_BUSIQUESTION(@Param("parasMap") Map<String, Object> parasMap) throws Exception;
    //查询试题数量
    public String  countQuestion(@Param("parasMap") Map<String, Object> parasMap) throws Exception;
    /**
     * 查询题目列表
     * @param type          题型
     * @param busitype      业务类型
     * @param level         难度
     * @param title         题目关键字
     * @param note          备注
     * @param currentPage       查询页数
     * @param pageSize      查询笔数
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> getQuestionInfo1(@Param(value = "type") String type,
                                                      @Param(value = "busitype") String busitype,
                                                      @Param(value = "level") String level,
                                                      @Param(value = "title") String title,
                                                      @Param(value = "note") String note,
                                                      @Param(value = "currentPage") int currentPage,
                                                      @Param(value = "pageSize") int pageSize);
    /**
     * 根据考试人员id、考试日期、考试时间、考试类型获取考试场次信息
     * @param brno
     * @param tlrno
     * @param accdate
     * @param time
     * @param examtype
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> getPlanInfoByAccDate(@Param(value = "brno") String brno,
                                                          @Param(value = "tlrno") String tlrno,
                                                          @Param(value = "accdate") String accdate,
                                                          @Param(value = "time") String time,
                                                          @Param(value = "examtype") String examtype);
    //获取考生指定场次的分数
    public String  getTlrTestScore(@Param(value = "brno") String brno,
                                   @Param(value = "tlrno") String tlrno,
                                   @Param(value = "examid") String examid) throws Exception;
    /**
     * 根据考生编号与考试场次获取题目信息01
     * @param tlrno
     * @param examid
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> getTlrPlanInfo01(@Param(value = "tlrno") String tlrno,
                                                      @Param(value = "examid") String examid);
    /**
     * 根据考生编号与考试场次获取题目信息04
     * @param tlrno
     * @param examid
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> getTlrPlanInfo04(@Param(value = "tlrno") String tlrno,
                                                      @Param(value = "examid") String examid);

}

