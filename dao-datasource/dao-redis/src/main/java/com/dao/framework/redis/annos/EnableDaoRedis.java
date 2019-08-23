package com.dao.framework.redis.annos;

import com.dao.framework.redis.conf.DaoRedisConfiguration;
import com.dao.framework.redis.conf.DaoRedisProperties;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * enable dao-redis
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2018-11-23 16:22:00
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({DaoRedisProperties.class, DaoRedisConfiguration.class})
public @interface EnableDaoRedis {
}