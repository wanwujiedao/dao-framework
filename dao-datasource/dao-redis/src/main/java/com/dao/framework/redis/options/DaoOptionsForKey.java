package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;

import java.util.Set;

/**
 * redis 操作键
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-23 16:42:00
 */
public class DaoOptionsForKey extends AbstractDaoRedisOptions {
    /**
     * 删除 key
     *
     * @param key 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long delete(String key) {
        // 返回结果
        return this.returnResult(this.jedis.del(key));
    }

    /**
     * 删除 key
     *
     * @param key 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long delete(byte[] key) {
        // 返回结果
        return this.returnResult(this.jedis.del(key));
    }
    /**
     * 删除 key
     *
     * @param keys 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long delete(String... keys) {
        // 返回结果
        return this.returnResult(this.jedis.del(keys));
    }

    /**
     * 删除 key
     *
     * @param keys 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long delete(byte[]... keys) {
        // 返回结果
        return this.returnResult(this.jedis.del(keys));
    }
    /**
     * 序列化给定 key ，并返回被序列化的值。
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return byte[]
     */
    public byte[] dump(String key){
        return this.returnResult(this.jedis.dump(key));
    }
    /** 
     * 序列化给定 key ，并返回被序列化的值。
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return byte[]
     */
    public byte[] dump(byte[] key){
        return this.returnResult(this.jedis.dump(key));
    }


    /**
     * 判断 key 是否存在
     *
     * @param key 键
     * @return boolean
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public boolean exists(String key) {
        return this.returnResult(this.jedis.exists(key));
    }

    /**
     * 判断 key 是否存在
     *
     * @param key 键
     * @return boolean
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public boolean exists(byte[] key) {
        return this.returnResult(this.jedis.exists(key));
    }

    /**
     * 判断 keys 是否存在
     *
     * @param keys 键
     * @return boolean
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long exists(String... keys) {
        return this.returnResult(this.jedis.exists(keys));
    }

    /**
     * 判断 keys 是否存在
     *
     * @param keys 键
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/23 :00
     */
    public Long exists(byte[]... keys) {
        return this.returnResult(this.jedis.exists(keys));
    }
    /**
     * 为给定 key 设置过期时间，以秒计。
     *
     * @param key 键
     * @param ttl 过期世间
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public Long expire(String key, int ttl) {
        return this.returnResult(this.jedis.expire(key,ttl));
    }


    /**
     * 为给定 key 设置过期时间，以秒计。
     *
     * @param key 键
     * @param ttl 过期世间
     * @return java.lang.Long
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public Long expire(byte[] key, int ttl) {
        return this.returnResult(this.jedis.expire(key,ttl));
    }
    /** 
     * EXPIREAT 的作用和 EXPIRE 类似，都用于为 key 设置过期时间。 不同在于 EXPIREAT 命令接受的时间参数是 UNIX 时间戳(unix timestamp)
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param ttl 过期世间
     * @return java.lang.Long
     */
    public Long expireAt(String key, long ttl){
        return this.returnResult(this.jedis.expireAt(key,ttl));
    }
    /*** 
     * EXPIREAT 的作用和 EXPIRE 类似，都用于为 key 设置过期时间。 不同在于 EXPIREAT 命令接受的时间参数是 UNIX 时间戳(unix timestamp)
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param ttl 过期世间
     * @return java.lang.Long
     */
    public Long expireAt(byte[] key, long ttl){
        return this.returnResult(this.jedis.expireAt(key,ttl));
    }
    /**
     * 设置 key 的过期时间以毫秒计
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param ttl 过期世间
     * @return java.lang.Long
     */
    public Long pexpire(String key, long ttl){
        // 结果判断
        return this.returnResult(this.jedis.pexpire(key,ttl));
    }
    /**
     * 设置 key 的过期时间以毫秒计
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param ttl 过期世间
     * @return java.lang.Long
     */
    public Long pexpire(byte[] key, long ttl){
        return this.returnResult(this.jedis.pexpire(key,ttl));
    }


