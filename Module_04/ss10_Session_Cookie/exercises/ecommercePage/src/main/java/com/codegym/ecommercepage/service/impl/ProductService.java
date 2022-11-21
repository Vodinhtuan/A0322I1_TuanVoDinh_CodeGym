package com.codegym.ecommercepage.service.impl;

import com.codegym.ecommercepage.model.Product;
import com.codegym.ecommercepage.repository.IProductRepository;
import com.codegym.ecommercepage.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
}