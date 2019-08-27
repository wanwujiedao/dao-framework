package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;

import java.util.List;
import java.util.Set;

/**
 * redis 操作集合
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-23 11:20:00
 */
public class DaoOptionsForSet extends AbstractDaoRedisOptions {

    /**
     * 向集合添加一个或多个成员
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long sadd(String key,String... values){
       return this.returnResult(this.jedis.sadd(key, values));
    }
    /**
     * 向集合添加一个或多个成员
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long sadd(byte[] key,byte[]... values){
        return this.returnResult(this.jedis.sadd(key, values));
    }
    /**
     * 获取集合的成员数
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long scard(String key){
        return this.returnResult(this.jedis.scard(key));
    }

    /**
     * 获取集合的成员数
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long scard(byte[] key){
        return this.returnResult(this.jedis.scard(key));
    }
    /**
     * 返回给定所有集合的差集
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param keys 键集合
     * @return java.util.Set<java.lang.String>
     */
    public Set<String> sdiff(String... keys){
        return this.returnResult(this.jedis.sdiff(keys));
    }
    /**
     * 返回给定所有集合的差集
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param keys 键集合
     * @return java.util.Set<byte[]>
     */
    public Set<byte[]> sdiff(byte[]... keys){
        return this.returnResult(this.jedis.sdiff(keys));
    }
    /**
     * 返回给定所有集合的差集并存储在 destination 中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param destination 目标 key
     * @param keys 求差集 key 集合
     * @return java.lang.Long
     */
    public Long sdiffstore(String destination,String... keys){
        return this.returnResult(this.jedis.sdiffstore(destination, keys));
    }

    /**
     * 返回给定所有集合的差集并存储在 destination 中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param destination 目标 key
     * @param keys 求差集 key 集合
     * @return java.lang.Long
     */
    public Long sdiffstore(byte[] destination,byte[]... keys){
        return this.returnResult(this.jedis.sdiffstore(destination, keys));
    }
    /**
     * 返回给定所有集合的交集
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param keys key 集合
     * @return java.util.Set<java.lang.String>
     */
    public Set<String> sinter(String... keys){
        return this.returnResult(this.jedis.sinter(keys));
    }

    /**
     * 返回给定所有集合的交集
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param keys key 集合
     * @return java.util.Set<byte[]>
     */
    public Set<byte[]> sinter(byte[]... keys){
        return this.returnResult(this.jedis.sinter(keys));
    }
    /**
     * 返回给定所有集合的交集并存储在 destination 中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param destination 目标 key
     * @param keys 求差集 key 集合
     * @return java.lang.Long
     */
    public Long sinterstore(String destination,String... keys){
        return this.returnResult(this.jedis.sinterstore(destination, keys));
    }

    /**
     * 返回给定所有集合的交集并存储在 destination 中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param destination 目标 key
     * @param keys 求差集 key 集合
     * @return java.lang.Long
     */
    public Long sinterstore(byte[] destination,byte[]... keys){
        return this.returnResult(this.jedis.sinterstore(destination, keys));
    }
    /**
     * 判断 member 元素是否是集合 key 的成员
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param member 成员
     * @return java.lang.Boolean
     */
    public Boolean sismember(String key,String member){
        return this.returnResult(this.jedis.sismember(key,member));
    }

    /**
     * 判断 member 元素是否是集合 key 的成员
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param member 成员
     * @return java.lang.Boolean
     */
    public Boolean sismember(byte[] key,byte[] member){
        return this.returnResult(this.jedis.sismember(key,member));
    }
    /**
     * 返回集合中的所有成员
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return java.util.Set<java.lang.String>
     */
    public Set<String> smembers(String key){
        return this.returnResult(this.jedis.smembers(key));
    }
    /**
     * 返回集合中的所有成员
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return java.util.Set<byte[]>
     */
    public Set<byte[]> smembers(byte[] key){
        return this.returnResult(this.jedis.smembers(key));
    }
    /**
     * 将 member 元素从 source 集合移动到 destination 集合
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param source 源
     * @param destination 目标
     * @param member 成员
     * @return java.lang.Long
     */
    public Long smove(String source,String destination,String member){
        return this.returnResult(this.jedis.smove(source, destination, member));
    }

