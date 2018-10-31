package com.lsh.sharding.demo.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project Name: sharding-demo
 * Created by peter on 18/10/30.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Configuration
@MapperScan(basePackages = {"com.lsh.sharding.demo.dao"})
@Slf4j
public class ShardingDataSourceConfig {


    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
