package com.dao.framework.test.redis.pubsub;

import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPubSub;

/**
 * 我的发布订阅
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-29 10:37:00
 */
@Component
public class MyPubSub extends JedisPubSub {
    public MyPubSub() {

    }

    @Override
    public void onMessage(String channel, String message) {
        System.out.println(String.format("receive redis published message, channel %s, message %s", channel, message));
    }

    @Override
    public void onUnsubscribe(String channel, int subscribedChannels) {
        System.out.println(String.format("subscribe redis channel success, channel %s, subscribedChannels %d",
                channel, subscribedChannels));
    }

    @Override
    public void onSubscribe(String channel, int subscribedChannels) {
        System.out.println(String.format("subscribe redis channel success, channel %s, subscribedChannels %d",
                channel, subscribedChannels));
    }
}
