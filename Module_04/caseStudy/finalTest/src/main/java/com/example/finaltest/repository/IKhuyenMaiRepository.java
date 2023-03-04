package com.example.finaltest.repository;

import com.example.finaltest.model.KhuyenMai;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface IKhuyenMaiRepository extends JpaRepository<KhuyenMai, Integer> {
    @Query(value = "SELECT * FROM khuyen_mai where muc_giam like %:keyword%", nativeQuery = true)
    List<KhuyenMai> findByKeyword(@Param("keyword") String keyword);

}
