package com.product.service.ProductServiceMar25.services;

import com.product.service.ProductServiceMar25.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);

    List<Product> getAllProducts();

    Product createProduct(Product product);

    void deleteProduct(Long productId);

    void updateProduct(Long productId, Product product);

    void replaceProduct(Long productId, Product product);
}
