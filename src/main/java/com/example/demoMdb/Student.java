package com.example.demoMdb;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return String.format("Studen[id='%s', firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
