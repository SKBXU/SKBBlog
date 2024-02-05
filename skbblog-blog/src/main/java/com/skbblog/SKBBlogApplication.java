package com.skbblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.skbblog.mapper")
public class SKBBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SKBBlogApplication.class, args);
    }

}
