package com.example.test.repository;

import com.example.test.model.ProductType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProductTypeRepository extends PagingAndSortingRepository<ProductType, Integer> {
}
