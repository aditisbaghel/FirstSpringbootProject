package com.product.service.ProductServiceMar25.inheritenceDemo1.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="tpc_instructor")
public class Instructor extends User {
private String specialization;
private double avgRating;

}
