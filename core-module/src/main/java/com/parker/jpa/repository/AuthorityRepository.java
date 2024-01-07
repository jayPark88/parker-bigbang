package com.parker.jpa.repository;

import com.parker.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<User, Long> {
}
