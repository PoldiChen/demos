package com.poldichen.democoncurrent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.poldichen.democoncurrent.dao")
public class DemoConcurrentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConcurrentApplication.class, args);
	}

}
