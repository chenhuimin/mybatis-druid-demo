package com.pea.it.consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring/spring-root.xml"})
public class MybatisDruidDemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisDruidDemoConsumerApplication.class, args);
	}
}
