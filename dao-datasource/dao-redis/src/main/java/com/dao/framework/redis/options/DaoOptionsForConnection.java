package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;

/**
 * redis 连接
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-27 15:39:00
 */
public class DaoOptionsForConnection  extends AbstractDaoRedisOptions {
    /**
     * 验证密码是否正确
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param password
     * @return java.lang.String
     */
    public String auth(String password){
        return this.returnResult(this.jedis.auth(password));
    }
    /**
     * 打印字符串
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param string
     * @return java.lang.String
     */
    public String echo(String string){
        return this.returnResult(this.jedis.echo(string));
    }
    /**
     * 打印字符串
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param string
     * @return byte[]
     */
    public byte[] echo(byte[] string){
        return this.returnResult(this.jedis.echo(string));
    }
    /**
     * 查看服务是否运行
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @return java.lang.String
     */
    public String ping(){
        return this.returnResult(this.jedis.ping());
    }
    /**
     * 关闭当前连接，这个也建议不要使用，因为我在执行命令都会进行后置处理
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @return java.lang.String
     */
    @Deprecated
    public String quit(){
        return this.returnResult(this.jedis.quit());
    }
    /**
     * 切换到指定的数据库,这里只是命令操作，实际操作并不会起到作用，这一块都会在执行相关命令前进行前置处理
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @param database
     * @return java.lang.String
     */
    @Deprecated
    public String select(int database){
        return this.returnResult(this.jedis.select(database));
    }

    /**
     * 关闭连接
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return void
     */
    public void close(){
      voidResult();
    }
}
