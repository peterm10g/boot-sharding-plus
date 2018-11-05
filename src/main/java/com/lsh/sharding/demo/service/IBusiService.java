package com.lsh.sharding.demo.service;

import com.lsh.sharding.demo.entity.Config;
import com.lsh.sharding.demo.entity.Order;

/**
 * Project Name: boot-sharding-plus
 * Created by peter on 18/11/5.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */

public interface IBusiService {

    int addOrderAndConfig(Config config, Order order);

}
