package com.LIT.auth.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LIT.auth.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByGoogleId(String googleId);
}
