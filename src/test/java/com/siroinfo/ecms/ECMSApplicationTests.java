package com.siroinfo.ecms;
import com.siroinfo.ecms.model.SysUserInfoModel;
import com.siroinfo.ecms.service.SysUserInfoService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ECMSApplicationTests {
    @Autowired
    SysUserInfoService userService;

    @Test
    public void contextLoads() {
    	SysUserInfoModel user = this.userService.getUserByNo("1");
    }

}

