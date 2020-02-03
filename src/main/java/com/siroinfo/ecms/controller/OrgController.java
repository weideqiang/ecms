package com.siroinfo.ecms.controller;

import com.siroinfo.ecms.comm.Result;
import com.siroinfo.ecms.comm.ResultGenerator;
import com.siroinfo.ecms.service.SysOrgInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Api(value = "机构管理")
@RequestMapping(value = "/org")
public class OrgController {

    @Autowired
    SysOrgInfoService orgService;

    /**
     * 获取机构信息
     */
    @RequestMapping(value = "/getOrgInfo",method = RequestMethod.POST)
    @ApiOperation(value="机构查询", notes="机构查询")
    public Result getOrgInfo(String orgNo){
        Map<String,Object> resultData = this.orgService.getOrgInfoByNo(orgNo);
        return ResultGenerator.genSuccessResult(resultData);
    }

}
