package com.melchicorp.puravida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PuravidaApiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PuravidaApiApplication.class, args);
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PuravidaApiApplication.class);
    }

}
