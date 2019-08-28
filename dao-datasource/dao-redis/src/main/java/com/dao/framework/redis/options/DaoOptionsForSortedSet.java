package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;
import redis.clients.jedis.Tuple;
import redis.clients.jedis.ZParams;
import redis.clients.jedis.params.sortedset.ZAddParams;
import redis.clients.jedis.params.sortedset.ZIncrByParams;

import java.util.Map;
import java.util.Set;

/**
 * redis 操作有序集合
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-27 15:12:00
 */
public class DaoOptionsForSortedSet extends AbstractDaoRedisOptions {
    /**
     * 向有序集合添加一个或多个成员，或者更新已存在成员的分数
     *
     * @param key    键
     * @param score  分数
     * @param member 成员
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zadd(String key, double score, String member) {
        return this.returnResult(this.jedis.zadd(key, score, member));
    }

    /**
     * 向有序集合添加一个或多个成员，或者更新已存在成员的分数
     *
     * @param key    键
     * @param score  分数
     * @param member 成员
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zadd(byte[] key, double score, byte[] member) {
        return this.returnResult(this.jedis.zadd(key, score, member));
    }

    /**
     * 向有序集合添加一个或多个成员，或者更新已存在成员的分数
     *
     * @param key        键
     * @param score      分数
     * @param member     成员
     * @param zAddParams 过滤条件
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zadd(String key, double score, String member, ZAddParams zAddParams) {
        return this.returnResult(this.jedis.zadd(key, score, member, zAddParams));
    }

    /**
     * 向有序集合添加一个或多个成员，或者更新已存在成员的分数
     *
     * @param key        键
     * @param score      分数
     * @param member     成员
     * @param zAddParams 过滤条件
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zadd(byte[] key, double score, byte[] member, ZAddParams zAddParams) {
        return this.returnResult(this.jedis.zadd(key, score, member, zAddParams));
    }

    /**
     * 向有序集合添加一个或多个成员，或者更新已存在成员的分数
     *
     * @param key          键
     * @param scoreMembers 成员和分数
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zadd(String key, Map<String, Double> scoreMembers) {
        return this.returnResult(this.jedis.zadd(key, scoreMembers));
    }

    /**
     * 向有序集合添加一个或多个成员，或者更新已存在成员的分数
     *
     * @param key          键
     * @param scoreMembers 成员和分数
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zadd(byte[] key, Map<byte[], Double> scoreMembers) {
        return this.returnResult(this.jedis.zadd(key, scoreMembers));
    }

    /**
     * 向有序集合添加一个或多个成员，或者更新已存在成员的分数
     *
     * @param key          键
     * @param scoreMembers 成员和分数
     * @param zAddParams   过滤条件
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zadd(String key, Map<String, Double> scoreMembers, ZAddParams zAddParams) {
        return this.returnResult(this.jedis.zadd(key, scoreMembers, zAddParams));
    }

    /**
     * 向有序集合添加一个或多个成员，或者更新已存在成员的分数
     *
     * @param key          键
     * @param scoreMembers 成员和分数
     * @param zAddParams   过滤条件
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zadd(byte[] key, Map<byte[], Double> scoreMembers, ZAddParams zAddParams) {
        return this.returnResult(this.jedis.zadd(key, scoreMembers, zAddParams));
    }

    /**
     * 获取有序集合的成员数
     *
     * @param key 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zcard(String key) {
        return this.returnResult(this.jedis.zcard(key));
    }

    /**
     * 获取有序集合的成员数
     *
     * @param key 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zcard(byte[] key) {
        return this.returnResult(this.jedis.zcard(key));
    }

    /**
     * 计算在有序集合中指定区间分数的成员数
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zcount(String key, double min, double max) {
        return this.returnResult(this.jedis.zcount(key, min, max));
    }

    /**
     * 计算在有序集合中指定区间分数的成员数
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zcount(byte[] key, double min, double max) {
        return this.returnResult(this.jedis.zcount(key, min, max));
    }

    /**
     * 计算在有序集合中指定区间分数的成员数
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zcount(String key, String min, String max) {
        return this.returnResult(this.jedis.zcount(key, min, max));
    }

    /**
     * 计算在有序集合中指定区间分数的成员数
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zcount(byte[] key, byte[] min, byte[] max) {
        return this.returnResult(this.jedis.zcount(key, min, max));
    }

    /**
     * 有序集合中对指定成员的分数加上增量 increment
     *
     * @param key       键
     * @param increment 增量分数
     * @param member    成员
     * @return java.lang.Double
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Double zincrby(String key, double increment, String member) {
        return this.returnResult(this.jedis.zincrby(key, increment, member));
    }

    /**
     * 有序集合中对指定成员的分数加上增量 increment
     *
     * @param key       键
     * @param increment 增量分数
     * @param member    成员
     * @return java.lang.Double
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Double zincrby(byte[] key, double increment, byte[] member) {
        return this.returnResult(this.jedis.zincrby(key, increment, member));
    }

    /**
     * 有序集合中对指定成员的分数加上增量 increment
     *
     * @param key           键
     * @param increment     增量分数
     * @param member        成员
     * @param zIncrByParams 过滤条件
     * @return java.lang.Double
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Double zincrby(String key, double increment, String member, ZIncrByParams zIncrByParams) {
        return this.returnResult(this.jedis.zincrby(key, increment, member, zIncrByParams));
    }

    /**
     * 有序集合中对指定成员的分数加上增量 increment
     *
     * @param key           键
     * @param increment     增量分数
     * @param member        成员
     * @param zIncrByParams 过滤条件
     * @return java.lang.Double
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Double zincrby(byte[] key, double increment, byte[] member, ZIncrByParams zIncrByParams) {
        return this.returnResult(this.jedis.zincrby(key, increment, member, zIncrByParams));
    }

    /**
     * 计算给定的一个或多个有序集的交集并将结果集存储在新的有序集合 key 中
     *
     * @param destination 目标
     * @param keys        键集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zinterstore(String destination, String... keys) {
        return this.returnResult(this.jedis.zinterstore(destination, keys));
    }

    /**
     * 计算给定的一个或多个有序集的交集并将结果集存储在新的有序集合 key 中
     *
     * @param destination 目标
     * @param keys        键集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zinterstore(byte[] destination, byte[]... keys) {
        return this.returnResult(this.jedis.zinterstore(destination, keys));
    }

    /**
     * 计算给定的一个或多个有序集的交集并将结果集存储在新的有序集合 key 中
     *
     * @param destination 目标
     * @param zParams     过滤条件
     * @param keys        键集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zinterstore(String destination, ZParams zParams, String... keys) {
        return this.returnResult(this.jedis.zinterstore(destination, zParams, keys));
    }

    /**
     * 计算给定的一个或多个有序集的交集并将结果集存储在新的有序集合 key 中
     *
     * @param destination 目标
     * @param zParams     过滤条件
     * @param keys        键集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zinterstore(byte[] destination, ZParams zParams, byte[]... keys) {
        return this.returnResult(this.jedis.zinterstore(destination, zParams, keys));
    }

    /**
     * 在有序集合中计算指定字典区间内成员数量
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zlexcount(String key, String min, String max) {
        return this.returnResult(this.jedis.zlexcount(key, min, max));
    }

    /**
     * 在有序集合中计算指定字典区间内成员数量
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zlexcount(byte[] key, byte[] min, byte[] max) {
        return this.returnResult(this.jedis.zlexcount(key, min, max));
    }

    /**
     * 通过索引区间返回有序集合成指定区间内的成员
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrang(String key, long start, long end) {
        return this.returnResult(this.jedis.zrange(key, start, end));
    }

    /**
     * 通过索引区间返回有序集合成指定区间内的成员
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrang(byte[] key, long start, long end) {
        return this.returnResult(this.jedis.zrange(key, start, end));
    }

    /**
     * 通过字典区间返回有序集合的成员
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrangeByLex(String key, String start, String end) {
        return this.returnResult(this.jedis.zrangeByLex(key, start, end));
    }

    /**
     * 通过字典区间返回有序集合的成员
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrangeByLex(byte[] key, byte[] start, byte[] end) {
        return this.returnResult(this.jedis.zrangeByLex(key, start, end));
    }

    /**
     * 通过字典区间返回有序集合的成员
     *
     * @param key    键
     * @param start  开始位置
     * @param end    结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrangeByLex(String key, String start, String end, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByLex(key, start, end, offset, count));
    }

    /**
     * 通过字典区间返回有序集合的成员
     *
     * @param key    键
     * @param start  开始位置
     * @param end    结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrangeByLex(byte[] key, byte[] start, byte[] end, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByLex(key, start, end, offset, count));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zranfeByScore(String key, double min, double max) {
        return this.returnResult(this.jedis.zrangeByScore(key, min, max));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zranfeByScore(byte[] key, double min, double max) {
        return this.returnResult(this.jedis.zrangeByScore(key, min, max));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zranfeByScore(String key, String min, String max) {
        return this.returnResult(this.jedis.zrangeByScore(key, min, max));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zranfeByScore(byte[] key, byte[] min, byte[] max) {
        return this.returnResult(this.jedis.zrangeByScore(key, min, max));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key    键
     * @param min    范围起始位置
     * @param max    范围结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zranfeByScore(String key, double min, double max, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByScore(key, min, max, offset, count));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key    键
     * @param min    范围起始位置
     * @param max    范围结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zranfeByScore(byte[] key, double min, double max, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByScore(key, min, max, offset, count));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key    键
     * @param min    范围起始位置
     * @param max    范围结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zranfeByScore(String key, String min, String max, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByScore(key, min, max, offset, count));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key    键
     * @param min    范围起始位置
     * @param max    范围结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zranfeByScore(byte[] key, byte[] min, byte[] max, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByScore(key, min, max, offset, count));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max) {
        return this.returnResult(this.jedis.zrangeByScoreWithScores(key, min, max));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrangeByScoreWithScores(byte[] key, double min, double max) {
        return this.returnResult(this.jedis.zrangeByScoreWithScores(key, min, max));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrangeByScoreWithScores(String key, String min, String max) {
        return this.returnResult(this.jedis.zrangeByScoreWithScores(key, min, max));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrangeByScoreWithScores(byte[] key, byte[] min, byte[] max) {
        return this.returnResult(this.jedis.zrangeByScoreWithScores(key, min, max));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key    键
     * @param min    范围起始位置
     * @param max    范围结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrangeByScoreWithScores(String key, double min, double max, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByScoreWithScores(key, min, max, offset, count));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key    键
     * @param min    范围起始位置
     * @param max    范围结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrangeByScoreWithScores(byte[] key, double min, double max, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByScoreWithScores(key, min, max, offset, count));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key    键
     * @param min    范围起始位置
     * @param max    范围结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrangeByScoreWithScores(String key, String min, String max, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByScoreWithScores(key, min, max, offset, count));
    }

    /**
     * 通过分数返回有序集合指定区间内的成员
     *
     * @param key    键
     * @param min    范围起始位置
     * @param max    范围结束位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrangeByScoreWithScores(byte[] key, byte[] min, byte[] max, int offset, int count) {
        return this.returnResult(this.jedis.zrangeByScoreWithScores(key, min, max, offset, count));
    }

    /**
     * 返回有序集合中指定成员的索引
     *
     * @param key    键
     * @param member 成员
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zrank(String key, String member) {
        return this.returnResult(this.jedis.zrank(key, member));
    }

    /**
     * 返回有序集合中指定成员的索引
     *
     * @param key    键
     * @param member 成员集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zrank(byte[] key, byte[] member) {
        return this.returnResult(this.jedis.zrank(key, member));
    }

    /**
     * 移除有序集合中的一个或多个成员
     *
     * @param key     键
     * @param members 成员集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zrem(String key, String... members) {
        return this.returnResult(this.jedis.zrem(key, members));
    }

    /**
     * 移除有序集合中的一个或多个成员
     *
     * @param key     键
     * @param members 成员集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zrem(byte[] key, byte[]... members) {
        return this.returnResult(this.jedis.zrem(key, members));
    }

    /**
     * 移除有序集合中给定的字典区间的所有成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zremrangeByLex(String key, String min, String max) {
        return this.returnResult(this.jedis.zremrangeByLex(key, min, max));
    }

    /**
     * 移除有序集合中给定的字典区间的所有成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zremrangeByLex(byte[] key, byte[] min, byte[] max) {
        return this.returnResult(this.jedis.zremrangeByLex(key, min, max));
    }

    /**
     * 移除有序集合中给定的排名区间的所有成员
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zremrangeByRank(String key, long start, long end) {
        return this.returnResult(this.jedis.zremrangeByRank(key, start, end));
    }

    /**
     * 移除有序集合中给定的排名区间的所有成员
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zremrangeByRank(byte[] key, long start, long end) {
        return this.returnResult(this.jedis.zremrangeByRank(key, start, end));
    }

    /**
     * 移除有序集合中给定的分数区间的所有成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zremrangeByScore(String key, String min, String max) {
        return this.returnResult(this.jedis.zremrangeByScore(key, min, max));
    }

    /**
     * 移除有序集合中给定的分数区间的所有成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zremrangeByScore(byte[] key, byte[] min, byte[] max) {
        return this.returnResult(this.jedis.zremrangeByScore(key, min, max));
    }

    /**
     * 移除有序集合中给定的分数区间的所有成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zremrangeByScore(String key, double min, double max) {
        return this.returnResult(this.jedis.zremrangeByScore(key, min, max));
    }

    /**
     * 移除有序集合中给定的分数区间的所有成员
     *
     * @param key 键
     * @param min 范围起始位置
     * @param max 范围结束位置
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zremrangeByScore(byte[] key, double min, double max) {
        return this.returnResult(this.jedis.zremrangeByScore(key, min, max));
    }

    /**
     * 返回有序集中指定区间内的成员，通过索引，分数从高到底
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrevrange(String key, long start, long end) {
        return this.returnResult(this.jedis.zrevrange(key, start, end));
    }

    /**
     * 返回有序集中指定区间内的成员，通过索引，分数从高到底
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrevrange(byte[] key, long start, long end) {
        return this.returnResult(this.jedis.zrevrange(key, start, end));
    }

    /**
     * 返回有序集中指定区间内的成员，通过索引，分数从高到底
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeWithScores(String key, long start, long end) {
        return this.returnResult(this.jedis.zrevrangeWithScores(key, start, end));
    }

    /**
     * 返回有序集中指定区间内的成员，通过索引，分数从高到底
     *
     * @param key   键
     * @param start 开始位置
     * @param end   结束位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeWithScores(byte[] key, long start, long end) {
        return this.returnResult(this.jedis.zrevrangeWithScores(key, start, end));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrevrangeByScore(String key, String max, String min) {
        return this.returnResult(this.jedis.zrevrangeByScore(key, max, min));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrevrangeByScore(byte[] key, byte[] max, byte[] min) {
        return this.returnResult(this.jedis.zrevrangeByScore(key, max, min));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrevrangeByScore(String key, String max, String min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByScore(key, max, min, offset, count));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrevrangeByScore(byte[] key, byte[] max, byte[] min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByScore(key, max, min, offset, count));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrevrangeByScore(String key, double max, double min) {
        return this.returnResult(this.jedis.zrevrangeByScore(key, max, min));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrevrangeByScore(byte[] key, double max, double min) {
        return this.returnResult(this.jedis.zrevrangeByScore(key, max, min));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrevrangeByScore(String key, double max, double min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByScore(key, max, min, offset, count));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrevrangeByScore(byte[] key, double max, double min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByScore(key, max, min, offset, count));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeByScoreWithScores(String key, String max, String min) {
        return this.returnResult(this.jedis.zrevrangeByScoreWithScores(key, max, min));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, byte[] max, byte[] min) {
        return this.returnResult(this.jedis.zrevrangeByScoreWithScores(key, max, min));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeByScoreWithScores(String key, String max, String min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByScoreWithScores(key, max, min, offset, count));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, byte[] max, byte[] min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByScoreWithScores(key, max, min, offset, count));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min) {
        return this.returnResult(this.jedis.zrevrangeByScoreWithScores(key, max, min));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, double max, double min) {
        return this.returnResult(this.jedis.zrevrangeByScoreWithScores(key, max, min));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeByScoreWithScores(String key, double max, double min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByScoreWithScores(key, max, min, offset, count));
    }

    /**
     * 返回有序集中指定分数区间内的成员，分数从高到低排序
     *
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<Tuple> zrevrangeByScoreWithScores(byte[] key, double max, double min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByScoreWithScores(key, max, min, offset, count));
    }

    /**
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrevrangeByLex(String key, String max, String min) {
        return this.returnResult(this.jedis.zrevrangeByLex(key, max, min));
    }

    /**
     * @param key 键
     * @param max 范围结束位置
     * @param min 范围起始位置
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrevrangeByLex(byte[] key, byte[] max, byte[] min) {
        return this.returnResult(this.jedis.zrevrangeByLex(key, max, min));
    }

    /**
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<java.lang.String>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<String> zrevrangeByLex(String key, String max, String min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByLex(key, max, min, offset, count));
    }

    /**
     * @param key    键
     * @param max    范围结束位置
     * @param min    范围起始位置
     * @param offset 偏移量
     * @param count  数量
     * @return java.util.Set<byte [ ]>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Set<byte[]> zrevrangeByLex(byte[] key, byte[] max, byte[] min, int offset, int count) {
        return this.returnResult(this.jedis.zrevrangeByLex(key, max, min, offset, count));
    }

    /**
     * 返回有序集合中指定成员的排名，有序集成员按分数值递减(从大到小)排序
     *
     * @param key    键
     * @param member 成员
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zrevrank(String key, String member) {
        return this.returnResult(this.jedis.zrevrank(key, member));
    }

    /**
     * 返回有序集合中指定成员的排名，有序集成员按分数值递减(从大到小)排序
     *
     * @param key    键
     * @param member 成员
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zrevrank(byte[] key, byte[] member) {
        return this.returnResult(this.jedis.zrevrank(key, member));
    }

    /**
     * 返回有序集中，成员的分数值
     *
     * @param key    键
     * @param member 成员
     * @return java.lang.Double
     * @author 典羽
     * @time 2019/8/28 :00
     */
    public Double zscore(String key, String member) {
        return this.returnResult(this.jedis.zscore(key, member));
    }

