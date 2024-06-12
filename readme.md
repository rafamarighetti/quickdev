# Spring Boot, MySQL, Spring Security, JWT, JPA, Rest API

API Restful CRUD desenvolvida para um blog usando Spring Boot, Mysql, JPA e Hibernate.


## Requerimentos

Java 17, Apache Maven 3.9.6 e Docker 25


## Etapas do de execução

**1. Clonando o Projeto**

```bash
git clone https://github.com/coma123/Spring-Boot-Blog-REST-API.git
```

**2. Executando o banco de Dados pelo Container**
```bash
run docker-compose up 

```
**3. Executando o projeto pelo Springboot**
```bash
run mvn spring-boot

```

No endereço de login <http://localhost:8080/auth/login>

No endereço de cadastro <http://localhost:8080/auth/singup>

Após efetuar o cadastro, o usuário poderá autenticar no link acima, para obter o token de acesso as demais rotas enviadas que estarão
na collection que pode ser executada no aplicativo de preferencia (sugerido o Postman). 

