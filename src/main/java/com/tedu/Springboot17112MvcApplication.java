package com.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tedu.mapper")	//为com.tedu.mapper接口创建代理对象
public class Springboot17112MvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot17112MvcApplication.class, args);
	}
}
