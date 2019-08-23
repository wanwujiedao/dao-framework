package com.dao.framework.redis.abstracts;

import com.dao.framework.redis.annos.DaoRedisSelect;
import com.dao.framework.redis.options.*;
import com.wwjd.framework.utils.DaoConstantsUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * redis 操作模板
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-21 16:43:00
 */
public abstract class AbstractDaoRedisTemplate{

    /**
     * redis 操作 key
     */
    @Autowired
    private DaoOptionsForKey daoOptionsForKey;
    /**
     * redis 操作字符串
     */
    @Autowired
    private DaoOptionsForString daoOptionsForString;
    /**
     * redis 操作哈希
     */
    @Autowired
    private DaoOptionsForHash daoOptionsForHash;
    /**
     * redis 操作列表
     */
    @Autowired
    private DaoOptionsForList daoOptionsForList;
    /**
     * redis 操作 set
     */
    @Autowired
    private DaoOptionsForSet daoOptionsForSet;


    /**
     * 操作字符串工具集
     *
     * @return com.dao.framework.redis.options.OptionsForString
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForKey optionsForKey() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForKey.beforOptions(annotation, DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForKey;
    }


    /**
     * 操作字符串工具集,可选取当前链接源的数据库
     *
     * @return com.dao.framework.redis.options.OptionsForString
     * @author 阿导
     * @param database db
     * @time 2019/8/22 :00
     */
    public DaoOptionsForKey optionsForKey(int database) throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForKey.beforOptions(annotation,database);
        return daoOptionsForKey;
    }

    /**
     * 操作字符串工具集
     *
     * @return com.dao.framework.redis.options.OptionsForString
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForString optionsForString() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForString.beforOptions(annotation, DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForString;
    }


    /**
     * 操作字符串工具集,可选取当前链接源的数据库
     *
     * @return com.dao.framework.redis.options.OptionsForString
     * @author 阿导
     * @param database db
     * @time 2019/8/22 :00
     */
    public DaoOptionsForString optionsForString(int database) throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForString.beforOptions(annotation,database);
        return daoOptionsForString;
    }


    /**
     * 操作哈希工具集
     *
     * @return com.dao.framework.redis.options.DaoOptionsForHash
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForHash optionsForHash() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForHash.beforOptions(annotation, DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForHash;
    }


    /**
     * 操作哈希工具集,可选取当前链接源的数据库
     *
     * @return com.dao.framework.redis.options.DaoOptionsForHash
     * @param database db
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForHash optionsForHash(int database) throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForHash.beforOptions(annotation,database);
        return daoOptionsForHash;
    }

    /**
     * 操作列表工具集
     *
     * @return com.dao.framework.redis.options.DaoOptionsForList
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForList optionsForList() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForList.beforOptions(annotation, DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForList;
    }


    /**
     * 操作列表工具集,可选取当前链接源的数据库
     *
     * @return com.dao.framework.redis.options.DaoOptionsForList
     * @param database db
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForList optionsForList(int database) throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForList.beforOptions(annotation,database);
        return daoOptionsForList;
    }

    /**
     * 操作列表工具集
     *
     * @return com.dao.framework.redis.options.DaoOptionsForSet
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForSet optionsForSet() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForSet.beforOptions(annotation, DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForSet;
    }


    /**
     * 操作列表工具集,可选取当前链接源的数据库
     *
     * @return com.dao.framework.redis.options.DaoOptionsForSet
     * @author 阿导
     * @param database db
     * @time 2019/8/22 :00
     */
    public DaoOptionsForSet optionsForSet(int database) throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForSet.beforOptions(annotation,database);
        return daoOptionsForSet;
    }
}
