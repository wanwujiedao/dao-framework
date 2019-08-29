package com.dao.framework.redis.abstracts;

import redis.clients.jedis.Pipeline;

/**
 * jedis 操作通道技术抽象类
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-29 11:28:00
 */
public abstract class AbstractDaoPipeline {
    /**
     * 必须由需求者自行实现
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @param pipeline
     * @return void
     */
    public abstract void doPipelineCore(Pipeline pipeline);
}
