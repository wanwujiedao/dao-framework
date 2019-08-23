package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * redis 操作哈希
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-23 08:46:00
 */
public class DaoOptionsForHash extends AbstractDaoRedisOptions {
    /**
     * 删除
     *
     * @param key    键
     * @param fields 域
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hdelete(String key, String... fields) {
        return this.returnResult(this.jedis.hdel(key, fields));
    }

    /**
     * 删除
     *
     * @param key    键
     * @param fields 域
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hdelete(byte[] key, byte[]... fields) {
        return this.returnResult(this.jedis.hdel(key, fields));
    }

    /**
     * 判断键属性是否存在
     *
     * @param key   键
     * @param field 域
     * @return boolean
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public boolean hexist(String key, String field) {
        return this.returnResult(this.jedis.hexists(key, field));
    }

    /**
     * 判断键属性是否存在
     *
     * @param key   键
     * @param field 域
     * @return boolean
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public boolean hexist(byte[] key, byte[] field) {
        return this.returnResult(this.jedis.hexists(key, field));
    }

    /**
     * 获取哈希的值
     *
     * @param key   键
     * @param field 域
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public String hget(String key, String field) {
        return this.returnResult(this.jedis.hget(key, field));
    }

    /**
     * 获取哈希的值
     *
     * @param key   键
     * @param field 域
     * @return byte[]
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public byte[] hget(byte[] key, byte[] field) {
        return this.returnResult(this.jedis.hget(key, field));
    }

    /**
     * 获取在哈希表中指定 key 的所有字段和值
     *
     * @param key
     * @return java.util.Map<java.lang.String, java.lang.String>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Map<String, String> hgetAll(String key) {
        return this.returnResult(this.jedis.hgetAll(key));
    }

    /**
     * 获取在哈希表中指定 key 的所有字段和值
     *
     * @param key
     * @return java.util.Map<byte [ ], byte [ ]>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Map<byte[], byte[]> hgetAll(byte[] key) {
        return this.returnResult(this.jedis.hgetAll(key));
    }

    /**
     * 为哈希表 key 中的指定字段的整数值加上增量 incr
     *
     * @param key   键
     * @param field 域
     * @param incr  增量
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hincrBy(String key, String field, long incr) {
        return this.returnResult(this.jedis.hincrBy(key, field, incr));
    }

    /**
     * 为哈希表 key 中的指定字段的整数值加上增量 incr
     *
     * @param key   键
     * @param field 域
     * @param incr  增量
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hincrBy(byte[] key, byte[] field, long incr) {
        return this.returnResult(this.jedis.hincrBy(key, field, incr));
    }

    /**
     * 为哈希表 key 中的指定字段的浮点数值加上增量 incr
     *
     * @param key   键
     * @param field 域
     * @param incr  增量
     * @return java.lang.Double
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Double hincrByFloat(String key, String field, double incr) {
        return this.returnResult(this.jedis.hincrByFloat(key, field, incr));
    }

    /**
     * 为哈希表 key 中的指定字段的浮点数值加上增量 incr
     *
     * @param key   键
     * @param field 域
     * @param incr  增量
     * @return java.lang.Double
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Double hincrByFloat(byte[] key, byte[] field, double incr) {
        return this.returnResult(this.jedis.hincrByFloat(key, field, incr));
    }

    /**
     * 获取所有哈希表中的字段
     *
     * @param key
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Set<String> hkeys(String key) {
        return this.returnResult(this.jedis.hkeys(key));
    }

    /**
     * 获取所有哈希表中的字段
     *
     * @param key
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Set<byte[]> hkeys(byte[] key) {
        return this.returnResult(this.jedis.hkeys(key));
    }

    /**
     * 获取哈希表中字段的数量
     *
     * @param key 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hlen(String key) {
        return this.returnResult(this.jedis.hlen(key));
    }

    /**
     * 获取哈希表中字段的数量
     *
     * @param key 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hlen(byte[] key) {
        return this.returnResult(this.jedis.hlen(key));
    }

    /**
     * 获取所有给定字段的值
     *
     * @param key    键
     * @param fields 域
     * @return java.util.List<java.lang.String>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public List<String> hmget(String key, String... fields) {
        return this.returnResult(this.jedis.hmget(key, fields));
    }

    /**
     * 获取所有给定字段的值
     *
     * @param key    键
     * @param fields 域
     * @return java.util.List<byte [ ]>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public List<byte[]> hmget(byte[] key, byte[]... fields) {
        return this.returnResult(this.jedis.hmget(key, fields));
    }

    /**
     * 同时将多个 field-value (域-值)对设置到哈希表 key 中
     *
     * @param key 键
     * @param map 域-值对
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public String hmset(String key, Map<String, String> map) {
        return this.returnResult(this.jedis.hmset(key, map));
    }

    /**
     * 同时将多个 field-value (域-值)对设置到哈希表 key 中
     *
     * @param key 键
     * @param map 域-值对
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public String hmset(byte[] key, Map<byte[], byte[]> map) {
        return this.returnResult(this.jedis.hmset(key, map));
    }

    /**
     * 将哈希表 key 中的字段 field 的值设为 value
     *
     * @param key   键
     * @param field 域
     * @param value 值
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hset(String key, String field, String value) {
        return this.returnResult(this.jedis.hset(key, field, value));
    }

    /**
     * 将哈希表 key 中的字段 field 的值设为 value
     *
     * @param key   键
     * @param field 域
     * @param value 值
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hset(byte[] key, byte[] field, byte[] value) {
        return this.returnResult(this.jedis.hset(key, field, value));
    }

    /**
     * 只有在字段 field 不存在时，设置哈希表字段的值
     *
     * @param key   键
     * @param field 域
     * @param value 值
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hsetnx(String key, String field, String value) {
        return this.returnResult(this.jedis.hsetnx(key, field, value));
    }

    /**
     * 只有在字段 field 不存在时，设置哈希表字段的值
     *
     * @param key   键
     * @param field 域
     * @param value 值
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long hsetnx(byte[] key, byte[] field, byte[] value) {
        return this.returnResult(this.jedis.hsetnx(key, field, value));
    }

    /**
     * 获取哈希表中所有值
     *
     * @param key 键
     * @return java.util.List<java.lang.String>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public List<String> hvals(String key) {
        return this.returnResult(this.jedis.hvals(key));
    }

    /**
     * 获取哈希表中所有值
     *
     * @param key 键
     * @return java.util.List<byte [ ]>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public List<byte[]> hvals(byte[] key) {
        return this.returnResult(this.jedis.hvals(key));
    }

    /**
     * 迭代哈希表中的键值对
     *
     * @param key    键
     * @param cursor 游标
     * @return redis.clients.jedis.ScanResult<java.util.Map.Entry < java.lang.String, java.lang.String>>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public ScanResult<Map.Entry<String, String>> hscan(String key, int cursor) {
        return this.returnResult(this.jedis.hscan(key, cursor));
    }

    /**
     * 迭代哈希表中的键值对
     *
     * @param key    键
     * @param cursor 游标
     * @return redis.clients.jedis.ScanResult<java.util.Map.Entry < byte [ ], byte [ ]>>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public ScanResult<Map.Entry<byte[], byte[]>> hscan(byte[] key, byte[] cursor) {
        return this.returnResult(this.jedis.hscan(key, cursor));
    }

    /**
     * 迭代哈希表中的键值对
     *
     * @param key        键
     * @param cursor     游标
     * @param scanParams
     * @return redis.clients.jedis.ScanResult<java.util.Map.Entry < java.lang.String, java.lang.String>>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public ScanResult<Map.Entry<String, String>> hscan(String key, int cursor, ScanParams scanParams) {
        return this.returnResult(this.jedis.hscan(key, cursor, scanParams));
    }

    /**
     * 迭代哈希表中的键值对
     *
     * @param key        键
     * @param cursor     游标
     * @param scanParams
     * @return redis.clients.jedis.ScanResult<java.util.Map.Entry < byte [ ], byte [ ]>>
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public ScanResult<Map.Entry<byte[], byte[]>> hscan(byte[] key, byte[] cursor, ScanParams scanParams) {
        return this.returnResult(this.jedis.hscan(key, cursor, scanParams));
    }

}
