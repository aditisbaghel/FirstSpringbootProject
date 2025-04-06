package com.product.service.ProductServiceMar25.inheritenceDemo1.singletable;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity(name = "st_user")
@DiscriminatorColumn(
        name = "userType",
        discriminatorType = DiscriminatorType.INTEGER
)
@DiscriminatorValue(value = "0")
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;

}

/*
there will be extra column as usertype
1 for instructor
2 for mentor
3 for TA

even though @Entity is annotated in child class still table will not be created because parent class @SingleTypeEntity is already defined\
also in this single table need to have extra column as userType give that as discriminatorColumn
 */