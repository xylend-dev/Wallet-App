## e-wallet 
Full stack web app with React and Spring Boot used for managing digital wallet and transactions.

<br/>

<img src="backend/src/main/resources/docs/images/dashboard.png" width="1060"/>

<br/>

<img src="backend/src/main/resources/docs/images/wallets.png" width="1060"/>
<br/>

### Description
This application allows users to implement e-wallet with REST API to create it, top it up, check its balance and withdraw. 
Users can register and login to the system using their credentials. They can also add any wallets for any account provided by IBAN 
and transfer to their wallet or any other wallet defined in the system.

The application also has a custom IBAN validator that can easily be applied any IBAN fields via annotation as shown below:

```
@ValidIban(message = "{iban.valid}")
private String iban;
```

<br/>

<img src="backend/src/main/resources/docs/images/transactions.png" width="1060"/>

<br/>

<img src="backend/src/main/resources/docs/images/transfers.png" width="1060"/>

<br/>

### Architecture

The relationship between the entities is shown on [Architecture](backend/src/main/resources/docs/architecture.md) section.

<br/>

### Getting Started

In order to run and test the application, see details on [How to run?](backend/src/main/resources/docs/how_to_run.md) and [How to test?](backend/src/main/resources/docs/how_to_test.md) sections.

<br/>

### Dependencies

* Spring Boot
* Spring Web
* Spring Security
* Spring Data JPA
* Lombok
* MapStruct
* PostgreSQL
* Flyway
* React
* Node.js
* Material UI

<br/>

### Documentation
[Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)<br/>
[Spring Security](https://docs.spring.io/spring-security/reference/index.html)<br/>
[Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)<br/>
[springdoc-openapi v2](https://springdoc.org/v2/)<br/>
[MapStruct](https://mapstruct.org/)<br/>
[JUnit 5](https://junit.org/junit5/docs/snapshot/user-guide/)<br/>
[Entity Relationship Diagram (ERD)](https://www.lucidchart.com/pages/er-diagrams)<br/>
[React](https://react.dev/)<br/>
[Material UI](https://mui.com/)<br/>
[Notistack](https://notistack.com/features/basic)<br/>
[Register of countries using the IBAN standard](https://www.iban.com/structure)<br/>

<br/>

### Version History

* v1.0.0 Initial Release

<br/>
<br/>