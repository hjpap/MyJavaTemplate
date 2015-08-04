package sample.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan
public class ZubaWebApplication {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZubaWebApplication.class, args);
	}
	

}
