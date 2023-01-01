package com.semestral.eshop.service;

import com.semestral.eshop.domain.Product;
import com.semestral.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product toAdd) {
        return productRepository.save(toAdd);
    }

    @Override
    public Product update(Product toUpdate) {
        return productRepository.save(toUpdate);
    }

    @Override
    public void delete(Long toDelete) {
        productRepository.deleteById(toDelete);
    }

    @Override
    public Optional<Product> findById(Long toFind) {
        return productRepository.findById(toFind);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
