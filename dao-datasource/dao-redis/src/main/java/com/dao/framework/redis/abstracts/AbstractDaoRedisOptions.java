package com.dao.framework.redis.abstracts;

import com.dao.framework.redis.annos.DaoRedisSelect;
import com.dao.framework.redis.conf.DaoRedisFactory;
import com.wwjd.framework.utils.DaoConstantsUtils;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

/**
 * 抽象操作类
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-22 15:21:00
 */
public abstract class AbstractDaoRedisOptions {
    /**
     * 当前使用的 jedis 对象
     */
    protected Jedis jedis;

    /**
     * 自动注入jedis 工厂类
     */
    @Autowired
    private DaoRedisFactory daoRedisFactory;

    /**
     * 操作之前获取 jedis
     *
     * @return void
     * @author 阿导
     * @time 2019/8/22 :00
     */
    protected void beforOptions(DaoRedisSelect annotation, int database) throws Exception {
        // 若注解不存在
        if (annotation == null) {
            throw new Exception("Please add annotation:DaoRedisSelect");
        }
        // 先获取注解对象
        this.jedis = daoRedisFactory.getJedis(annotation.key(), database < DaoConstantsUtils.ZERO ? annotation.database() : database);
    }

    /**
     * 操作结束之后关闭 jedis
     *
     * @return void
     * @author 阿导
     * @time 2019/8/22 :00
     */
    private void afterOptions() {
        if (jedis != null) {
            jedis.close();
        }
    }

    /**
     * 返回结果
     *
     * @param rs 结果
     * @return boolean
     * @author 阿导
     * @time 2019/8/22 :00
     */
    protected <T> T returnResult(T rs) {
        // 收尾工作
        afterOptions();
        // 返回结果
        return rs;
    }
}
