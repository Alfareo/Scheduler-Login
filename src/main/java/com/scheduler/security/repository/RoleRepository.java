package com.scheduler.security.repository;

import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.scheduler.security.models.ERole;
import com.scheduler.security.models.Role;

public interface RoleRepository extends MongoRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
