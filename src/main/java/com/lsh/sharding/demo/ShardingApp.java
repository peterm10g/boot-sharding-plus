package com.lsh.sharding.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lsh.sharding.demo.repository")
public class ShardingApp {

    public static void main(String[] args) {
//        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(ShardingApp.class, args)) {
//            process(applicationContext);
//        }

        SpringApplication.run(ShardingApp.class, args);
    }


//    private static void process(final ConfigurableApplicationContext applicationContext) {
//        CommonService commonService = getCommonService(applicationContext);
//        commonService.initEnvironment();
////        commonService.processSuccess();
//        try {
////            commonService.processFailure();
//        } catch (final Exception ex) {
//            System.out.println(ex.getMessage());
//            commonService.printData();
//        } finally {
////            commonService.cleanEnvironment();
//        }
//    }
//
//    private static CommonService getCommonService(final ConfigurableApplicationContext applicationContext) {
//        return applicationContext.getBean(SpringPojoService.class);
//    }
}
