package com.product.service.ProductServiceMar25.inheritenceDemo1.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="msc_ta")
public class TA extends User{
private int noOfSessions;
}
