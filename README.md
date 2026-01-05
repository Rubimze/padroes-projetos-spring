# 📦 Projeto Clientes API

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=flat-square&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen?style=flat-square&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=flat-square&logo=apachemaven)
![H2 Database](https://img.shields.io/badge/H2-Database-lightgrey?style=flat-square)
![JPA](https://img.shields.io/badge/JPA-Hibernate-red?style=flat-square)
![OpenFeign](https://img.shields.io/badge/OpenFeign-HTTP%20Client-blueviolet?style=flat-square)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-green?style=flat-square&logo=swagger)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=flat-square)

---

## 📖 Sobre o Projeto

API REST desenvolvida com **Spring Boot**, utilizando **JPA/Hibernate**, **H2 (banco de dados em memória)**, **OpenFeign** para consumo da API **ViaCEP** e documentação automática com **Swagger (OpenAPI)**.

O projeto aplica conceitos de **boas práticas de arquitetura**, incluindo os padrões **Strategy**, **Facade** e **Singleton**.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Cloud OpenFeign
- H2 Database
- Swagger / OpenAPI (SpringDoc)
- Maven

---

## 🧠 Padrões de Projeto Aplicados

### Strategy
A interface `ClienteService` define o contrato para as regras de negócio, permitindo múltiplas implementações.

### Facade
O `ClienteRestController` abstrai toda a complexidade de integrações (Banco de Dados H2 e API ViaCEP) em uma interface REST simples e coesa.

### Singleton
Os serviços anotados com `@Service` são gerenciados como **Singleton** pelo container Spring.

---

## 📁 Estrutura do Projeto

```text
src/main/java
└── com.gof
    ├── Application.java
    ├── controller
    │   └── ClienteRestController.java
    ├── model
    │   ├── Cliente.java
    │   └── Endereco.java
    ├── repository
    │   ├── ClienteRepository.java
    │   └── EnderecoRepository.java
    └── service
        ├── ClienteService.java
        ├── ClienteServiceImpl.java
        └── ViaCepService.java
```
---

## 🔗 Integração com ViaCEP

A integração com a API do **ViaCEP** é feita utilizando **Spring Cloud OpenFeign**, permitindo a busca automática de endereços a partir do CEP informado.

```java
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
```



---

## 🗄️ Banco de Dados H2

O projeto utiliza **H2 em memória**, sendo ideal para ambientes de desenvolvimento e testes.

> ⚠️ **Nota:** O banco é criado automaticamente ao iniciar a aplicação e todos os dados são **perdidos** ao encerrar o processo.

### Acessar Console H2
URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

---


## 📘 Documentação da API (Swagger)

A API é documentada automaticamente utilizando **Swagger UI**, facilitando a visualização e testes dos endpoints.

- **Swagger UI (Visual):** [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
- **OpenAPI (JSON):** [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)
