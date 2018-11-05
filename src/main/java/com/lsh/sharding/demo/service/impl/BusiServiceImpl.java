package com.lsh.sharding.demo.service.impl;

import com.lsh.sharding.demo.entity.Config;
import com.lsh.sharding.demo.entity.Order;
import com.lsh.sharding.demo.service.IBusiService;
import com.lsh.sharding.demo.service.IConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Project Name: boot-sharding-plus
 * Created by peter on 18/11/5.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Service
@Transactional
public class BusiServiceImpl implements IBusiService {

    @Autowired
    private IConfigService configService;

    @Autowired
    private SpringPojoServiceImpl springPojoService;


    @Override
    public int addOrderAndConfig(Config config, Order order) {

        configService.insert(config);

        springPojoService.addOrder(order);

        return 1;
    }
}
