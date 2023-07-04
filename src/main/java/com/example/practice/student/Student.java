package com.example.practice.student;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;
}
