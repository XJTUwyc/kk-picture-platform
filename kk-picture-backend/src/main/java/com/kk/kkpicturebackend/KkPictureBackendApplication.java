package com.kk.kkpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.kk.kkpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class KkPictureBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(KkPictureBackendApplication.class, args);
	}

}
