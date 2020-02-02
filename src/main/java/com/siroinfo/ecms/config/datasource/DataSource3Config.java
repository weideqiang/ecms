package com.siroinfo.ecms.config.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
//@MapperScan(basePackages = "com.siroinfo.ecms.dao.ds3", sqlSessionTemplateRef  = "ds3SqlSessionTemplate")
public class DataSource3Config {

//    @Bean(name = "ds3DataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.db3")
//    public DataSource testDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "ds3SqlSessionFactory")
//    public SqlSessionFactory testSqlSessionFactory(@Qualifier("ds3DataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/ds3/*.xml"));
//        return bean.getObject();
//    }
//
//    @Bean(name = "ds3TransactionManager")
//    public DataSourceTransactionManager testTransactionManager(@Qualifier("ds3DataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean(name = "ds3SqlSessionTemplate")
//    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("ds3SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }

}