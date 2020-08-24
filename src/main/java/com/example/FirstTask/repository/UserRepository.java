package com.example.FirstTask.repository;

import com.example.FirstTask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