    /**
     * 将 member 元素从 source 集合移动到 destination 集合
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param source 源
     * @param destination 目标
     * @param member 成员
     * @return java.lang.Long
     */
    public Long smove(byte[] source,byte[] destination,byte[] member){
        return this.returnResult(this.jedis.smove(source, destination, member));
    }
    /** 
     * 移除并返回集合中的一个随机元素
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return java.lang.String
     */
    public String spop(String key){
        return this.returnResult(this.jedis.spop(key));
    }
    /**
     * 移除并返回集合中的一个随机元素
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return byte[]
     */
    public byte[] spop(byte[] key){
        return this.returnResult(this.jedis.spop(key));
    }
    /**
     * 返回集合中一个随机数
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return java.lang.String
     */
    public String srandmember(String key){
        return this.returnResult(this.jedis.srandmember(key));
    }
    /**
     * 返回集合中一个随机数
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return byte[]
     */
    public byte[] srandmember(byte[] key){
        return this.returnResult(this.jedis.srandmember(key));
    }
    /**
     * 返回集合中指定数量随机数
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param count 数量
     * @return java.util.List<java.lang.String>
     */
    public List<String> srandmember(String key, int count){
        return this.returnResult(this.jedis.srandmember(key, count));
    }
    /**
     * 返回集合中指定数量随机数
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param count 数量
     * @return java.util.List<byte[]>
     */
    public List<byte[]> srandmember(byte[] key, int count){
        return this.returnResult(this.jedis.srandmember(key, count));
    }
    /**
     * 移除集合中一个或多个成员
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param members 需要移除的成员
     * @return java.lang.Long
     */
    public Long srem(String key,String... members){
        return this.returnResult(this.jedis.srem(key, members));
    }
    /**
     * 移除集合中一个或多个成员
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param members 需要移除的成员
     * @return java.lang.Long
     */
    public Long srem(byte[] key,byte[]... members){
        return this.returnResult(this.jedis.srem(key, members));
    }
    /**
     * 返回所有给定集合的并集
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param keys 键集合
     * @return java.util.Set<java.lang.String>
     */
    public Set<String> sunion(String... keys){
        return this.returnResult(this.jedis.sunion(keys));
    }

    /**
     * 返回所有给定集合的并集
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param keys 键集合
     * @return java.util.Set<byte[]>
     */
    public Set<byte[]> sunion(byte[]... keys){
        return this.returnResult(this.jedis.sunion(keys));
    }
    /**
     * 所有给定集合的并集存储在 destination 集合中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param destination 目标
     * @param keys 求并集集合
     * @return java.lang.Long
     */
    public Long sunionstore(String destination,String... keys){
        return this.returnResult(this.jedis.sunionstore(destination, keys));
    }
    /**
     * 所有给定集合的并集存储在 destination 集合中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param destination 目标
     * @param keys 求并集集合
     * @return java.lang.Long
     */
    public Long sunionstore(byte[] destination,byte[]... keys){
        return this.returnResult(this.jedis.sunionstore(destination, keys));
    }
    /** 
     * 迭代集合中的元素
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param cursor 游标
     * @return redis.clients.jedis.ScanResult<java.lang.String>
     */
    public ScanResult<String> sscan(String key, String cursor){
        return this.returnResult(this.jedis.sscan(key, cursor));
    }
    /** 
     * 迭代集合中的元素
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param cursor 游标
     * @return redis.clients.jedis.ScanResult<byte[]>
     */
    public ScanResult<byte[]> sscan(byte[] key, byte[] cursor){
        return this.returnResult(this.jedis.sscan(key, cursor));
    }
    /** 
     * 迭代集合中的元素
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param cursor 游标
     * @param scanParams 过滤参数
     * @return redis.clients.jedis.ScanResult<java.lang.String>
     */
    public ScanResult<String> sscan(String key, String cursor, ScanParams scanParams){
        return this.returnResult(this.jedis.sscan(key, cursor,scanParams));
    }
    /** 
     * 迭代集合中的元素
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param cursor 游标
     * @param scanParams 过滤参数
     * @return redis.clients.jedis.ScanResult<byte[]>
     */
    public ScanResult<byte[]> sscan(byte[] key, byte[] cursor, ScanParams scanParams){
        return this.returnResult(this.jedis.sscan(key, cursor,scanParams));
    }
}
