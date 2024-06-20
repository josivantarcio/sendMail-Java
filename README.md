# Projeto de Envio de Email com Java

Este é um projeto simples que demonstra como enviar emails utilizando Java 17 LTS, Spring, Postman e H2.

![Java](https://img.shields.io/badge/Java-17_LTS-blue)
![Spring](https://img.shields.io/badge/Spring-5.0-green)
![Postman](https://img.shields.io/badge/Postman-Collection-orange)
![H2](https://img.shields.io/badge/H2-Database-yellow)

## Descrição

Este projeto utiliza Spring Boot para criar um serviço que permite o envio de emails através de uma API RESTful. O H2 é utilizado como banco de dados em memória para armazenar os registros de envio de emails.

## Pré-requisitos

- JDK 17 LTS instalado
- Maven 3.x instalado
- Postman (para testar a API)

## Configuração

1. Clone o repositório:
   ```
   git clone https://github.com/josivantarcio/sendMail-Java.git
   ```

2. Navegue até o diretório do projeto:
   ```
   cd sendMail-Java
   ```

3. Execute o projeto usando Maven:
   ```
   mvn spring-boot:run
   ```

## Uso

1. Utilize o Postman ou qualquer outra ferramenta para enviar requisições HTTP para o endpoint da API:
   ```
   POST http://localhost:8080/api/send-email
   ```

   Exemplo de corpo da requisição:
   ```json
   {
       "to": "destinatario@example.com",
       "subject": "Assunto do Email",
       "body": "Conteúdo do Email"
   }
   ```

2. Verifique o console do Spring Boot para ver logs de envio de emails e confirmações do banco de dados H2.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request ou reportar issues.

## Licença

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).
