package com.dao.framework.test.redis;

import com.dao.framework.redis.annos.DaoRedisSelect;
import com.dao.framework.redis.abstracts.AbstractDaoRedisTemplate;

/**
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-22 14:51:00
 */
@DaoRedisSelect(database = 1,key="test_2")
public class RedisTemplateOne extends AbstractDaoRedisTemplate {
}
