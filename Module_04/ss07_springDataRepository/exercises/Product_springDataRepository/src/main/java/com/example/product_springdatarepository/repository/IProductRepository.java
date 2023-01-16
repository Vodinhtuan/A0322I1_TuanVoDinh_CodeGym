package com.example.product_springdatarepository.repository;

import com.example.product_springdatarepository.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select * from product",nativeQuery = true)
    Page<Product> findAll (Pageable pageable);

    Product findByNameContaining ( String nameProduct);
}
