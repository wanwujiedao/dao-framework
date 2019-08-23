package com.dao.framework.test;

import com.dao.framework.redis.annos.EnableDaoRedis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDaoRedis
public class DaoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DaoTestApplication.class, args);
    }

}
