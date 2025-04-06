package com.product.service.ProductServiceMar25.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
//one product will have one category
@Getter
@Setter
@Entity(name = "products")
public class Product extends BaseModel{
    private String title;
    private Double price;
    @ManyToOne
    private Category category;
    private String description;
    private String image;
}

 /*

 1              1
 Product ---- Category => M:1 category id in products table
 M              1

  */