package com.example.demoMdb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface StudentDao extends MongoRepository<Student, String> {
    List<Student> findByLastname(String lastName);

}
