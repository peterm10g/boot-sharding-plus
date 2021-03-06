package com.lsh.sharding.demo.controller;


import com.lsh.sharding.demo.dto.ConfigDTO;
import com.lsh.sharding.demo.entity.Config;
import com.lsh.sharding.demo.entity.Order;
import com.lsh.sharding.demo.service.IBusiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author peter123
 * @since 2018-10-31
 */
@RestController
@RequestMapping("/config")
@Slf4j
public class ConfigController {

    @Autowired
    private IBusiService busiService;

    @RequestMapping("/add")
    public boolean addConfig(@RequestBody ConfigDTO configDTO){

        log.info(configDTO.toString());
        Config config = new Config();
        BeanUtils.copyProperties(configDTO,config);

        config.setIsValid(1);
        config.setStatus(2);
//        log.info(config.toString());
//        configService.insert(config);

        Order order = new Order();

        order.setOrderId(212);
        order.setUserId(665);
        order.setStatus("insertandinse nsertandinse nsertandinse");

        busiService.addOrderAndConfig(config,order);

        return true;
    }
}

