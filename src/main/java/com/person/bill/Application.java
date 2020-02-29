package com.xyy.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author : wangbiao
 * @version V1.0
 * @Project: xyy-ec-ehcache
 * @Package com.xyy.ec
 * @Description: TODO
 * @date Date : 2018年10月20日 17:00
 */
@SpringBootApplication
// 启用缓存注解
@EnableCaching
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
