package com.dao.framework.redis.abstracts;

import com.dao.framework.redis.annos.DaoRedisSelect;
import com.dao.framework.redis.conf.DaoRedisFactory;
import com.wwjd.framework.utils.DaoConstantsUtils;
import com.wwjd.framework.utils.DaoStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

/**
 * 抽象操作类
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-22 15:21:00
 */
public abstract class AbstractDaoRedisOptions {
    /**
     * 当前使用的 jedis 对象
     */
    protected Jedis jedis;

    /**
     * 自动注入jedis 工厂类
     */
    @Autowired
    private DaoRedisFactory daoRedisFactory;

    /**
     * 操作之前获取 jedis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @return void
     */
    protected void beforOptions(DaoRedisSelect annotation,int database) throws Exception {
        // 若注解不存在
        if(annotation==null){
            throw new Exception("Please add annotation:DaoRedisSelect");
        }
        // 先获取注解对象
        this.jedis=daoRedisFactory.getJedis(annotation.key(),database< DaoConstantsUtils.ZERO ?annotation.database():database);
    }

    /**
     * 操作结束之后关闭 jedis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @return void
     */
    protected void afterOptions() {
        if(jedis!=null) {
            jedis.close();
        }
    }

    /**
     * 设置过期时间
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param ttl 过期世间
     * @return boolean
     */
    public boolean expire(String key,int ttl){
        // 设置过期时间
        Long expire = this.jedis.expire(key, ttl);
        // 结果判断
        return DaoStringUtils.equals(DaoConstantsUtils.L_ONE,expire);
    }


    /**
     * 设置过期时间
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param ttl 过期世间
     * @return boolean
     */
    public boolean expire(byte[] key,int ttl){
        // 设置过期时间
        Long expire = this.jedis.expire(key, ttl);
        // 结果判断
        return DaoStringUtils.equals(DaoConstantsUtils.L_ONE,expire);
    }

    /**
     * 处理过期时间的结果
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param rs 结果
     * @param key 键
     * @param ttl 过期时间
     * @return boolean
     */
    protected boolean dealExpireResult(String rs,String key,int ttl){
        // 结果比较
        boolean status = DaoStringUtils.equals(DaoConstantsUtils.OK, rs);
        // 成功则设置过期时间
        if(status) {
            status = this.expire(key, ttl);
        }
        // 收尾工作
        afterOptions();
        // 返回结果
        return status;
    }


    /**
     * 处理过期时间的结果
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param rs 结果
     * @param key 键
     * @param ttl 过期时间
     * @return boolean
     */
    protected boolean dealExpireResult(String rs,byte[] key,int ttl){
        // 结果比较
        boolean status = DaoStringUtils.equals(DaoConstantsUtils.OK, rs);
        // 成功则设置过期时间
        if(status) {
            status = this.expire(key, ttl);
        }
        // 收尾工作
        afterOptions();
        // 返回结果
        return status;
    }

    /**
     * 处理结果
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param rs 结果
     * @return boolean
     */
    protected boolean dealResult(String rs){
        // 收尾工作
        afterOptions();
        // 返回结果
        return  DaoStringUtils.equals(DaoConstantsUtils.OK, rs);
    }


    /**
     * 返回结果
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param rs 结果
     * @return boolean
     */
    protected <T> T returnResult(T rs){
        // 收尾工作
        afterOptions();
        // 返回结果
        return  rs;
    }
}
