package com.minimart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan
public class MiniMartApplication {
	public static void main(String[] args) {
        SpringApplication.run(MiniMartApplication.class, args);
    }
}
