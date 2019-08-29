# dao-redis

## 简介

dao-redis 是阿导独立封装的 redis 操作集合，主要依赖于 spring 框架，以最便捷的方式对 redis 进行操作

## 主要操作数据类型：以默认连接器进行示例

- `键`：daoRedisTemplate.key();

- `字符串`：daoRedisTemplate.string();

- `哈希`：daoRedisTemplate.hash();

- `列表`：daoRedisTemplate.list();

- `集合`：daoRedisTemplate.set();

- `有序集合`：daoRedisTemplate.sortedSet();

- `HyperLogLog`：daoRedisTemplate.hyperLogLog();

- `发布订阅`：daoRedisTemplate.pubSub();

- `事务`：daoRedisTemplate.transactional();

- `脚本`：daoRedisTemplate.script();

- `连接`：daoRedisTemplate.connection();

- `服务器`：daoRedisTemplate.server();
        

## 使用说明

- 添加配置项,目前不支持 ssl 连接，若想某个连接源生效， host 是必须配置的

```properties

# 默认链接
dao.redis.host=
dao.redis.port=6379
dao.redis.password=
dao.redis.database=1
dao.redis.max-idle=8
dao.redis.min-idle=0
dao.redis.timeout=2000

# 若有多个连接源
dao.redis.config.test_2.host=192.168.1.2
dao.redis.config.test_2.database=2


```


- 继承抽象类 AbstractDaoRedisTemplate

除了默认连接源只需要在配置文件添加配置以外，其它连接源必须继承 AbstractDaoRedisTemplate，并添加注解 @DaoRedisSelect(key="${key}"),例如上述 **test_2** 的连接源可写成如下类：

```java

import com.dao.framework.redis.annos.DaoRedisSelect;
import com.dao.framework.redis.abstracts.AbstractDaoRedisTemplate;

@DaoRedisSelect(key = "test_2")
public class Test2RedisTemplate implements AbstractDaoRedisTemplate{}


/**
 * 引入默认连接源
 *
 */
@Autowired
private  AbstractDaoRedisTemplate daoRedisTemplate;

/**
 * 引入 test_2 连接源
 *
 */
@Autowired
private  AbstractDaoRedisTemplate test2RedisTemplate;

```

- 启用该插件

在启动类上，添加注解 @DaoRedisSelect

### 其它补充

- 注解 DaoRedisSelect 说明
    
    该注解可以填充两个属性，分别为 key 和 database,其中 key 是选择具体的数据源,database 是选择操作的库。
    
    
- 选择 db 优先级

    通过使用本组件，会发现我们这边有三个地方可以选择 redis 的数据库，分别在配置的时候丶注解的时候丶选择操作类型的时候，那么他们必然有一个优先级，原则是就近一致原则，也就是说：
   **配置的时候** < **注解的时候** < **选择操作类型的时候**
   
- 继承 AbstractDaoRedisTemplate 说明

继承该类都会注入到 spring 容器中。
若只需要配置一个连接源，操作不同的库，可以通过多个继承类来选择不同的库，其中默认连接源 **key=""** ；也可以通过继承一个类，然后在操作数据类型的时候选择库。
若操作不同的数据源，则必须配置多个连接源和继承类
