package com.product.service.ProductServiceMar25.inheritenceDemo1.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "1")
public class Instructor extends User {
private String specialization;
private double avgRating;

}
