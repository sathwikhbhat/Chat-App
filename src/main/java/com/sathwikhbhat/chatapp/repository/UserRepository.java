package com.sathwikhbhat.chatapp.repository;

import com.sathwikhbhat.chatapp.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
