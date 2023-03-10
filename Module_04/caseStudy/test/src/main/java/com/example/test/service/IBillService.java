package com.example.test.service;

import com.example.test.model.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBillService {
    void Update (Bill bill);
    Page<Bill> findAll(Pageable pageable);
    void delete(Integer id);
    void Save (Bill bill);

    Bill findById(Integer id);

    Page<Bill> getByKeyword(String keyword, Pageable pageable);
}
