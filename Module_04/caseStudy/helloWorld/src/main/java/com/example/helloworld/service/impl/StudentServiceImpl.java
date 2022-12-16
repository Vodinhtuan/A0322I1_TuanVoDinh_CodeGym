package com.example.helloworld.service.impl;

import com.example.helloworld.model.Student;
import com.example.helloworld.repository.StudentRepository;
import com.example.helloworld.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Student> findAllWithPaging(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Page<Student> searchByNameOrEmail(Pageable pageable, String searchVal) {
        return studentRepository.findByNameContainingOrEmailContainingOrClassName_NameContaining(pageable, searchVal, searchVal, searchVal);
    }


}
