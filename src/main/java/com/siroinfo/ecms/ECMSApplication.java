package com.siroinfo.ecms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = {"com.siroinfo"})
@EnableTransactionManagement    //开启事务
public class ECMSApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(ECMSApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(ECMSApplication.class);
    }

    @RequestMapping("/hello")
    public String demo1() {
        return "Hello SpringBoot";
    }


}

