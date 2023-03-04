package com.example.finaltest.service;

import com.example.finaltest.model.KhuyenMai;
import com.example.finaltest.repository.IKhuyenMaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenMaiService implements IKhuyenMaiService{
    @Autowired
   private IKhuyenMaiRepository repository;


    @Override
    public void Update(KhuyenMai khuyenMai) {
        repository.save(khuyenMai);
    }

    @Override
    public List<KhuyenMai> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void Save(KhuyenMai khuyenMai) {
        repository.save(khuyenMai);
    }

    @Override
    public KhuyenMai findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<KhuyenMai> getByKeyword(String keyword) {
        return repository.findByKeyword(keyword);
    }
}
