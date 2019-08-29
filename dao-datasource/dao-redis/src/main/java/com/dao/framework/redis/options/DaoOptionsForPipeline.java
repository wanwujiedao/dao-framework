package com.dao.framework.redis.options;

import com.dao.framework.redis.abstracts.AbstractDaoPipeline;
import com.dao.framework.redis.abstracts.AbstractDaoRedisOptions;
import redis.clients.jedis.Pipeline;

import java.util.List;

/**
 * redis 通道技术
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-29 14:26:00
 */
public class DaoOptionsForPipeline extends AbstractDaoRedisOptions {

    /**
     * 操作通道技术
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param abstractDaoPipeline  每一个执行通道的方法都需要继承该类
     * @return boolean
     */
    public List<Object> doPipelineAndReturnAll(AbstractDaoPipeline abstractDaoPipeline){
        Pipeline pipeline = this.jedis.pipelined();
        abstractDaoPipeline.doPipelineCore(pipeline);
        return this.returnResult(pipeline.syncAndReturnAll());
    }


    /**
     * 操作通道技术
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param abstractDaoPipeline  每一个执行通道的方法都需要继承该类
     * @return boolean
     */
    public boolean doPipeline(AbstractDaoPipeline abstractDaoPipeline){
        Pipeline pipeline = this.jedis.pipelined();
        abstractDaoPipeline.doPipelineCore(pipeline);
        pipeline.sync();
        // 关闭连接
        this.voidResult();
        return true;
    }
}
