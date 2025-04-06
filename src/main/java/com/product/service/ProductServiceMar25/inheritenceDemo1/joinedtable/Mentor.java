package com.product.service.ProductServiceMar25.inheritenceDemo1.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="jt_mentor")
//@PrimaryKeyJoinColumn(name="user_id")
public class Mentor extends User {
    private String company;
}
