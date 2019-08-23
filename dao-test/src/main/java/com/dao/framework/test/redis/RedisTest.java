package com.dao.framework.test.redis;

import com.dao.framework.redis.abstracts.AbstractDaoRedisTemplate;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 测试 redis
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-21 17:32:00
 */
@Component
public class RedisTest implements InitializingBean {

    @Autowired
    private AbstractDaoRedisTemplate redisTemplate;
//    @Autowired
//    private AbstractDaoRedisTemplate daoRedisTemplate;

    @Autowired
    private AbstractDaoRedisTemplate redisTemplateOne;
    @Override
    public void afterPropertiesSet() throws Exception {
        redisTemplate.optionsForString().set("lll".getBytes(),"111".getBytes(),1000);
        redisTemplate.optionsForString().setnx("ppp".getBytes(),"222".getBytes(),1000);
        redisTemplate.optionsForString().setxx("yyy".getBytes(),"333".getBytes(),1000);
//        daoRedisTemplate.optionsForString().set("dao","典狱");
    }
}
