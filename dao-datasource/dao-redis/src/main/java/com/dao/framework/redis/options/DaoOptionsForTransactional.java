package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import com.dao.framework.redis.abstracts.AbstractDaoTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Transaction;

/**
 * redis 事务
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-27 15:30:00
 */
public class DaoOptionsForTransactional extends AbstractDaoRedisOptions {
    /**
     * 日志
     */
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * 执行事务
     *
     * @param daoTransactional 每一个执行事务的方法都需要继承该类
     * @return boolean
     * @author 阿导
     * @time 2019/8/29 :00
     */
    public boolean doTrnsactional(AbstractDaoTransactional daoTransactional) {
        // 声明结果
        boolean rs = false;
        //开启事务
        LOGGER.warn("开启 redis 事务");
        Transaction multi = this.jedis.multi();
        try {
            daoTransactional.doTrnsactionalCore(multi);
            // 执行
            multi.exec();
            // 无异常则返回成功
            rs = true;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            // 回滚
            LOGGER.warn("发生异常，正在回滚");
            multi.discard();
        } finally {
            // 关闭连接
            this.voidResult();
        }

        return rs;
    }

    /**
     * 监视一个(或多个) key ，如果在事务执行之前这个(或这些) key 被其他命令所改动，那么事务将被打断
     *
     * @param keys
     * @return java.lang.String
     * @author 阿导
     * @time 2019/8/29 :00
     */
    public String watch(String... keys) {
        return this.returnResult(this.jedis.watch(keys));
    }
    /**
     * 取消 WATCH 命令对所有 key 的监视
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return java.lang.String
     */
    public String unwatch() {
        return this.returnResult(this.jedis.unwatch());
    }
}
