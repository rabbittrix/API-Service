package com.jrsf.api_service.repositories;

import com.jrsf.api_service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
