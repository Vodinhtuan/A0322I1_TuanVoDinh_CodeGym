package com.example.test.service.impl;

import com.example.test.model.Product;
import com.example.test.repository.IProductRepository;
import com.example.test.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Override
    public Iterable<Product> listAll() {
        return productRepository.findAll();
    }


}
