package com.product.service.ProductServiceMar25.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass //there will be no table for parent class but table of child class will be crated and all the attributes of parents
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO INC
    private Long id;
    private Long createdAt;
    private Long lastUpdatedAt;
}
