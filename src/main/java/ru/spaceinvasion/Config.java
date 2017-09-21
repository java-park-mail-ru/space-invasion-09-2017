package ru.spaceinvasion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Config {
    @Bean
    @SuppressWarnings("AnonymousInnerClassMayBeStatic")
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/v1/**")
                    .allowCredentials(true).allowedOrigins(
                        "space-invasion.ru",
                        "space-invasion.herokuapp.com",
                        "www.space-invasion.ru",
                        "www.space-invasion.herokuapp.com"
                ).allowedMethods("GET", "POST", "PATCH", "DELETE");
            }
        };
    }
}