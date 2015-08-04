package com.wei.zuba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@SpringBootApplication
@ComponentScan
@ImportResource("classpath:/applicationContext.xml")
public class ZubaServiceApplication {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZubaServiceApplication.class, args);
	}
	

}
