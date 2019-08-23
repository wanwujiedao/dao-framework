package com.dao.framework.redis.conf;

import com.wwjd.framework.utils.DaoConstantsUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * redis 抽象工厂类
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-21 14:45:00
 */
public  class DaoRedisFactory {
    /**
     * 存储 jedis
     */
    private volatile  Map<String, JedisPool> mapJedis = new ConcurrentHashMap<>();

    /**
     * 获取 jedis
     *
     * @author 阿导
     * @time 2019/8/21 :00
     * @param key
     * @return redis.clients.jedis.Jedis
     */
    public  Jedis getJedis(String key,int database) throws Exception {
        // 检查配置
        if(mapJedis.isEmpty()){
            throw new Exception("if you want to use jedis.Please check your configuration first!");
        }
        // 从 map 获取
        JedisPool jedisPool = mapJedis.getOrDefault(key, null);
        // 若没查询到
        if(jedisPool == null){
            throw new Exception("jedis not find.The key is ".concat(key));
        }
        // 获取操作具体类
        Jedis resource = jedisPool.getResource();
        // 判断数据源是否合理
        if(database>= DaoConstantsUtils.ZERO){
            resource.select(database);
        }
        // 返回结果
        return resource;
    }

    public void setMapJedis(Map<String, JedisPool> mapJedis) {
        this.mapJedis = mapJedis;
    }
}
