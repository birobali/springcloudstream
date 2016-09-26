package com.springclouddemo.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.springclouddemo.processor.*")
public class ProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessorApplication.class, args);
	}
}