package io.gemsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.baeldung.dependency.exception"})
public class MatriApiDataApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MatriApiDataApplication.class, args);
	}

}
