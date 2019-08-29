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
     * redis 操作集合
     */
    @Autowired
    private DaoOptionsForSet daoOptionsForSet;
    /**
     * redis 操作有序集合
     */
    @Autowired
    private DaoOptionsForSortedSet daoOptionsForSortedSet;
    /**
     * redis 操作 HyperLogLog
     */
    @Autowired
    private DaoOptionsForHyperLogLog daoOptionsForHyperLogLog;
    /**
     * redis 发布订阅功能
     */
    @Autowired
    private DaoOptionsForPubSub daoOptionsForPubSub;
    /**
     * redis 事务
     */
    @Autowired
    private DaoOptionsForTransactional daoOptionsForTransactional;
    /**
     * redis 操作脚本
     */
    @Autowired
    private DaoOptionsForScript daoOptionsForScript;
    /**
     * redis 连接
     */
    @Autowired
    private DaoOptionsForConnection daoOptionsForConnection;
    /**
     * redis 服务器
     */
    @Autowired
    private DaoOptionsForServer daoOptionsForServer;
    /**
     * redis 管道技术
     */
    @Autowired
    private DaoOptionsForPipeline daoOptionsForPipeline;
    /**
     * 操作字符串工具集
     *
     * @return com.dao.framework.redis.options.OptionsForString
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForKey key() throws Exception {
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
    public DaoOptionsForKey key(int database) throws Exception {
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
    public DaoOptionsForString string() throws Exception {
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
    public DaoOptionsForString string(int database) throws Exception {
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
    public DaoOptionsForHash hash() throws Exception {
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
    public DaoOptionsForHash hash(int database) throws Exception {
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
    public DaoOptionsForList list() throws Exception {
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
    public DaoOptionsForList list(int database) throws Exception {
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
    public DaoOptionsForSet set() throws Exception {
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
    public DaoOptionsForSet set(int database) throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForSet.beforOptions(annotation,database);
        return daoOptionsForSet;
    }
    /**
     * 操作列表工具集
     *
     * @return com.dao.framework.redis.options.DaoOptionsForSortedSet
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForSortedSet sortedSet() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForSortedSet.beforOptions(annotation, DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForSortedSet;
    }


    /**
     * 操作列表工具集,可选取当前链接源的数据库
     *
     * @return com.dao.framework.redis.options.DaoOptionsForSortedSet
     * @author 阿导
     * @param database db
     * @time 2019/8/22 :00
     */
    public DaoOptionsForSortedSet sortedSet(int database) throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForSortedSet.beforOptions(annotation,database);
        return daoOptionsForSortedSet;
    }

    /**
     * 操作 HyperLogLog 工具集
     *
     * @return com.dao.framework.redis.options.DaoOptionsForSortedSet
     * @author 阿导
     * @time 2019/8/22 :00
     */
    public DaoOptionsForHyperLogLog hyperLogLog() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForHyperLogLog.beforOptions(annotation, DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForHyperLogLog;
    }


    /**
     * 操作 HyperLogLog 工具集,可选取当前链接源的数据库
     *
     * @return com.dao.framework.redis.options.DaoOptionsForSortedSet
     * @author 阿导
     * @param database db
     * @time 2019/8/22 :00
     */
    public DaoOptionsForHyperLogLog hyperLogLog(int database) throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForHyperLogLog.beforOptions(annotation,database);
        return daoOptionsForHyperLogLog;
    }

    /**
     * redis 发布订阅功能
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @return com.dao.framework.redis.options.DaoOptionsForPubSub
     */
    public DaoOptionsForPubSub pubSub() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForPubSub.beforOptions(annotation,DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForPubSub;
    }
    /**
     * redis 操作事务
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @return com.dao.framework.redis.options.DaoOptionsForTransactional
     */
    public DaoOptionsForTransactional transactional() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForTransactional.beforOptions(annotation,DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForTransactional;
    }
    /**
     * redis 操作脚本
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @return com.dao.framework.redis.options.DaoOptionsForScript
     */
    public DaoOptionsForScript script() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForScript.beforOptions(annotation,DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForScript;
    }
    /**
     * redis 操作连接
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @return com.dao.framework.redis.options.DaoOptionsForConnection
     */
    public DaoOptionsForConnection connection() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForConnection.beforOptions(annotation,DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForConnection;
    }
    /**
     * redis 操作服务器
     *
     * @author 阿导
     * @time 2019/8/27 :00
     * @return com.dao.framework.redis.options.DaoOptionsForServer
     */
    public DaoOptionsForServer server() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForServer.beforOptions(annotation,DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForServer;
    }
    /**
     * redis 通道技术
     *
     * @author 阿导
     * @time 2019/8/29 :00
     * @return com.dao.framework.redis.options.DaoOptionsForPipeline
     */
    public DaoOptionsForPipeline pipeline() throws Exception {
        //获取本类注解的值
        DaoRedisSelect annotation =this.getClass().getAnnotation(DaoRedisSelect.class);
        daoOptionsForPipeline.beforOptions(annotation,DaoConstantsUtils.BAR_ZERO);
        return daoOptionsForPipeline;
    }
}
