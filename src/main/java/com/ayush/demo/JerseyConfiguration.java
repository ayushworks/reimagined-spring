package com.ayush.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfiguration extends ResourceConfig{
    public JerseyConfiguration() {
        register(HelloResource.class);
    }
}
