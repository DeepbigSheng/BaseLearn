package com.victor.controller;

import com.victor.model.SerializableStudent;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SerializableTestController {

    @RequestMapping("/student/{id}")
    public SerializableStudent getSerializableStudent(@PathVariable("id") String id){
        SerializableStudent student = new SerializableStudent();
        student.setId(id);
        student.setName("林");
        student.setAge("11");
        student.setGender("男");
        student.setLevel("A");
        return student;
    }
}
