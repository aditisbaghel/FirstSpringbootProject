package com.product.service.ProductServiceMar25.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//it allows you to write web apis
/*
https://scaler.com/mentee-dashboard/classes/1234
mock interview
classes
origin - delhi
destination - bangalore

1. Bangalore
2. Society Name + pincode
3. Flat Number - C602

Request in Spring -

http://localhost:8080/sample/

 */
@RestController
@RequestMapping("/sample")
public class SampleController {

    //http://localhost:8080/sample/hello/Raja
    @GetMapping("/hello/{name}/{times}")
    public String sayHello(@PathVariable("name") String name, @PathVariable("times") int times){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<times;i++){
            result.append("Hello "+name+" <br>");
        }
        return result.toString();
    }

    @GetMapping("/bye")
    public String sayBye(){
        return " Bye Everyone!";
    }
}
