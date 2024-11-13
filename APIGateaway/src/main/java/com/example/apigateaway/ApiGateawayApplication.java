package com.example.apigateaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
public class ApiGateawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGateawayApplication.class, args);
    }

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(" MicroserviceReclamation", r -> r.path("/Reclamation/**")
                        .uri("http://MicroserviceReclamation:8075/"))
                .build();


    }



}
