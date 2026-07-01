package com.example.product_management.service;

import com.example.product_management.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> getAllProducts();

    Product addProduct(Product product);

    Product updateProduct(Long id, Product product);

    boolean deleteProduct(Long id);
    
}
