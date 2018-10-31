package com.lsh.sharding.demo.service.impl;

import com.lsh.sharding.demo.entity.Config;
import com.lsh.sharding.demo.dao.ConfigMapper;
import com.lsh.sharding.demo.service.IConfigService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author peter123
 * @since 2018-10-31
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements IConfigService {

}
