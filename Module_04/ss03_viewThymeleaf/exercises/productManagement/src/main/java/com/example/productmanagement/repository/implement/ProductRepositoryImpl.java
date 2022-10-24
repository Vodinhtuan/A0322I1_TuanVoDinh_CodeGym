package com.example.productmanagement.repository.implement;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.ProductRepository;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository {
    private static Map<String,Product> productMap;

    static {
        productMap = new LinkedHashMap<>();
        productMap.put("001", new Product("001","product 01", 12345, "OOA", "Hello"));
        productMap.put("002", new Product("002","product 02", 54545, "OOA", "actical"));
        productMap.put("003", new Product("003","product 03", 535, "OOA", "keepFit"));
        productMap.put("004", new Product("004","product 04", 223, "OOA", "doGardening"));
        productMap.put("005", new Product("005","product 05", 767, "OOA", "Hi"));
        productMap.put("006", new Product("006","product 06", 787, "OOA", "medical"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void create(Product product) throws Exception {
        if(productMap.containsKey(product.getId())){
            throw new Exception("Duplicate id");
        }else {
            productMap.put(product.getId(),product);
        }
    }

    @Override
    public void update(Product product) throws Exception {
        if(!productMap.containsKey(product.getId())){
            throw new Exception("Product not Found");
        }else{
            productMap.put(product.getId(),product);
        }
    }

    @Override
    public void delete(String id) throws Exception {
        if(productMap.containsKey(id)){
            productMap.remove(id);
        }else{
            throw new Exception("Product not Found");
        }
    }

    @Override
    public Product findById(String id) throws Exception {
        if(productMap.containsKey(id)){
            return productMap.get(id);
        }
        throw new Exception("Product not Found");
    }

    @Override
    public List<Product> findByName(String name) throws Exception {
        List<Product> result = new LinkedList<>();
        Set<String> sizeMap = productMap.keySet();
        for(String status: sizeMap){
            if(productMap.get(status).getName().matches(".*["+name+"].*")){
                result.add(productMap.get(status));
            }
        }
        if(result.size() != 0){
            return result;
        }
        throw new Exception("Product not Found");
    }
}
