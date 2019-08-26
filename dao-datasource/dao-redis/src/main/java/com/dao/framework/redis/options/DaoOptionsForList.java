package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import redis.clients.jedis.BinaryClient;

import java.util.List;

/**
 * redis 操作列表
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-23 11:20:00
 */
public class DaoOptionsForList extends AbstractDaoRedisOptions {
    /** 
     * 移出并获取列表的第一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param args 键
     * @return java.util.List<java.lang.String>
     */
    public List<String> blpop(String... args){
         return this.returnResult(this.jedis.blpop(args));
    }
    /** 
     * 移出并获取列表的第一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param args 键
     * @return java.util.List<byte[]>
     */
    public List<byte[]> blpop(byte[]... args){
        return this.returnResult(this.jedis.blpop(args));
    }
    /** 
     * 移出并获取列表的第一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param timeout 超时时间
     * @param keys 键
     * @return java.util.List<java.lang.String>
     */
    public List<String> blpop(int timeout,String... keys){
        return this.returnResult(this.jedis.blpop(timeout,keys));
    }
    /** 
     * 移出并获取列表的第一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param timeout 超时时间
     * @param keys 键
     * @return java.util.List<byte[]>
     */
    public  List<byte[]> blpop(int timeout,byte[]... keys){
        return this.returnResult(this.jedis.blpop(timeout,keys));
    }
    /** 
     * 移出并获取列表的第一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param timeout 超时时间
     * @param key 键
     * @return java.util.List<java.lang.String>
     */
    public List<String> blpop(int timeout,String key){
        return this.returnResult(this.jedis.blpop(timeout,key));
    }
    /** 
     * 移出并获取列表的第一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param args 键
     * @return java.util.List<java.lang.String>
     */
    public List<String> brpop(String... args){
        return this.returnResult(this.jedis.brpop(args));
    }
    /** 
     * 移出并获取列表的最后一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param args 键
     * @return java.util.List<byte[]>
     */
    public List<byte[]> brpop(byte[]... args){
        return this.returnResult(this.jedis.brpop(args));
    }
    /** 
     * 移出并获取列表的最后一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param timeout 超时时间
     * @param keys 键
     * @return java.util.List<java.lang.String>
     */
    public List<String> brpop(int timeout,String... keys){
        return this.returnResult(this.jedis.brpop(timeout,keys));
    }
    /** 
     * 移出并获取列表的最后一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param timeout 超时时间
     * @param keys 键
     * @return java.util.List<byte[]>
     */
    public List<byte[]> brpop(int timeout,byte[]... keys){
        return this.returnResult(this.jedis.brpop(timeout,keys));
    }
    /** 
     * 移出并获取列表的最后一个元素， 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param timeout 超时时间
     * @param key 键
     * @return java.util.List<java.lang.String>
     */
    public List<String> brpop(int timeout,String key){
        return this.returnResult(this.jedis.brpop(timeout,key));
    }
    /** 
     * 从列表中弹出一个值，将弹出的元素插入到另外一个列表中并返回它； 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param source 源
     * @param destination 目标
     * @param timeout 超时时间
     * @return java.lang.String
     */
    public String brpoppush(String source,String destination,int timeout){
        return this.returnResult(this.jedis.brpoplpush(source, destination, timeout));
    }
    /** 
     * 从列表中弹出一个值，将弹出的元素插入到另外一个列表中并返回它； 如果列表没有元素会阻塞列表直到等待超时或发现可弹出元素为止
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param source 源
     * @param destination 目标
     * @param timeout 超时时间
     * @return byte[]
     */
    public byte[] brpoppush(byte[] source,byte[] destination,int timeout){
        return this.returnResult(this.jedis.brpoplpush(source, destination, timeout));
    }
    /** 
     * 通过索引获取列表中的元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param index 索引
     * @return java.lang.String
     */
    public String lindex(String key,int index){
        return this.returnResult(this.jedis.lindex(key,index));
    }
    /** 
     * 通过索引获取列表中的元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param index 索引
     * @return byte[]
     */
    public byte[] lindex(byte[] key,int index){
        return this.returnResult(this.jedis.lindex(key,index));
    }
    /** 
     * 在列表的元素前插入元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param pivot 元素
     * @param value 值
     * @return java.lang.Long
     */
    public Long linsertBefore(String key, String pivot, String value){
        return returnResult(this.jedis.linsert(key, BinaryClient.LIST_POSITION.BEFORE,pivot,value));
    }
    /** 
     * 在列表的元素前插入元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param pivot 元素
     * @param value 值
     * @return java.lang.Long
     */
    public Long linsertBefore(byte[] key, byte[] pivot, byte[] value){
        return returnResult(this.jedis.linsert(key, BinaryClient.LIST_POSITION.BEFORE,pivot,value));
    }
    /** 
     * 在列表的元素后插入元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param pivot 元素
     * @param value 值
     * @return java.lang.Long
     */
    public Long linsertAfter(String key, String pivot, String value){
        return returnResult(this.jedis.linsert(key, BinaryClient.LIST_POSITION.AFTER,pivot,value));
    }
    /** 
     * 在列表的元素后插入元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param pivot 元素
     * @param value 值
     * @return java.lang.Long
     */
    public Long linsertAfter(byte[] key, byte pivot[], byte[] value){
        return returnResult(this.jedis.linsert(key, BinaryClient.LIST_POSITION.AFTER,pivot,value));
    }
    /** 
     * 获取列表长度
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long llen(String key){
        return this.returnResult(this.jedis.llen(key));
    }
    /** 
     * 获取列表长度
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.Long
     */
    public Long llen(byte[] key){
        return this.returnResult(this.jedis.llen(key));
    }
    /** 
     * 移出并获取列表的第一个元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.String
     */
    public String lpop(String key){
        return  this.returnResult(this.jedis.lpop(key));
    }
    /** 
     * 移出并获取列表的第一个元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return byte[]
     */
    public byte[] lpop(byte[] key){
        return  this.returnResult(this.jedis.lpop(key));
    }
    /** 
     * 将一个或多个值插入到列表头部
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long lpush(String key,String... values){
        return this.returnResult(this.jedis.lpush(key,values));
    }
    /** 
     * 将一个或多个值插入到列表头部
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long lpush(byte[] key,byte[]... values){
        return this.returnResult(this.jedis.lpush(key,values));
    }
    /** 
     * 将一个值插入到已存在的列表头部
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long lpushx(String key,String... values){
        return this.returnResult(this.jedis.lpushx(key,values));
    }
    /** 
     * 将一个值插入到已存在的列表头部
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long lpushx(byte[] key,byte[]... values){
        return this.returnResult(this.jedis.lpushx(key,values));
    }
    /** 
     * 获取列表指定范围内的元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param start 开始
     * @param end 结束
     * @return java.util.List<java.lang.String>
     */
    public List<String> lrange(String key,long start,long end){
        return this.returnResult(this.jedis.lrange(key,start,end));
    }
    /** 
     * 获取列表指定范围内的元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param start 开始
     * @param end 结束
     * @return java.util.List<byte[]>
     */
    public List<byte[]> lrange(byte[] key,long start,long end){
        return this.returnResult(this.jedis.lrange(key,start,end));
    }
    /** 
     * 移除列表元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param count 删除数目，其中c ount 为 0 删除所有值为 value 的元素
     * @param value 值
     * @return java.lang.Long
     */
    public Long lremove(String key,long count,String value){
        return this.returnResult(this.jedis.lrem(key, count, value));
    }
    /** 
     * 移除列表元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param count 删除数目，其中c ount 为 0 删除所有值为 value 的元素
     * @param value 值
     * @return java.lang.Long
     */
    public Long lremove(byte[] key,long count,byte[] value){
        return this.returnResult(this.jedis.lrem(key, count, value));
    }
    /** 
     * 通过索引设置列表元素的值
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param index 位置
     * @param value 值
     * @return java.lang.String
     */
    public String lset(String key,long index,String value){
        return this.returnResult(this.jedis.lset(key, index, value));
    }
    /** 
     * 通过索引设置列表元素的值
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param index 位置
     * @param value 值
     * @return java.lang.String
     */
    public String lset(byte[] key,long index,byte[] value){
        return this.returnResult(this.jedis.lset(key, index, value));
    }
    /** 
     * 对一个列表进行修剪(trim)，就是说，让列表只保留指定区间内的元素，不在指定区间之内的元素都将被删除
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param start 开始
     * @param end 结束
     * @return java.lang.String
     */
    public String ltrim(String key,long start,long end){
       return this.returnResult(this.jedis.ltrim(key, start, end));
    }
    /** 
     * 对一个列表进行修剪(trim)，就是说，让列表只保留指定区间内的元素，不在指定区间之内的元素都将被删除
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param start 开始
     * @param end 结束
     * @return java.lang.String
     */
    public String ltrim(byte[] key,long start,long end){
        return this.returnResult(this.jedis.ltrim(key, start, end));
    }
    /** 
     * 移除列表的最后一个元素，返回值为移除的元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return java.lang.String
     */
    public String rpop(String key){
        return this.returnResult(this.jedis.rpop(key));
    }
    /** 
     * 移除列表的最后一个元素，返回值为移除的元素
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @return byte[]
     */
    public byte[] rpop(byte[] key){
        return this.returnResult(this.jedis.rpop(key));
    }
    /** 
     * 移除列表的最后一个元素，并将该元素添加到另一个列表并返回
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param source 源
     * @param destination 目标
     * @return java.lang.String
     */
    public String rpoplpush(String source,String destination){
        return this.returnResult(this.jedis.rpoplpush(source,destination));
    }
    /** 
     * 移除列表的最后一个元素，并将该元素添加到另一个列表并返回
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param source 源
     * @param destination 目标
     * @return byte[]
     */
    public byte[] rpoplpush(byte[] source,byte[] destination){
        return this.returnResult(this.jedis.rpoplpush(source,destination));
    }
    /** 
     * 在列表中添加一个或多个值
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long rpush(String key,String... values){
        return this.returnResult(this.jedis.rpush(key,values));
    }
    /** 
     * 在列表中添加一个或多个值
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long rpush(byte[] key,byte[]... values){
        return this.returnResult(this.jedis.rpush(key,values));
    }
    /** 
     * 为已存在的列表添加值
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long rpushx(String key,String... values){
        return this.returnResult(this.jedis.rpushx(key,values));
    }
    /** 
     * 为已存在的列表添加值
     *
     * @author 阿导
     * @time 2019/8/23 :00
     * @param key 键
     * @param values 值
     * @return java.lang.Long
     */
    public Long rpushx(byte[] key,byte[]... values){
        return this.returnResult(this.jedis.rpushx(key,values));
    }

}
