package com.example.finaltest.repository;

import com.example.finaltest.model.KhuyenMai;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IKhuyenMaiRepository extends JpaRepository<KhuyenMai, Integer> {
    @Query(value = "SELECT * FROM khuyen_mai where muc_giam like %:keyword% or bat_dau like %:keyword% or ket_thuc like %:keyword%", nativeQuery = true)
    List<KhuyenMai> findByKeyword(@Param("keyword") String keyword);

}
