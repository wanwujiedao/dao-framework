package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import org.springframework.stereotype.Component;

import java.util.List;

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

    /**
     * 返回 key 中字符串值的子字符
     *
     * @param key         键
     * @param startOffset 开始偏移量
     * @param endOffset   结束偏移量
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public String getrange(String key, long startOffset, long endOffset) {
        return this.returnResult(this.jedis.getrange(key, startOffset, endOffset));
    }

    /**
     * 返回 key 中字符串值的子字符
     *
     * @param key         键
     * @param startOffset 开始偏移量
     * @param endOffset   结束偏移量
     * @return byte[]
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public byte[] getrange(byte[] key, long startOffset, long endOffset) {
        return this.returnResult(this.jedis.getrange(key, startOffset, endOffset));
    }

    /**
     * 将给定 key 的值设为 value ，并返回 key 的旧值(old value)
     *
     * @param key
     * @param newValue
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public String getSet(String key, String newValue) {
        return this.returnResult(this.jedis.getSet(key, newValue));
    }

    /**
     * 将给定 key 的值设为 value ，并返回 key 的旧值(old value)
     *
     * @param key
     * @param newValue
     * @return byte[]
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public byte[] getSet(byte[] key, byte[] newValue) {
        return this.returnResult(this.jedis.getSet(key, newValue));
    }

    /**
     * 对 key 所储存的字符串值，获取指定偏移量上的位
     *
     * @param key    键
     * @param offset 偏移量
     * @return java.lang.Boolean
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Boolean getbit(String key, long offset) {
        return this.returnResult(this.jedis.getbit(key, offset));
    }

    /**
     * 对 key 所储存的字符串值，获取指定偏移量上的位
     *
     * @param key    键
     * @param offset 偏移量
     * @return java.lang.Boolean
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Boolean getbit(byte[] key, long offset) {
        return this.returnResult(this.jedis.getbit(key, offset));
    }

    /**
     * 获取所有(一个或多个)给定 key 的值
     *
     * @param keys 键
     * @return java.util.List<java.lang.String>
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public List<String> mget(String... keys) {
        return this.returnResult(this.jedis.mget(keys));
    }

    /**
     * 获取所有(一个或多个)给定 key 的值
     *
     * @param keys 键
     * @return java.util.List<byte [ ]>
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public List<byte[]> mget(byte[]... keys) {
        return this.returnResult(this.jedis.mget(keys));
    }

    /**
     * 对 key 所储存的字符串值，设置或清除指定偏移量上的位(bit)
     *
     * @param key    键
     * @param offset 偏移量
     * @param value  值
     * @return java.lang.Boolean
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Boolean setbit(String key, long offset, String value) {
        return this.returnResult(this.jedis.setbit(key, offset, value));
    }

    /**
     * 对 key 所储存的字符串值，设置或清除指定偏移量上的位(bit)
     *
     * @param key    键
     * @param offset 偏移量
     * @param value  值
     * @return java.lang.Boolean
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Boolean setbit(String key, long offset, Boolean value) {
        return this.returnResult(this.jedis.setbit(key, offset, value));
    }

    /**
     * 对 key 所储存的字符串值，设置或清除指定偏移量上的位(bit)
     *
     * @param key    键
     * @param offset 偏移量
     * @param value  值
     * @return java.lang.Boolean
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Boolean setbit(byte[] key, long offset, byte[] value) {
        return this.returnResult(this.jedis.setbit(key, offset, value));
    }

    /**
     * 对 key 所储存的字符串值，设置或清除指定偏移量上的位(bit)
     *
     * @param key    键
     * @param offset 偏移量
     * @param value  值
     * @return java.lang.Boolean
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Boolean setbit(byte[] key, long offset, Boolean value) {
        return this.returnResult(this.jedis.setbit(key, offset, value));
    }

    /**
     * 将值 value 关联到 key ，并将 key 的过期时间设为 seconds (以秒为单位)
     *
     * @param key   键
     * @param ttl   秒
     * @param value 值
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public String setEx(String key, int ttl, String value) {
        return this.returnResult(this.jedis.setex(key, ttl, value));
    }

    /**
     * 将值 value 关联到 key ，并将 key 的过期时间设为 seconds (以秒为单位)
     *
     * @param key   键
     * @param ttl   秒
     * @param value 值
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public String setEx(byte[] key, int ttl, byte[] value) {
        return this.returnResult(this.jedis.setex(key, ttl, value));
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
    public Long setnx(String key, String value) {
        // 返回结果
        return this.returnResult(this.jedis.setnx(key, value));
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
    public Long setnx(byte[] key, byte[] value) {
        // 返回结果
        return this.returnResult(this.jedis.setnx(key, value));
    }

    /**
     * 用 value 参数覆写给定 key 所储存的字符串值，从偏移量 offset 开始
     *
     * @param key    键
     * @param offset 偏移量
     * @param value  值
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Long setrange(String key, long offset, String value) {
        return this.returnResult(this.jedis.setrange(key, offset, value));
    }

    /**
     * 用 value 参数覆写给定 key 所储存的字符串值，从偏移量 offset 开始
     *
     * @param key    键
     * @param offset 偏移量
     * @param value  值
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Long setrange(byte[] key, long offset, byte[] value) {
        return this.returnResult(this.jedis.setrange(key, offset, value));
    }

    /**
     * 返回 key 所储存的字符串值的长度
     *
     * @param key 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Long strlen(String key) {
        return this.returnResult(this.jedis.strlen(key));
    }

    /**
     * 返回 key 所储存的字符串值的长度
     *
     * @param key 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Long strlen(byte[] key) {
        return this.returnResult(this.jedis.strlen(key));
    }

    /**
     * 同时设置一个或多个 key-value 对
     *
     * @param keysvalues 键值对，比如 "name","小米","age",20
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public String mset(String... keysvalues) {
        return this.returnResult(this.jedis.mset(keysvalues));
    }

    /**
     * 同时设置一个或多个 key-value 对
     *
     * @param keysvalues 键值对，比如 "name","小米","age",20
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public String mset(byte[]... keysvalues) {
        return this.returnResult(this.jedis.mset(keysvalues));
    }

    /**
     * 同时设置一个或多个 key-value 对，当且仅当所有给定 key 都不存在
     *
     * @param keysvalues 键值对，比如 "name","小米","age",20
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Long msetnx(String... keysvalues) {
        return this.returnResult(this.jedis.msetnx(keysvalues));
    }

    /**
     * 同时设置一个或多个 key-value 对，当且仅当所有给定 key 都不存在
     *
     * @param keysvalues 键值对，比如 "name","小米","age",20
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public Long msetnx(byte[]... keysvalues) {
        return this.returnResult(this.jedis.msetnx(keysvalues));
    }

    /**
     * 这个命令和 SETEX 命令相似，但它以毫秒为单位设置 key 的生存时间，而不是像 SETEX 命令那样，以秒为单位
     *
     * @param key   键
     * @param ttl   生存时间
     * @param value 值
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public String psetex(String key, long ttl, String value) {
        return this.returnResult(this.jedis.psetex(key, ttl, value));
    }

    /**
     * 这个命令和 SETEX 命令相似，但它以毫秒为单位设置 key 的生存时间，而不是像 SETEX 命令那样，以秒为单位
     *
     * @param key   键
     * @param ttl   生存时间
     * @param value 值
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/26 :00
     */
    public String psetex(byte[] key, long ttl, byte[] value) {
        return this.returnResult(this.jedis.psetex(key, ttl, value));
    }

    /**
     * 将 key 中储存的数字值增一
     *
     * @param key 键
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long incr(String key) {
        return this.returnResult(this.jedis.incr(key));
    }

    /**
     * 将 key 中储存的数字值增一
     *
     * @param key 键
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long incr(byte[] key) {
        return this.returnResult(this.jedis.incr(key));
    }

    /**
     * 将 key 所储存的值加上给定的增量值（increment
     *
     * @param key       键
     * @param increment 增量
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long incrBy(String key, long increment) {
        return this.returnResult(this.jedis.incrBy(key, increment));
    }

    /**
     * 将 key 所储存的值加上给定的增量值（increment
     *
     * @param key       键
     * @param increment 增量
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long incrBy(byte[] key, long increment) {
        return this.returnResult(this.jedis.incrBy(key, increment));
    }

    /**
     * 将 key 所储存的值加上给定的浮点增量值（increment）
     *
     * @param key       键
     * @param increment 增量
     * @return java.lang.Double
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Double incrByFloat(String key, double increment) {
        return this.returnResult(this.jedis.incrByFloat(key, increment));
    }

    /**
     * 将 key 所储存的值加上给定的浮点增量值（increment）
     *
     * @param key       键
     * @param increment 增量
     * @return java.lang.Double
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Double incrByFloat(byte[] key, double increment) {
        return this.returnResult(this.jedis.incrByFloat(key, increment));
    }

    /**
     * 将 key 中储存的数字值减一
     *
     * @param key 键
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long decr(String key) {
        return this.returnResult(this.jedis.decr(key));
    }

    /**
     * 将 key 中储存的数字值减一
     *
     * @param key 键
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long decr(byte[] key) {
        return this.returnResult(this.jedis.decr(key));
    }

    /**
     * 将 key 中储存的数字值减一
     *
     * @param key       键
     * @param increment 减量
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long decrBy(String key, long increment) {
        return this.returnResult(this.jedis.decrBy(key, increment));
    }

    /**
     * 将 key 中储存的数字值减一
     *
     * @param key       键
     * @param increment 减量
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long decrBy(byte[] key, long increment) {
        return this.returnResult(this.jedis.decrBy(key, increment));
    }

    /**
     * 如果 key 已经存在并且是一个字符串， APPEND 命令将指定的 value 追加到该 key 原来值（value）的末尾
     *
     * @param key   键
     * @param value 值
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long append(String key, String value) {
        return this.returnResult(this.jedis.append(key, value));
    }

    /**
     * 如果 key 已经存在并且是一个字符串， APPEND 命令将指定的 value 追加到该 key 原来值（value）的末尾
     *
     * @param key   键
     * @param value 值
     * @return java.lang.Long
     * @author 典羽
     * @time 2019/8/27 :00
     */
    public Long append(byte[] key, byte[] value) {
        return this.returnResult(this.jedis.append(key, value));
    }
}
