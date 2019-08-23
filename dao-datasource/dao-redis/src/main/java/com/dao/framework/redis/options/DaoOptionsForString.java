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
     * @param key   键
     * @param value 值
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean set(String key, String value) {
        // 返回结果
        return this.returnResult(DaoStringUtils.equals(DaoConstantsUtils.OK, this.jedis.set(key, value)));
    }

    /**
     * 只有key 不存在时才把key value set 到redis
     *
     * @param key   键
     * @param value 值
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean setnx(String key, String value) {
        // 返回结果
        return this.returnResult(DaoStringUtils.equals(DaoConstantsUtils.OK, this.jedis.set(key, value, "nx")));
    }

    /**
     * 只有 key 存在是，才把key value set 到redis
     *
     * @param key   键
     * @param value 值
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean setxx(String key, String value) {
        // 返回结果
        return dealResult(this.jedis.set(key, value, "xx"));
    }

    /**
     * 设置值
     *
     * @param key   键
     * @param value 值
     * @param ttl   过期时间
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean set(String key, String value, int ttl) {
        // 结果处理
        return dealExpireResult(this.jedis.set(key, value), key, ttl);
    }

    /**
     * 只有key 不存在时才把key value set 到redis
     *
     * @param key   键
     * @param value 值
     * @param ttl   过期时间
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean setnx(String key, String value, int ttl) {
        // 结果处理
        return dealExpireResult(this.jedis.set(key, value, "nx"), key, ttl);
    }

    /**
     * 只有 key 存在是，才把key value set 到redis
     *
     * @param key   键
     * @param value 值
     * @param ttl   过期时间
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean setxx(String key, String value, int ttl) {

        // 结果处理
        return dealExpireResult(this.jedis.set(key, value, "xx"), key, ttl);
    }

    /**
     * 获取 redis 键的值
     *
     * @param key
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public String get(String key) {
        // 返回结果
        return this.returnResult(this.jedis.get(key));
    }


    /**
     * 设置值
     *
     * @param key   键
     * @param value 值
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean set(byte[] key, byte[] value) {
        // 返回结果
        return this.returnResult(DaoStringUtils.equals(DaoConstantsUtils.OK, this.jedis.set(key, value)));
    }

    /**
     * 只有key 不存在时才把key value set 到redis
     *
     * @param key   键
     * @param value 值
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean setnx(byte[] key, byte[] value) {
        // 返回结果
        return this.returnResult(DaoStringUtils.equals(DaoConstantsUtils.OK, this.jedis.set(key, value, "nx".getBytes())));
    }

    /**
     * 只有 key 存在是，才把key value set 到redis
     *
     * @param key   键
     * @param value 值
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean setxx(byte[] key, byte[] value) {
        // 返回结果
        return dealResult(this.jedis.set(key, value, "xx".getBytes()));
    }

    /**
     * 设置值
     *
     * @param key   键
     * @param value 值
     * @param ttl   过期时间
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean set(byte[] key, byte[] value, int ttl) {
        // 结果处理
        return dealExpireResult(this.jedis.set(key, value), key, ttl);
    }

    /**
     * 只有key 不存在时才把key value set 到redis
     *
     * @param key   键
     * @param value 值
     * @param ttl   过期时间
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean setnx(byte[] key, byte[] value, int ttl) {
        // 结果处理
        return dealExpireResult(this.jedis.set(key, value, "nx".getBytes()), key, ttl);
    }

    /**
     * 只有 key 存在是，才把key value set 到redis
     *
     * @param key   键
     * @param value 值
     * @param ttl   过期时间
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public boolean setxx(byte[] key, byte[] value, int ttl) {
        // 结果处理
        return dealExpireResult(this.jedis.set(key, value, "xx".getBytes()), key, ttl);
    }

    /**
     * 获取 redis 键的值
     *
     * @param key
     * @return byte[]
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public byte[] get(byte[] key) {
        // 返回结果
        return this.returnResult(this.jedis.get(key));
    }
}
