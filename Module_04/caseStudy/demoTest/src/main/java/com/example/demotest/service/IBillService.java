package com.example.demotest.service;

import com.example.demotest.model.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBillService {
    void Update (Bill bill);
    Page<Bill> findAll(Pageable pageable);
    void delete(Integer id);
    void Save (Bill bill);

    Bill findById(Integer id);
}
