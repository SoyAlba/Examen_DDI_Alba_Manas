package com.examen.wordel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "es.examen.wordel.*" })
public class WordelApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(WordelApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WordelApplication.class, args);
	}
}
