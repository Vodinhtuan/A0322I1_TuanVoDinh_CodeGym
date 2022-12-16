package com.example.helloworld.service;

import com.example.helloworld.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    void create (Student student);
    void update (Student student);
    void delete (Integer id);
    Student findById(Integer id);
    Page<Student> findAllWithPaging(Pageable pageable);
    List<Student> getAll();
    Page<Student> searchByNameOrEmail(Pageable pageable, String searchVal);
}
