package com.example.demoMdb;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class StudentController {

    @Autowired
    private StudentDao student;

    @GetMapping
    public List<Student> getByLastName(){
        return student.findByLastname("Alice");
    }


}
