package service.implement;

import model.Product;
import repository.ProductRepository;
import repository.implement.ProductRepositoryImpl;
import service.ProductService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) throws Exception {
        productRepository.create(product);
    }

    @Override
    public void update(Product product) throws Exception {
        productRepository.update(product);
    }

    @Override
    public void delete(String id) throws Exception {
        productRepository.delete(id);
    }

    @Override
    public Product findById(String id) throws Exception {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findByName(String name) throws Exception {
        return productRepository.findByName(name);
    }
}
