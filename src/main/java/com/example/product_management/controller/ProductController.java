package com.example.product_management.controller;

import com.example.product_management.service.IProductService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }
}
