package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import redis.clients.jedis.BinaryJedisPubSub;
import redis.clients.jedis.JedisPubSub;

/**
 * redis 发布订阅
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-27 15:20:00
 */
public class DaoOptionsForPubSub  extends AbstractDaoRedisOptions {
    public void psubscribe(JedisPubSub jedisPubSub, String... patterns){
        this.jedis.psubscribe(jedisPubSub,patterns);
        this.voidResult();
    }

    public void psubscribe(BinaryJedisPubSub binaryJedisPubSub, byte[]... patterns){
        this.jedis.psubscribe(binaryJedisPubSub,patterns);
        this.voidResult();
    }

//todo

//    public void publish(){
//
//        return this.returnResult(this.jedis.publish());
//    }
//
//    public void subscribe(){
//        return this.returnResult(this.jedis.subscribe(););
//    }
//
//    public void ss(){
//        this.jedis.pubsubChannels()
//
//    }
}
