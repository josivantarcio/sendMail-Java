# Java Email Sending Project

This is a simple project demonstrating how to send emails using Java 17 LTS, Spring, Postman, and H2.

![Java](https://img.shields.io/badge/Java-17_LTS-blue)
![Spring](https://img.shields.io/badge/Spring-5.0-green)
![Postman](https://img.shields.io/badge/Postman-Collection-orange)
![H2](https://img.shields.io/badge/H2-Database-yellow)

## Description

This project utilizes Spring Boot to create a service that allows sending emails via a RESTful API. H2 is used as an in-memory database to store email sending records.

## Prerequisites

- JDK 17 LTS installed
- Maven 3.x installed
- Postman (for testing the API)

## Configuration

1. Clone the repository:
   ```
   git clone https://github.com/josivantarcio/sendMail-Java.git
   ```

2. Navigate to the project directory:
   ```
   cd sendMail-Java
   ```

3. Run the project using Maven:
   ```
   mvn spring-boot:run
   ```

## Usage

1. Use Postman or any other tool to send HTTP requests to the API endpoint:
   ```
   POST http://localhost:8080/api/send-email
   ```

   Example request body:
   ```json
   {
       "to": "recipient@example.com",
       "subject": "Email Subject",
       "body": "Email Content"
   }
   ```

2. Check the Spring Boot console for email sending logs and H2 database confirmations.

## Contribution

Contributions are welcome! Feel free to open a pull request or report issues.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
