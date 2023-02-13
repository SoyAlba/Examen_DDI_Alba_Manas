package com.examen.wordel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = { "com.examen.wordel.*" })
public class WordelApplication {
	public static void main(String[] args) {
		SpringApplication.run(WordelApplication.class, args);
	}
 }
