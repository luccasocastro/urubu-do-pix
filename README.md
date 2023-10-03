<h1 align="center">
  Urubu do Pix
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

Inspirado pelo [Mano Deivyn](https://github.com/deyvin), resolvi implementar o meu próprio sistema que tem como referência um conhecido golpe chamado Urubu do Pix, que consiste em um usuário fazer um depósito de um X valor e após 30 dias ele poder sacar esse valor com 1000% de lucro, ou seja, a cada dia esse valor rende 33,33%. Lembrando que esse código nunca irá para produção, é um código exclusivamente para fins de aprendizado e pesquisa, não foi criado com o objetivo de cometer nenhum tipo de crime ou golpe,consiste em um desafio onde tento implementar a regra de negócio que rola por trás desse sistema, e reforço, não apoio nenhum tipo de golpe, crime ou algo que possa vir a causar algum mal.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Spring Validation](https://spring.io/guides/gs/validating-form-input/)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [H2 Database](https://www.h2database.com/html/download.html)
- [MySQL](https://www.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Valiudação dos campos
- Testes automatizados
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

