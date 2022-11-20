package com.codegym.ecommercepage.service;

import com.codegym.shoppingcart.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
