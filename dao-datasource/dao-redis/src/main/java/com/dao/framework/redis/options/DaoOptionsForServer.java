package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import redis.clients.jedis.DebugParams;
import redis.clients.jedis.JedisMonitor;
import redis.clients.util.Slowlog;

import java.util.List;

/**
 * redis 服务器
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-27 15:40:00
 */
public class DaoOptionsForServer  extends AbstractDaoRedisOptions {
    /** 
     * 异步执行一个 AOF（AppendOnly File） 文件重写操作
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @return java.lang.String
     */
    public String bgrewriteaof(){
        return this.returnResult(this.jedis.bgrewriteaof());
    }
    /** 
     * 在后台异步保存当前数据库的数据到磁盘
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @return java.lang.String
     */
    public String bgsave(){
        return this.returnResult(this.jedis.bgsave());
    }
    /** 
     * 关闭客户端连接
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @param client 客户端
     * @return java.lang.String
     */
    public String clientKill(String client){
        return this.returnResult(this.jedis.clientKill(client));
    }
    /** 
     * 关闭客户端连接
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @param client 客户端
     * @return java.lang.String
     */
    public String clientKill(byte[] client){
        return this.returnResult(this.jedis.clientKill(client));
    }
    /** 
     * 获取连接到服务器的客户端连接列表
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @return java.lang.String
     */
    public String clientList(){
        return this.returnResult(this.jedis.clientList());
    }
    /**
     * 获取连接的名称
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @return java.lang.String
     */
    public String clientGetname(){
        return this.returnResult(this.jedis.clientGetname());
    }
    /**
     * 设置当前连接的名称
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @param name 名称
     * @return java.lang.String
     */
    public String clientSetname(String name){
        return this.returnResult(this.jedis.clientSetname(name));
    }
    /**
     * 设置当前连接的名称
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @param name 名称
     * @return java.lang.String
     */
    public String clientSetname(byte[] name){
        return this.returnResult(this.jedis.clientSetname(name));
    }
    /** 
     * 获取集群节点的映射数组
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @return java.util.List<java.lang.Object>
     */
    public List<Object> clusterSlots(){
        return this.returnResult(this.jedis.clusterSlots());
    }
    /** 
     * 返回当前服务器时间
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @return java.util.List<java.lang.String>
     */
    public List<String> command(){
        return this.returnResult(this.jedis.time());
    }
    /** 
     * 获取指定配置参数的值
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @param pattern 指定配置
     * @return java.util.List<java.lang.String>
     */
    public List<String> configGet(String pattern){
        return this.returnResult(this.jedis.configGet(pattern));
    }
    /** 
     * 获取指定配置参数的值
     *
     * @author 阿导
     * @time 2019/8/28 :00
     * @param pattern 指定配置
     * @return java.util.List<byte[]>
     */
    public List<byte[]> configGet(byte[] pattern){
        return this.returnResult(this.jedis.configGet(pattern));
    }
    /** 
     * 修改 redis 配置参数，无需重启
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param parameter 参数
     * @param value 值
     * @return java.lang.String
     */
    public String configSet(String parameter,String value){
        return this.returnResult(this.jedis.configSet(parameter,value));
    }
    /**
     * 修改 redis 配置参数，无需重启
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param parameter 参数
     * @param value 值
     * @return byte[]
     */
    public byte[] configSet(byte[] parameter,byte[] value){
        return this.returnResult(this.jedis.configSet(parameter,value));
    }
    /** 
     * 重置 INFO 命令中的某些统计数据
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.String
     */
    public String configResetStat(){
        return this.returnResult(this.jedis.configResetStat());
    }

    /**
     * 返回当前数据库的 key 的数量
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.Long
     */
    public Long dbSize(){
        return this.returnResult(this.jedis.dbSize());
    }
    /** 
     * 返回指定数据库的 key 的数量
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param database 所选择的数据库
     * @return java.lang.Long
     */
    public Long dbSize(int database){
        this.jedis.select(database);
        return dbSize();
    }
    /** 
     * 获取 key 的调试信息
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param debugParams 调试参数
     * @return java.lang.String
     */
    public String debug(DebugParams debugParams){
        return this.returnResult(this.jedis.debug(debugParams));
    }
    /**
     * 删除所有数据库的所有 key
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.String
     */
    public String flushAll(){
        return this.returnResult(this.jedis.flushAll());
    }
    /**
     * 删除当前数据库的所有 key
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.String
     */
    public String flushDb(){
        return this.returnResult(this.jedis.flushDB());
    }
    /**
     * 获取 Redis 服务器的各种信息和统计数值
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.String
     */
    public String info(){
        return this.returnResult(this.jedis.info());
    }
    /**
     * 获取 Redis 服务器的各种信息和统计数值
     * 通过给定可选的参数 section ，可以让命令只返回某一部分的信息
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param section 过滤返回信息
     * @return java.lang.String
     */
    public String info(String section){
        return this.returnResult(this.jedis.info(section));
    }
    /** 
     * 返回最近一次 Redis 成功将数据保存到磁盘上的时间，以 UNIX 时间戳格式表示
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.Long
     */
    public Long lastsave(){
        return this.returnResult(this.jedis.lastsave());
    }
    /**
     * 实时打印出 Redis 服务器接收到的命令，调试用
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.Long
     */
    public void monitor(JedisMonitor jedisMonitor){
        this.jedis.monitor(jedisMonitor);
        this.voidResult();
    }
    /**
     * 同步保存数据到硬盘
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.String
     */
    public String save(){
        return this.returnResult(this.jedis.save());
    }
    /**
     * 异步保存数据到硬盘，并关闭服务器
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.String
     */
    public String shutdown(){
        return this.returnResult(this.jedis.shutdown());
    }
    /**
     * 将当前服务器转变为指定服务器的从属服务器(slave server)
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param host 服务器地址
     * @param port 端口号
     * @return java.lang.String
     */
    public String slaveof(String host,int port){
        return this.returnResult(this.jedis.slaveof(host,port));
    }
    /** 
     * 管理 redis 的慢日志,长度
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.Long
     */
    public Long slowlogLen(){
        return this.returnResult(this.jedis.slowlogLen());
    }

    /**
     * 管理 redis 的慢日志,重置
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.Long
     */
    public String slowlogReset(){
        return this.returnResult(this.jedis.slowlogReset());
    }
    /** 
     * 管理 redis 的慢日志,获取日志信息
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.util.List<redis.clients.util.Slowlog>
     */
    public List<Slowlog> slowlogGet(){
        return this.returnResult(this.jedis.slowlogGet());
    }


    /** 
     * 管理 redis 的慢日志,获取日志信息
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.util.List<byte[]>
     */
    public List<byte[]> slowlogGetBinary(){
        return this.returnResult(this.jedis.slowlogGetBinary());
    }

    /**
     * 管理 redis 的慢日志,获取日志信息
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param entries 指定节点
     * @return java.util.List<redis.clients.util.Slowlog>
     */
    public List<Slowlog> slowlogGet(long entries){
        return this.returnResult(this.jedis.slowlogGet(entries));
    }
    /** 
     * 管理 redis 的慢日志,获取日志信息
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param entries 指定节点
     * @return java.util.List<byte[]>
     */
    public List<byte[]> slowlogGetBinary(long entries){
        return this.returnResult(this.jedis.slowlogGetBinary(entries));
    }
    /** 
     * 用于复制功能(replication)的内部命令
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return void
     */
    public void sync(){
        this.jedis.sync();
         this.voidResult();
    }
}
