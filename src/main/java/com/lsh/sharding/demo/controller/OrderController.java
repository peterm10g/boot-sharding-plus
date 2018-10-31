package com.lsh.sharding.demo.controller;

import com.alibaba.fastjson.JSON;
import com.lsh.sharding.demo.entity.Order;
import com.lsh.sharding.demo.service.SpringPojoService;
import io.shardingsphere.shardingjdbc.jdbc.core.datasource.MasterSlaveDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;


/**
 * Project Name: sharding-demo
 * Created by peter on 18/10/30.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Controller
@Slf4j
public class OrderController {

    @Autowired
    private SpringPojoService springPojoService;

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/order")
    @ResponseBody
    public Order getOrder(){

        for (int i = 0; i < 5; i++) {

            MasterSlaveDataSource ds = (MasterSlaveDataSource)dataSource;
            log.info(JSON.toJSONString(ds.getDataSourceMap().keySet()));
            log.info(JSON.toJSONString(springPojoService.printData()));
        }

        return new Order();
    }
}
