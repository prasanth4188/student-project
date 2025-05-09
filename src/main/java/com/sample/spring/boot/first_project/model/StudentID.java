package com.sample.spring.boot.first_project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class StudentID {

    @Id
    @Column(name = "student_id", nullable = false)
    private Long id;
}
