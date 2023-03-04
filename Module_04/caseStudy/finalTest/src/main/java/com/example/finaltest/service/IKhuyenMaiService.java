package com.example.finaltest.service;

import com.example.finaltest.model.KhuyenMai;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IKhuyenMaiService {
    void Update (KhuyenMai khuyenMai);
    List<KhuyenMai> findAll();
    void delete(Integer id);
    void Save (KhuyenMai khuyenMai);

    KhuyenMai findById(Integer id);

    List<KhuyenMai> getByKeyword(String keyword);
}