    /**
     * 设置 key 过期时间的时间戳(unix timestamp) 以毫秒计
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param ttl 过期世间
     * @return java.lang.Long
     */
    public Long pexpireAt(String key, long ttl){
        return this.returnResult(this.jedis.pexpireAt(key,ttl));
    }
    /**
     * 设置 key 过期时间的时间戳(unix timestamp) 以毫秒计
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param ttl 过期世间
     * @return java.lang.Long
     */
    public Long pexpireAt(byte[] key, long ttl){
        return this.returnResult(this.jedis.pexpireAt(key,ttl));
    }
    /**
     * 查找所有符合给定模式( pattern)的 key ,慎用，极大的消耗服务器的 cpu
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param pattern 表达式
     * @return java.util.Set<java.lang.String>
     */
    public Set<String> keys(String pattern){
        return this.returnResult(this.jedis.keys(pattern));
    }
    /**
     * 查找所有符合给定模式( pattern)的 key ,慎用，极大的消耗服务器的 cpu
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param pattern 表达式
     * @return java.util.Set<byte[]>
     */
    public Set<byte[]> keys(byte[] pattern){
        return this.returnResult(this.jedis.keys(pattern));
    }
    /**
     * 将当前数据库的 key 移动到给定的数据库 db 当中
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param database 数据库
     * @return java.lang.Long
     */
    public Long move(String key,int database){
        return this.returnResult(this.jedis.move(key,database));
    }
    /**
     * 将当前数据库的 key 移动到给定的数据库 db 当中
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param database 数据库
     * @return java.lang.Long
     */
    public Long move(byte[] key,int database){
        return this.returnResult(this.jedis.move(key,database));
    }
    /**
     * 移除 key 的过期时间，key 将持久保持
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long persist(String key){
        return this.returnResult(this.jedis.persist(key));
    }
    /**
     * 移除 key 的过期时间，key 将持久保持
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long persist(byte[] key){
        return this.returnResult(this.jedis.persist(key));
    }
    /**
     * 以毫秒为单位返回 key 的剩余的过期时间
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long pttl(String key){
        return this.returnResult(this.jedis.pttl(key));
    }
    /** 
     * 以毫秒为单位返回 key 的剩余的过期时间
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long pttl(byte[] key){
        return this.returnResult(this.jedis.pttl(key));
    }
    /** 
     * 以秒为单位，返回给定 key 的剩余生存时间(TTL, time to live)
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long ttl(String key){
        return this.returnResult(this.jedis.ttl(key));
    }
    /** 
     * 以秒为单位，返回给定 key 的剩余生存时间(TTL, time to live)
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long ttl(byte[] key){
        return this.returnResult(this.jedis.ttl(key));
    }
    /** 
     * 从当前数据库中随机返回一个 key
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @return java.lang.String
     */
    public String randomKey(){
        return this.returnResult(this.jedis.randomKey());
    }
    /**
     * 从当前数据库中随机返回一个 key
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @return java.lang.String
     */
    public byte[] randomBinaryKey(){
        return this.returnResult(this.jedis.randomBinaryKey());
    }
    /**
     * 修改 key 的名称，不推荐使用，防止数据丢失
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param oldKey 旧键
     * @param newKey 新键
     * @return java.lang.String
     */
    public String rename(String oldKey,String newKey){
        return this.returnResult(this.jedis.rename(oldKey, newKey));
    }
    /**
     * 修改 key 的名称，不推荐使用，防止数据丢失
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param oldKey 旧键
     * @param newKey 新键
     * @return java.lang.String
     */
    public String rename(byte[] oldKey,byte[] newKey){
        return this.returnResult(this.jedis.rename(oldKey, newKey));
    }
    /**
     * 仅当 newkey 不存在时，将 key 改名为 newkey
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param oldKey 旧键
     * @param newKey 新键
     * @return java.lang.String
     */
    public String renamenc(String oldKey,String newKey){
        return this.returnResult(this.jedis.rename(oldKey, newKey));
    }
    /**
     * 仅当 newkey 不存在时，将 key 改名为 newkey
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param oldKey 旧键
     * @param newKey 新键
     * @return java.lang.String
     */
    public String renamenc(byte[] oldKey,byte[] newKey){
        return this.returnResult(this.jedis.rename(oldKey, newKey));
    }
    /**
     * 返回 key 所储存的值的类型
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.String
     */
    public String type(String key){
        return this.returnResult(this.jedis.type(key));
    }
    /**
     * 返回 key 所储存的值的类型
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.String
     */
    public String type(byte[] key){
        return this.returnResult(this.jedis.type(key));
    }
}
