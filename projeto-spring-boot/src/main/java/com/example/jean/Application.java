package com.example.jean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Anotação que diz que é uma aplicação com as configurações SpringBoot
*/
@SpringBootApplication

/**
 * Pré configurações de módulos padrões para serem utilizados
 */
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