    /**
     * 返回有序集中，成员的分数值
     *
     * @param key    键
     * @param member 成员
     * @return java.lang.Double
     * @author 典羽
     * @time 2019/8/28 :00
     */
    public Double zscore(byte[] key, byte[] member) {
        return this.returnResult(this.jedis.zscore(key, member));
    }

    /**
     * 计算给定的一个或多个有序集的并集，并存储在新的 key 中
     *
     * @param destination 目标
     * @param sets        集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zunionstore(String destination, String... sets) {
        return this.returnResult(this.jedis.zunionstore(destination, sets));
    }

    /**
     * 计算给定的一个或多个有序集的并集，并存储在新的 key 中
     *
     * @param destination 目标
     * @param sets        集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zunionstore(byte[] destination, byte[]... sets) {
        return this.returnResult(this.jedis.zunionstore(destination, sets));
    }

    /**
     * 计算给定的一个或多个有序集的并集，并存储在新的 key 中
     *
     * @param destination 目标
     * @param zParams     过滤参数
     * @param sets        集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zunionstore(String destination, ZParams zParams, String... sets) {
        return this.returnResult(this.jedis.zunionstore(destination, zParams, sets));
    }

    /**
     * 计算给定的一个或多个有序集的并集，并存储在新的 key 中
     *
     * @param destination 目标
     * @param zParams     过滤参数
     * @param sets        集合
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public Long zunionstore(byte[] destination, ZParams zParams, byte[]... sets) {
        return this.returnResult(this.jedis.zunionstore(destination, zParams, sets));
    }

    /**
     * 迭代有序集合中的元素（包括元素成员和元素分值）
     *
     * @param key    键
     * @param cursor 游标
     * @return redis.clients.jedis.ScanResult<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public ScanResult<Tuple> zscan(String key, String cursor) {
        return this.returnResult(this.jedis.zscan(key, cursor));
    }

    /**
     * 迭代有序集合中的元素（包括元素成员和元素分值）
     *
     * @param key    键
     * @param cursor 游标
     * @return redis.clients.jedis.ScanResult<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public ScanResult<Tuple> zscan(byte[] key, byte[] cursor) {
        return this.returnResult(this.jedis.zscan(key, cursor));
    }

    /**
     * 迭代有序集合中的元素（包括元素成员和元素分值）
     *
     * @param key        键
     * @param cursor     游标
     * @param scanParams 过滤参数
     * @return redis.clients.jedis.ScanResult<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public ScanResult<Tuple> zscan(String key, String cursor, ScanParams scanParams) {
        return this.returnResult(this.jedis.zscan(key, cursor, scanParams));
    }

    /**
     * 迭代有序集合中的元素（包括元素成员和元素分值）
     *
     * @param key        键
     * @param cursor     游标
     * @param scanParams 过滤参数
     * @return redis.clients.jedis.ScanResult<redis.clients.jedis.Tuple>
     * @author 阿导
     * @time 2019/8/28 :00
     */
    public ScanResult<Tuple> zscan(byte[] key, byte[] cursor, ScanParams scanParams) {
        return this.returnResult(this.jedis.zscan(key, cursor, scanParams));
    }
}
