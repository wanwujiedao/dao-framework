package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import redis.clients.jedis.BinaryJedisPubSub;
import redis.clients.jedis.JedisPubSub;

import java.util.List;
import java.util.Map;

/**
 * redis 发布订阅
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-27 15:20:00
 */
public class DaoOptionsForPubSub  extends AbstractDaoRedisOptions {
    /**
     * 订阅一个或多个符合给定模式的频道
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param jedisPubSub 发布订阅抽象类
     * @param patterns 规则
     * @return void
     */
    public void psubscribe(JedisPubSub jedisPubSub, String... patterns){
        this.jedis.psubscribe(jedisPubSub,patterns);
        this.voidResult();
    }
    /** 
     *  订阅一个或多个符合给定模式的频道
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param binaryJedisPubSub 二进制发布订阅抽象类
     * @param patterns 规则
     * @return void
     */
    public void psubscribe(BinaryJedisPubSub binaryJedisPubSub, byte[]... patterns){
        this.jedis.psubscribe(binaryJedisPubSub,patterns);
        this.voidResult();
    }

    /** 
     * 将信息发送到指定的频道
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param channel 频道
     * @param message 消息
     * @return java.lang.Long
     */
    public Long publish(String channel, String message){
        return this.returnResult(this.jedis.publish(channel, message));
    }

    /**
     * 将信息发送到指定的频道
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param channel 频道
     * @param message 消息
     * @return java.lang.Long
     */
    public Long publish(byte[] channel, byte[] message){
        return this.returnResult(this.jedis.publish(channel, message));
    }
    /** 
     * 订阅给定的一个或多个频道的信息
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param jedisPubSub 发布订阅抽象类
     * @param channels 频道
     * @return void
     */
    public void subscribe(JedisPubSub jedisPubSub, String... channels){
        this.jedis.subscribe(jedisPubSub, channels);
        this.voidResult();
    }
    /**
     * 订阅给定的一个或多个频道的信息
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param binaryJedisPubSub 二进制发布订阅抽象类
     * @param channels 频道
     * @return void
     */
    public void subscribe(BinaryJedisPubSub binaryJedisPubSub, byte[]... channels){
        this.jedis.subscribe(binaryJedisPubSub, channels);
        this.voidResult();
    }
    /** 
     * 获取符合规则的活跃状态的频道
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param pattern 规则
     * @return java.util.List<java.lang.String>
     */
    public List<String> pubsubChannels(String pattern){
        return this.returnResult(this.jedis.pubsubChannels(pattern));
    }
    /** 
     * 返回给定频道的订阅者数量， 订阅模式的客户端不计算在内
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param channels 频道
     * @return java.util.List<java.lang.String>
     */
    public Map<String,String> pubsubNumSub(String... channels){
        return this.returnResult(this.jedis.pubsubNumSub(channels));
    }
    /** 
     * 返回订阅模式的数量。
     *
     * 注意， 这个命令返回的不是订阅模式的客户端的数量， 而是客户端订阅的所有模式的数量总和
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.Long
     */
    public Long pubsubNumPat(){
        return this.returnResult(this.jedis.pubsubNumPat());
    }

}
