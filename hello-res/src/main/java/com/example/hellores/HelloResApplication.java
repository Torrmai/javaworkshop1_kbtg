package com.example.hellores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloResApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HelloResApplication.class,args);
		int count = context.getBeanDefinitionCount();
		System.out.println("Total= "+count);
	}

}
