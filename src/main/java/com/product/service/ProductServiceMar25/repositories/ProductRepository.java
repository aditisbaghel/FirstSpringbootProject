package com.product.service.ProductServiceMar25.repositories;

import com.product.service.ProductServiceMar25.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Override
    Optional<Product> findById(Long productId);
    //select * from products where id = productId

    @Override
    List<Product> findAll();

    List<Product> findAllByTitle(String title);
}
