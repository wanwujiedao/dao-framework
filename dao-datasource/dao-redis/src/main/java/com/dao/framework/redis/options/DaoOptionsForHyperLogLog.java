package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;

/**
 * redis 操作 HyperLogLog
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-27 15:19:00
 */
public class DaoOptionsForHyperLogLog  extends AbstractDaoRedisOptions {
    /**
     *  添加指定元素到 HyperLogLog 中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param members 元素集合
     * @return java.lang.Long
     */
    public Long pfadd(String key,String... members){
        return this.returnResult(this.jedis.pfadd(key, members));
    }

    /**
     *  添加指定元素到 HyperLogLog 中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @param members 元素集合
     * @return java.lang.Long
     */
    public Long pfadd(byte[] key,byte[]... members){
        return this.returnResult(this.jedis.pfadd(key, members));
    }
    /**
     * 返回给定 HyperLogLog 的基数估算值
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long pfcount(String key){
        return this.returnResult(this.jedis.pfcount(key));
    }
    /**
     * 返回给定 HyperLogLog 的基数估算值
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long pfcount(byte[] key){
        return this.returnResult(this.jedis.pfcount(key));
    }
    /**
     * 返回给定 HyperLogLog 的基数估算值
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param keys 键集合
     * @return java.lang.Long
     */
    public Long pfcount(String... keys){
        return this.returnResult(this.jedis.pfcount(keys));
    }
    /**
     * 返回给定 HyperLogLog 的基数估算值
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param keys 键集合
     * @return java.lang.Long
     */
    public Long pfcount(byte[]... keys){
        return this.returnResult(this.jedis.pfcount(keys));
    }
    /**
     * 将多个 HyperLogLog 合并为一个 HyperLogLog
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param destination 目标
     * @param keys 键集合
     * @return java.lang.String
     */
    public String pfmerge(String destination,String... keys){
        return this.returnResult(this.jedis.pfmerge(destination, keys));
    }

    /**
     * 将多个 HyperLogLog 合并为一个 HyperLogLog
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param destination 目标
     * @param keys 键集合
     * @return java.lang.String
     */
    public String pfmerge(byte[] destination,byte[]... keys){
        return this.returnResult(this.jedis.pfmerge(destination, keys));
    }
}
