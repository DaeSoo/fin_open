package com.fintech.openbangking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fintech.openbangking.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
