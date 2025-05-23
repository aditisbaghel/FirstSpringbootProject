package com.product.service.ProductServiceMar25.controllers;

import com.product.service.ProductServiceMar25.exceptions.ProductNotFoundException;
import com.product.service.ProductServiceMar25.models.Product;
import com.product.service.ProductServiceMar25.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

//    public ProductController(@Qualifier("FakeStoreProductService") ProductService productService){
public ProductController(@Qualifier("SelfProductService") ProductService productService){
        this.productService = productService;
    }

    // http://localhost:8080/products/1 => Get a single product with id = 1
    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long productId) throws ProductNotFoundException {
        return productService.getSingleProduct(productId);
    }
    // http://localhost:8080/products => Get all the products.
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }


    /*
        json type input
        {
        "title" : "One plus nord2",
        "desc" : "good camera quality.",
        "price" : "30000"
        }

     */
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);

    }
// http://localhost:8080/products/1
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long productId){

    }
    @PutMapping("/{id}")
    public void updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }
    @PatchMapping("/{id}") //Partial update
    public void replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){

    }
}
