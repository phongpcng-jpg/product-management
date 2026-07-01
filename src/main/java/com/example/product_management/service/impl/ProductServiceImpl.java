package com.example.product_management.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.product_management.model.Product;
import com.example.product_management.service.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductServiceImpl() {

        products.add(new Product(1L, "Laptop", 25000));

        products.add(new Product(2L, "Mouse", 300));

        products.add(new Product(3L, "Keyboard", 800));

    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product addProduct(Product product) {
        products.add(product);

        return product;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        for (Product p : products) {
            if (p.getId().equals(id)) {

                p.setName(product.getName());

                p.setPrice(product.getPrice());

                return p;
            }
        }

        return null;
    }

    @Override
    public boolean deleteProduct(Long id) {
        
        return products.removeIf(p -> p.getId().equals(id));
    }
}
