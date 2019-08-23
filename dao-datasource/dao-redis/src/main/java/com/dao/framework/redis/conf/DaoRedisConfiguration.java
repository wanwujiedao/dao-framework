package com.dao.framework.redis.conf;

import com.wwjd.framework.utils.DaoCollectionUtils;
import com.wwjd.framework.utils.DaoOtherUtils;
import com.wwjd.framework.utils.DaoStringUtils;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * redis 配置类
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-21 14:32:00
 */
public class DaoRedisConfiguration {

    /**
     *  注入配置
     */
    @Resource
    private DaoRedisProperties daoRedisProperties;


    /**
     * 获取 jedis
     *
     * @author 阿导
     * @time 2019/8/21 :00
     * @return redis.clients.jedis.Jedis
     */
    @Bean
    public DaoRedisFactory daoRedisFactory(){
        DaoRedisFactory daoRedisFactory = new DaoRedisFactory();
        if(daoRedisProperties == null){
            return daoRedisFactory;
        }
        Map<String, JedisPool> mapJedis = new ConcurrentHashMap<>();

        if(DaoStringUtils.isNotEmpty(daoRedisProperties.getHost())){
           DaoRedisProperties.Config config = new DaoRedisProperties.Config();
           config.setHost(daoRedisProperties.getHost());
           config.setPort(daoRedisProperties.getPort());
           config.setTimeout(daoRedisProperties.getTimeout());
           config.setPassword(daoRedisProperties.getPassword());
           config.setDatabase(daoRedisProperties.getDatabase());
           config.setMaxTotal(daoRedisProperties.getMaxTotal());
           config.setMaxIdle(daoRedisProperties.getMaxIdle());
           config.setMinIdle(daoRedisProperties.getMinIdle());
           mapJedis.put("",getJedis(config));
       }
       if(DaoCollectionUtils.isNotEmpty(daoRedisProperties.getConfig())){
           daoRedisProperties.getConfig().forEach((key,config)-> {
               if(DaoStringUtils.isNotEmpty(config.getHost())) {
                   mapJedis.put(key, getJedis(daoRedisProperties.getConfig().get(key)));
               }
           });
        }
       daoRedisFactory.setMapJedis(mapJedis);
       return daoRedisFactory;
    }

    private JedisPool getJedis(DaoRedisProperties.Config config) {
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        poolConfig.setMaxTotal(config.getMaxTotal());
        poolConfig.setMaxIdle(config.getMaxIdle());
        poolConfig.setMinIdle(config.getMinIdle());
        return new JedisPool(poolConfig,config.getHost(),config.getPort(),config.getTimeout(), DaoOtherUtils.getSelfOrNull(config.getPassword()),config.getDatabase());
    }

}
