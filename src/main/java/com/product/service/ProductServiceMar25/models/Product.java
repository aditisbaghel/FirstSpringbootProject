package com.product.service.ProductServiceMar25.models;

import lombok.Getter;
import lombok.Setter;
//one product will have one category
@Getter
@Setter
public class Product extends BaseModel{
    private String title;
    private Double price;
    private Category category;
    private String description;
    private String image;
}
