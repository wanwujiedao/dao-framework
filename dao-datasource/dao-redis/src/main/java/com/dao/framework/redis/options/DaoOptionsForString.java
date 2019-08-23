package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
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
    public String set(String key, String value) {
        // 返回结果
        return this.returnResult(this.jedis.set(key, value));
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
    public String set(byte[] key, byte[] value) {
        // 返回结果
        return this.returnResult(this.jedis.set(key, value));
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
    public String setnx(String key, String value) {
        // 返回结果
        return this.returnResult(this.jedis.set(key, value, "nx"));
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
    public String setnx(byte[] key, byte[] value) {
        // 返回结果
        return this.returnResult(this.jedis.set(key, value, "nx".getBytes()));
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
    public String setxx(String key, String value) {
        // 返回结果
        return this.returnResult(this.jedis.set(key, value, "xx"));
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
    public String setxx(byte[] key, byte[] value) {
        // 返回结果
        return this.returnResult(this.jedis.set(key, value, "xx".getBytes()));
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
