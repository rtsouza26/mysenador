package br.com.mysenador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import br.com.mysenador.*;

@SpringBootApplication(scanBasePackages = {"br.com.mysenador.controller","br.com.mysenador.model","br.com.mysenador.repository"})
public class MysenadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysenadorApplication.class, args);
	}
	
}