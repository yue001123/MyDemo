package com.xxxx.server;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author zhoubin
 * @since 1.0.0
 */
@SpringBootApplication
@MapperScan("com.xxxx.server.mapper")
// @EnableScheduling
public class YebApplication {

	public static void main(String[] args) {
		SpringApplication.run(YebApplication.class,args);
	}

}