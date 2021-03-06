package com.pea.it.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.pea.it.provider.mapper")
@ImportResource({"classpath:spring/spring-root.xml"})
public class MybatisDruidDemoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisDruidDemoProviderApplication.class, args);
    }
}
