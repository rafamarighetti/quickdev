[![Build Status](https://travis-ci.com/coma123/Spring-Boot-Blog-REST-API.svg?branch=development)](https://travis-ci.com/coma123/Spring-Boot-Blog-REST-API) [![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=coma123_Spring-Boot-Blog-REST-API&metric=alert_status)](https://sonarcloud.io/dashboard?id=coma123_Spring-Boot-Blog-REST-API) [![CII Best Practices](https://bestpractices.coreinfrastructure.org/projects/3706/badge)](https://bestpractices.coreinfrastructure.org/projects/3706)

# Spring Boot, MySQL, Spring Security, JWT, JPA, Rest API

Build Restful CRUD API for a blog using Spring Boot, Mysql, JPA and Hibernate.


## Requerimentos

```Ter instalado 
Java 17, Apache Maven 3.9.6 e Docker 25
 ```


## Steps to Setup

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

**4. Acesso a aplicação**

```bash
mvn spring-boot:run
```
No endereço de login <http://localhost:8080/auth/login>

No endereço de cadastro <http://localhost:8080/auth/singup>

Após efetuar o cadastro, o usuário poderá autenticar no link acima, para obter o token de acesso as demais rotas enviadas que estarão
na collection que pode ser executada no aplicativo de preferencia (sugerido o Postman). 

