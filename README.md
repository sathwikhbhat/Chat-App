# Chat Application

A Real-Time One-on-One Chat Application built with Spring Boot and WebSocket.

## Features

- User Registration and Authentication
- Real-Time messaging using WebSockets
- One-on-One private conversations
- Online status indicators
- Message history persistence
- User-friendly interface

## Technologies Used

- Spring Boot 3
- Spring WebSocket
- MongoDB for message and user storage
- SockJS and STOMP for WebSocket communication
- HTML/CSS/JavaScript for the frontend

## Getting Started

### Prerequisites

- Java 17 or higher
- MongoDB
- Maven

### Installation

1. Clone the repository
2. Configure MongoDB connection in `application.properties`
3. Build the project with Maven:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring:boot run
   ```
5. Access the application at `http://localhost:8088`

## Usage

1. Enter your nickname and real name on the login page
2. Select a user from the online users list to start a conversation
3. Type your message and press send
4. Messages are delivered in real-time to the recipient

## Project Structure

- `src/main/java/com/sathwikhbhat/chatapp/chat`: Chat message handling
- `src/main/java/com/sathwikhbhat/chatapp/chatroom`: Chat room management
- `src/main/java/com/sathwikhbhat/chatapp/user`: User management
- `src/main/java/com/sathwikhbhat/chatapp/config`: WebSocket configuration
- `src/main/resources/static`: Frontend resources

## Acknowledgements

[Ali Bouali](https://github.com/ali-bouali)