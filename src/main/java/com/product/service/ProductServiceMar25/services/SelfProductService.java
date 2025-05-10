package com.product.service.ProductServiceMar25.services;

import com.product.service.ProductServiceMar25.exceptions.ProductNotFoundException;
import com.product.service.ProductServiceMar25.models.Category;
import com.product.service.ProductServiceMar25.models.Product;
import com.product.service.ProductServiceMar25.repositories.CategoryRepository;
import com.product.service.ProductServiceMar25.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SelfProductService")
//@Primary
public class SelfProductService implements ProductService {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;
    //@Autowired is deprecated so you should use constructor injection
    public SelfProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product getSingleProduct(Long productId) throws ProductNotFoundException {
        Optional<Product> productOptional = productRepository.findById(productId);
        if(productOptional.isEmpty())
            throw new ProductNotFoundException("Product with id: " +productId+ " not found ");
        return productOptional.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        if(product.getCategory()!=null){
            if(product.getCategory().getId() == null){
//                create a Category first.
                Category category = product.getCategory();
                String categoryValue = category.getValue();
                Optional<Category> categoryFromDB = categoryRepository.findByValue(categoryValue);
                if(categoryFromDB.isEmpty()){
                    category = categoryRepository.save(category);
                    product.setCategory(category);
                }
                else{
                    product.setCategory(categoryFromDB.get());
                }
            }
        }
        else{
            throw new RuntimeException("Category can't be empty");
        }
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public void updateProduct(Long productId, Product product) {

    }

    @Override
    public void replaceProduct(Long productId, Product product) {

    }
}
