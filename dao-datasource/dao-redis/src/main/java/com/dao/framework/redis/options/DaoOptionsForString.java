package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import com.wwjd.framework.utils.DaoConstantsUtils;
import com.wwjd.framework.utils.DaoStringUtils;
import org.springframework.stereotype.Component;

/**
 * redis 操作字符串
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-22 15:25:00
 */
@Component
public class DaoOptionsForString extends AbstractDaoRedisOptions {



    /**
     * 设置值
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @return boolean
     */
    public boolean set(String key,String value){
        String rs = this.jedis.set(key, value);
        afterOptions();
        return DaoStringUtils.equals(DaoConstantsUtils.OK,rs);
    }

    /**
     * 只有key 不存在时才把key value set 到redis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @return boolean
     */
    public boolean setnx(String key,String value){
        String rs = this.jedis.set(key, value,"nx");
        afterOptions();
        return DaoStringUtils.equals(DaoConstantsUtils.OK,rs);
    }
    /**
     * 只有 key 存在是，才把key value set 到redis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @return boolean
     */
    public boolean setxx(String key,String value){
        // redis 操作
        String rs = this.jedis.set(key, value,"xx");
        // 返回结果
        return dealResult(rs);
    }

    /**
     * 设置值
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @param ttl 过期时间
     * @return boolean
     */
    public boolean set(String key,String value,int ttl){
        // redis 操作
        String rs = this.jedis.set(key, value);
        // 结果处理
        return  dealExpireResult(rs,key,ttl);
    }

    /**
     * 只有key 不存在时才把key value set 到redis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @param ttl 过期时间
     * @return boolean
     */
    public boolean setnx(String key,String value,int ttl){
        // redis 操作
        String rs = this.jedis.set(key, value,"nx");
        // 结果处理
        return  dealExpireResult(rs,key,ttl);
    }
    /**
     * 只有 key 存在是，才把key value set 到redis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @param ttl 过期时间
     * @return boolean
     */
    public boolean setxx(String key,String value,int ttl){
        // redis 操作
        String rs = this.jedis.set(key, value,"xx");
        // 结果处理
        return  dealExpireResult(rs,key,ttl);
    }

    /**
     * 获取 redis 键的值
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key
     * @return java.lang.String
     */
    public String get(String key){
        // 获取值
        String rs = this.jedis.get(key);
        // 返回结果
        return this.returnResult(rs);
    }






    /**
     * 设置值
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @return boolean
     */
    public boolean set(byte[] key,byte[] value){
        String rs = this.jedis.set(key, value);
        afterOptions();
        return DaoStringUtils.equals(DaoConstantsUtils.OK,rs);
    }

    /**
     * 只有key 不存在时才把key value set 到redis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @return boolean
     */
    public boolean setnx(byte[] key,byte[] value){
        String rs = this.jedis.set(key, value,"nx".getBytes());
        afterOptions();
        return DaoStringUtils.equals(DaoConstantsUtils.OK,rs);
    }
    /**
     * 只有 key 存在是，才把key value set 到redis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @return boolean
     */
    public boolean setxx(byte[] key,byte[] value){
        // redis 操作
        String rs = this.jedis.set(key, value,"xx".getBytes());
        // 返回结果
        return dealResult(rs);
    }

    /**
     * 设置值
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @param ttl 过期时间
     * @return boolean
     */
    public boolean set(byte[] key,byte[] value,int ttl){
        // redis 操作
        String rs = this.jedis.set(key, value);
        // 结果处理
        return  dealExpireResult(rs,key,ttl);
    }

    /**
     * 只有key 不存在时才把key value set 到redis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @param ttl 过期时间
     * @return boolean
     */
    public boolean setnx(byte[] key,byte[] value,int ttl){
        // redis 操作
        String rs = this.jedis.set(key, value,"nx".getBytes());
        // 结果处理
        return  dealExpireResult(rs,key,ttl);
    }
    /**
     * 只有 key 存在是，才把key value set 到redis
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key 键
     * @param value 值
     * @param ttl 过期时间
     * @return boolean
     */
    public boolean setxx(byte[] key,byte[] value,int ttl){
        // redis 操作
        String rs = this.jedis.set(key, value,"xx".getBytes());
        // 结果处理
        return  dealExpireResult(rs,key,ttl);
    }

    /**
     * 获取 redis 键的值
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param key
     * @return byte[]
     */
    public byte[] get(byte[] key){
        // 获取值
        byte[] rs = this.jedis.get(key);
        // 返回结果
        return this.returnResult(rs);
    }
}
