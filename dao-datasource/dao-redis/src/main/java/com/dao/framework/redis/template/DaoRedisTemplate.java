package com.dao.framework.redis.template;

import com.dao.framework.redis.abstracts.AbstractDaoRedisTemplate;
import com.dao.framework.redis.annos.DaoRedisSelect;
import org.springframework.stereotype.Component;

/**
 * 默认template
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-22 16:16:00
 */
@DaoRedisSelect(key = "")
@Component("daoRedisTemplate")
public class DaoRedisTemplate extends AbstractDaoRedisTemplate {
}
