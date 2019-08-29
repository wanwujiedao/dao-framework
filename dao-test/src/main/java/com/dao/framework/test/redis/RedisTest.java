package com.dao.framework.test.redis;

import com.dao.framework.redis.abstracts.AbstractDaoRedisTemplate;
import com.dao.framework.test.redis.pubsub.MyPubSub;
import com.dao.framework.test.redis.pubsub.Subscribe;
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

    @Autowired
    private MyPubSub myPubSub;

    @Override
    public void afterPropertiesSet() throws Exception {
       new Thread(new Subscribe(redisTemplate,myPubSub,"dao-channel")).start();
        int count=0;
        while (count++<10){
            Thread.sleep(100);
            redisTemplate.hash().hset("dao-channel",count+"","message"+count);
            redisTemplate.pubSub().publish("dao-channel","message"+count);
        }
    }
}


