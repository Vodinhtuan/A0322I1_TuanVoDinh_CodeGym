package com.example.test.service.impl;

import com.example.test.model.ProductType;
import com.example.test.repository.IProductTypeRepository;
import com.example.test.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService implements IProductTypeService {
    @Autowired
    private IProductTypeRepository productTypeRepository;
    @Override
    public Iterable<ProductType> listAll() {
        return productTypeRepository.findAll();
    }
}
