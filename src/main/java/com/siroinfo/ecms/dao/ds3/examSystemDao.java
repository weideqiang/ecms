//package com.siroinfo.ecms.dao.ds3;
//
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//import java.util.Map;
//
//@Mapper
//public interface examSystemDao {
//    /**
//     * 查询题目列表
//     * @param type          题型
//     * @param busitype      业务类型
//     * @param level         难度
//     * @param title         题目关键字
//     * @param note          备注
//     * @param pageNum       查询页数
//     * @param pageSize      查询笔数
//     * @return
//     * @throws Exception
//     */
//    public List<Map<String, Object>> getQuestionInfo(@Param(value = "type") String type,
//                                        @Param(value = "busitype") String busitype,
//                                        @Param(value = "level") String level,
//                                        @Param(value = "title") String title,
//                                        @Param(value = "note") String note,
//                                        @Param(value = "pageNum") int pageNum,
//                                        @Param(value = "pageSize") int pageSize);
//
//}
//
