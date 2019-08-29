package com.dao.framework.test.redis.pubsub;

import com.dao.framework.redis.abstracts.AbstractDaoRedisTemplate;
import redis.clients.jedis.JedisPubSub;

/**
 * 接受消息
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-29 10:57:00
 */
public class Subscribe implements Runnable {

    private AbstractDaoRedisTemplate daoRedisTemplate;
    private JedisPubSub jedisPubSub;
    private String channel;

    public Subscribe(AbstractDaoRedisTemplate daoRedisTemplate, JedisPubSub jedisPubSub, String channel) {
        this.daoRedisTemplate = daoRedisTemplate;
        this.jedisPubSub = jedisPubSub;
        this.channel = channel;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            this.daoRedisTemplate.pubSub().subscribe(this.jedisPubSub,this.channel);
            this.daoRedisTemplate.pubSub().psubscribe(this.jedisPubSub,this.channel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
