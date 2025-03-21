package com.product.service.ProductServiceMar25.controllers;

import com.product.service.ProductServiceMar25.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    // http://localhost:8080/products/1 => Get a single product with id = 1
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId){
        return new Product();
    }
    // http://localhost:8080/products => Get all the products.
    @GetMapping
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return new Product();

    }
// http://localhost:8080/products/1
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long productId){

    }
    @PutMapping("/{id}")
    public void updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }
    @PatchMapping("/{id}")
    public void replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }
}
