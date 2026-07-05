package com.a1ka.library.repository;

import com.a1ka.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByLastName(String lastName);
    List<User> findByFirstName(String firstName);
}
