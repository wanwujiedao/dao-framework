package com.dao.framework.redis.annos;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * redis 数据源选择
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-21 16:49:00
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface DaoRedisSelect {

    String key();

    /**
     * 数据库选择
     *
     * @author 阿导
     * @time 2019/8/21 :00
     * @return int
     */
    int database() default -1;


}
