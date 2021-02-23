package com.sid.msbanque;

import com.sid.msbanque.web.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//pour deployer la servlet jersey
public class MyConfig {

    // @Bean //pour que cette methode s'execute au demarage.
    public ResourceConfig resourceConfig(){
        ResourceConfig jerseyServlet= new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSAPI.class);
        return jerseyServlet;
    }
}
