# Online Bookstore Backend

This project is a backend service for an online bookstore, designed using Spring Boot and MySQL. It provides RESTful APIs for managing book listings, shopping cart operations, and order tracking.

## Features

- **Book Management**: 
  - List all books
  - Retrieve book details by ID
  - Create, update, and delete books

- **Cart Operations**: 
  - Get cart details by user ID
  - Add books to the cart
  - Remove books from the cart
  - Clear the cart

- **Order Tracking**: 
  - Create new orders
  - Retrieve order details by order ID
  - Get all orders for a specific user

## Technologies Used

- Spring Boot
- MySQL
- Maven

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd online-bookstore-backend
   ```

2. **Configure the database**:
   - Update the `src/main/resources/application.properties` file with your MySQL database connection details.

3. **Run the application**:
   ```
   mvn spring-boot:run
   ```

4. **API Testing**:
   - Use Postman to test the APIs. Below are some example requests:

### API Endpoints

- **Books**
  - `GET /api/books` - Retrieve all books
  - `GET /api/books/{id}` - Retrieve a book by ID
  - `POST /api/books` - Create a new book
  - `PUT /api/books/{id}` - Update a book
  - `DELETE /api/books/{id}` - Delete a book

- **Cart**
  - `GET /api/cart/{userId}` - Get cart by user ID
  - `POST /api/cart/{userId}` - Add a book to the cart
  - `DELETE /api/cart/{userId}/{bookId}` - Remove a book from the cart
  - `DELETE /api/cart/{userId}` - Clear the cart

- **Orders**
  - `POST /api/orders/{userId}` - Create a new order
  - `GET /api/orders/{orderId}` - Get order by ID
  - `GET /api/orders/user/{userId}` - Get all orders for a user

## Database Initialization

The project includes a `data.sql` file located in `src/main/resources/` to initialize the database with sample data.

## License

This project is licensed under the MIT License.