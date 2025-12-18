package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.EntityClass.User;

public interface StudentRepository extends JpaRepository<User, Long> {

}
