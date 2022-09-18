package com.scheduler.security.repository;

import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.scheduler.security.models.User;

public interface UserRepository extends MongoRepository<User, String> {
  Optional<User> findByUserName(String username);

  Boolean existsByUserName(String username);

  Boolean existsByEmail(String email);
}
