package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.EntityClass.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile,Long> {

}


