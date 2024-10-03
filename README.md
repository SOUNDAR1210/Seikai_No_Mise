# Seikai No Mise - E-commerce Platform

## Overview

This project is a comprehensive backend service for an e-commerce platform, focusing on shopping cart management. It is built using Java and Spring Boot, with Maven for dependency management and Hibernate/JPA for database interactions.

## Technologies Used

- **Java**
- **Spring Boot**
- **Maven**
- **Hibernate**
- **JPA**

## Features

### Cart Management

- **Retrieve Cart**: Users can retrieve their cart details.
- **Clear Cart**: Users can clear all items from their cart.
- **Get Total Price**: The application calculates and returns the total price of items in the cart.
- **Initialize New Cart**: The application can initialize a new cart.

### Product Management

- **Add/Update/Delete Products**: Functionality to manage product details.
- **Product Search and Filtering**: Users can search and filter products.

### Image Management

- **Upload Image**: Users can upload images for products.
- **Retrieve Image**: Users can retrieve images by product ID.
- **Delete Image**: Users can delete images associated with a product.

### Category Management

- **Add Category**: Functionality to add new product categories.
- **Update Category**: Functionality to update existing product categories.
- **Delete Category**: Functionality to delete product categories.
- **Retrieve Categories**: Users can retrieve all product categories.


### Custom Serialization

- Developed custom serializers for handling complex data types in API responses.

### Exception Handling

- Implemented robust exception handling for resource management.

## API Endpoints

### Cart Endpoints

- `GET /api/cart/{id}`: Retrieve cart details by ID.
- `POST /api/cart/clear`: Clear all items from the cart.
- `GET /api/cart/total`: Get the total price of items in the cart.
- `POST /api/cart/new`: Initialize a new cart.

### Product Endpoints

- `GET /api/products`: Retrieve all products.
- `POST /api/products`: Add a new product.
- `PUT /api/products/{id}`: Update product details.
- `DELETE /api/products/{id}`: Delete a product.

### Order Endpoints

- `POST /api/orders`: Place a new order.
- `GET /api/orders/{id}`: Retrieve order details by ID.
- `GET /api/orders/user/{userId}`: Retrieve all orders for a user.

### Image Endpoints

- `POST /api/images/upload`: Upload a new image.
- `GET /api/images/{productId}`: Retrieve image by product ID.
- `DELETE /api/images/{productId}`: Delete image by product ID.

### Category Endpoints

- `POST /api/categories`: Add a new category.
- `PUT /api/categories/{id}`: Update category details.
- `DELETE /api/categories/{id}`: Delete a category.
- `GET /api/categories`: Retrieve all categories.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- A relational database (e.g., MySQL, PostgreSQL)

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/SOUNDAR1210/Seikai_No_Mise.git
   ```
2. Navigate to the project directory:
```sh
   cd project/seikai_no_mise
```
3. Update the application.properties file with your database configuration.

### Running the Application\

1. Build the project using Maven:
```sh
  mvn clean install
```

2. Run the application:
```sh
  mvn spring-boot:run
  java -jar your_application.jar
```
3. Testing
Run the tests using Maven:
```sh
  mvn test
```

### Contact

For any inquiries or feedback, please contact rsoundar012@gmail.com
