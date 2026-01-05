package com.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * Passar somente o CEP, que sera buscado pelo ViaCep o endereço. O ID será gerado automaticamente.
 * http://localhost:8080/swagger-ui/index.html#/
 *
 * Referência: https://github.com/digitalinnovationone/lab-padroes-projeto-spring
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
