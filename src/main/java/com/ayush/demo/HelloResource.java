package com.ayush.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;;;

@Component
@Path("/hello")
public class HelloResource {
    
    @Value("${name}")
    String name;

    @GET
    public String sayHello(){
        return "Hello "+name +", From Spring"; 
    }

}
