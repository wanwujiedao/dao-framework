package com.dao.framework.test.redis;

import com.dao.framework.redis.annos.DaoRedisSelect;
import com.dao.framework.redis.abstracts.AbstractDaoRedisTemplate;

/**
 * redisTemplate
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-22 14:50:00
 */
@DaoRedisSelect(key="test_3")
public class RedisTemplate extends AbstractDaoRedisTemplate {
}
