package com.luxkapotter.urubupix.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Permitindo solicitações para qualquer endpoint
                registry.addMapping("/**")
                            // Permitindo solicitações de qualquer origem 
                        .allowedOrigins("*")
                            // Permitindo solicitações para qualquer método
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                            // Permitindo solicitações para qualquer header
                        .allowedHeaders("*");
            }
        };
    }

}
