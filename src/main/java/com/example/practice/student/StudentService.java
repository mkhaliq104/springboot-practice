package com.example.practice.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){

        Student student = Student.builder()
                .name("Maha")
                .email("test")
                .id(1L)
                .age(12)
                .dob(LocalDate.of(2002, Month.NOVEMBER,21))
                .build();
        return List.of(student);
    }
}
