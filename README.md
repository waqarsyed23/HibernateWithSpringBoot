# HibernateWithSpringBoot
Sample POC of Springboot and Hibernate 5.2.7

Author - Waqar Syed

This sample POC demonstarates the use of Hibernate 5.2.7 version with Spring Boot.
Refer to the pom.xml for all the required dependencies.

This application can be built using maven 3.2 or above.
Fromm the command line type: mvn clean install

Running the application: From the command line type: mvn spring-boot:run 
OR Run the main method in class Application.java

BookController is the REST controller which exposes two methods for inserting the records and reading the records from DB using Hibernate.

To insert the records:
POST, http://localhost:8080/book

Request:
{
  "id":1234, 
   "author":"Waqar Syed",
   "title":"Hibernate With SpringBoot Demo",
}


To Read the records from table:

GET - http://localhost:8080/book/1234

Response will be the json of book records from the mapped entity to DB table
