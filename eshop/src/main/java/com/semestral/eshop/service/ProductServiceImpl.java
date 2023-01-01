package com.semestral.eshop.service;

import com.semestral.eshop.domain.Product;
import com.semestral.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product toAdd) {
        return null;
    }

    @Override
    public Product update(Product toUpdate) {
        return null;
    }

    @Override
    public Product delete(Product toDelete) {
        return null;
    }

    @Override
    public Product findById(Long toFind) {
        return null;
    }
}
