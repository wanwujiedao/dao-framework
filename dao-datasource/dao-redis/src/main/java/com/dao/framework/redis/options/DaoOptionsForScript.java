package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;

import java.util.List;

/**
 * redis 脚本
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-27 15:38:00
 */
public class DaoOptionsForScript  extends AbstractDaoRedisOptions {
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param script
     * @return java.lang.Object
     */
    public Object eval(String script){
        return this.returnResult(this.jedis.eval(script));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param script
     * @return java.lang.Object
     */
    public Object eval(byte[] script){
        return this.returnResult(this.jedis.eval(script));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param script
     * @param keys
     * @param args
     * @return java.lang.Object
     */
    public Object eval(String script, List<String> keys,List<String> args){
        return this.returnResult(this.jedis.eval(script, keys, args));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param script
     * @param keys
     * @param args
     * @return java.lang.Object
     */
    public Object eval(byte[] script, List<byte[]> keys,List<byte[]> args){
        return this.returnResult(this.jedis.eval(script, keys, args));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param script
     * @param keyCount
     * @param params
     * @return java.lang.Object
     */
    public Object eval(String script, int keyCount, String... params){
        return this.returnResult(this.jedis.eval(script, keyCount, params));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param script
     * @param keyCount
     * @param params
     * @return java.lang.Object
     */
    public Object eval(byte[] script, int keyCount, byte[]... params){
        return this.returnResult(this.jedis.eval(script, keyCount, params));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param script
     * @param keyCount
     * @param params
     * @return java.lang.Object
     */
    public Object eval(byte[] script, byte[] keyCount, byte[]... params){
        return this.returnResult(this.jedis.eval(script, keyCount, params));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param sha
     * @return java.lang.Object
     */
    public Object evalsha(String sha){
        return this.returnResult(this.jedis.evalsha(sha));
    }
    /** 
     *
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param sha
     * @return java.lang.Object
     */
    public Object evalsha(byte[] sha){
        return this.returnResult(this.jedis.evalsha(sha));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param sha
     * @param keys
     * @param args
     * @return java.lang.Object
     */
    public Object evalsha(String sha, List<String> keys,List<String> args){
        return this.returnResult(this.jedis.evalsha(sha, keys, args));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param sha
     * @param keys
     * @param args
     * @return java.lang.Object
     */
    public Object evalsha(byte[] sha, List<byte[]> keys,List<byte[]> args){
        return this.returnResult(this.jedis.evalsha(sha, keys, args));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param sha
     * @param keyCount
     * @param params
     * @return java.lang.Object
     */
    public Object evalsha(String sha, int keyCount, String... params){
        return this.returnResult(this.jedis.evalsha(sha, keyCount, params));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param sha
     * @param keyCount
     * @param params
     * @return java.lang.Object
     */
    public Object evalsha(byte[] sha, int keyCount, byte[]... params){
        return this.returnResult(this.jedis.evalsha(sha, keyCount, params));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param sha
     * @return java.lang.Boolean
     */
    public Boolean scriptExists(String sha){
        return this.returnResult(this.jedis.scriptExists(sha));
    }
    /** 
     * 执行 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param sha
     * @return java.lang.Long
     */
    public Long scriptExists(byte[] sha){
        return this.returnResult(this.jedis.scriptExists(sha));
    }
    /** 
     * 查看指定的脚本是否已经被保存在缓存当中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param shas
     * @return java.util.List<java.lang.Boolean>
     */
    public List<Boolean> scriptExists(String... shas){
        return this.returnResult(this.jedis.scriptExists(shas));
    }
    /** 
     * 查看指定的脚本是否已经被保存在缓存当中
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param shas
     * @return java.util.List<java.lang.Long>
     */
    public List<Long> scriptExists(byte[]... shas){
        return this.returnResult(this.jedis.scriptExists(shas));
    }
    /** 
     * 从脚本缓存中移除所有脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @return java.lang.String
     */
    public String scriptFlush(){
        return this.returnResult(this.jedis.scriptFlush());
    }
    /** 
     * 杀死当前正在运行的 Lua 脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @return java.lang.String
     */
    public String scriptKill(){
        return this.returnResult(this.jedis.scriptKill());
    }
    /** 
     * 将脚本 script 添加到脚本缓存中，但并不立即执行这个脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param script
     * @return java.lang.String
     */
    public String scriptLo(String script){
        return this.returnResult(this.jedis.scriptLoad(script));
    }

    /** 
     * 将脚本 script 添加到脚本缓存中，但并不立即执行这个脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param script
     * @return byte[]
     */
    public byte[] scriptLo(byte[] script){
        return this.returnResult(this.jedis.scriptLoad(script));
    }
}
