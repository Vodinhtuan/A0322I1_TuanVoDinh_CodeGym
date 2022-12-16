package com.example.helloworld.repository;

import com.example.helloworld.model.ClassName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassNameRepository extends JpaRepository<ClassName, Integer> {
}
