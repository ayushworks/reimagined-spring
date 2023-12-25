package com.ayush.demo;

import org.springframework.beans.factory.annotation.Value;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;;;

@Path("/hello")
public class HelloResource {
    
    @Value("${name}")
    String name;

    @GET
    public String sayHello(){
        return "Hello "+name +", From Spring"; 
    }

}
