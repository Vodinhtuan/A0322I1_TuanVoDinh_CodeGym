package com.example.helloworld.service.impl;

import com.example.helloworld.model.ClassName;
import com.example.helloworld.repository.ClassNameRepository;
import com.example.helloworld.service.ClassNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassNameServiceImpl implements ClassNameService {

    @Autowired
    ClassNameRepository classNameRepository;
    @Override
    public List<ClassName> getAll() {
        return classNameRepository.findAll();
    }
}
