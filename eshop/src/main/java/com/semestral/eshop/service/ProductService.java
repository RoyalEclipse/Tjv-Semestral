package com.semestral.eshop.service;

import com.semestral.eshop.domain.Product;

public interface ProductService {
        Product create(Product toAdd);
        Product update(Product toUpdate);
        Product delete(Product toDelete);
        Product findById(Long toFind );
}
