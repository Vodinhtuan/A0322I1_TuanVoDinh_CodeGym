package com.example.test.repository;

import com.example.test.model.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBillRepository extends JpaRepository<Bill, Integer> {
    @Query(value = "SELECT * FROM Bill b where b.quantity like %:keyword%",
            countQuery = "SELECT * FROM Bill b where b.quantity like %:keyword%",nativeQuery = true)
    Page<Bill> findByKeyword(@Param("keyword") String keyword, Pageable pageable);

}
