<h1 align="center"> Spring Boot Ecommerce </h1> <br>

<p align="center">
  This is a microservices based ecommerce back-end project using Spring Boot, JPA and Hibernate for Object Relational Mapping (ORM), and a local test database (H2). The seeding of the database can be done by running `config/TestConfig`.
</p>
<p align="center">
  Project built using the MVC pattern containing a Service layer to further separate business logic from the resources. The resources (controllers) make a call to the respective service which is responsible to call the respective repository to perform the CRUD operations on the database.
</p>

<p align="center">
<img src="https://github.com/lucasnunesg/ecommerce-springboot3-jpa/blob/main/assets/images/database.png"/>
<img src="https://github.com/lucasnunesg/ecommerce-springboot3-jpa/blob/main/assets/images/layers.png"/>
</p>


## Entities Description

- pk:
  - `OrderItemPK`: auxiliary class to handle composite primary keys on the many-to-many relationship with extra attributes that occurs in `OrderItem` class.
- Enums:
  - `OrderStatus` with predefined codes to support scalability and future changes (if needed);
- `Category`: represents categories using ID's, names and a Set of products belonging to each category;
- `Order`: represents orders and has relationships between `User`, `Payment` and `OrderItem`;
- `OrderItem`: represents order items and stores the price of products at the time of the order;
- `Payment`: represents payment information;
- `Product`: represents registered ecommerce products;
- `User`: represents registered customers with basic information.

## Endpoints

[Postman collection to test endpoints](/assets/postman)

- '/categories':
  - `GET '/'`: returns all categories;
  - `GET '/{id}'`: returns information for specific product by id.
- '/orders':
  - `GET '/'`: returns all orders;
  - `GET '/{id}'`: returns information for specific order by id.
- '/products':
  - `GET '/'`: returns all categories;
  - `GET '/{id}'`: returns information for specific product by id.
- '/users':
  - `GET '/'`: returns all users;
  - `POST '/'`): saves new user (request body must contain name, email, phone and password);
  - `GET '/{id}'`: returns information for specific user id;
  - `DELETE '/{id}'`: deletes user by id;
  - `PUT '/{id}'`: update specific user information by id (request body must contain name, email and phone).
 
