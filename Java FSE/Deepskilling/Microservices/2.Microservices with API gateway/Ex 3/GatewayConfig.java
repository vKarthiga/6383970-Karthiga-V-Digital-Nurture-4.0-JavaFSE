File:src/main/java/com/cognizant/apigateway/config/GatewayConfig.java

package com.cognizant.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("account-service", r -> r.path("/account/**")
                .uri("lb://account-service")) // lb = load balanced via Eureka
            .build();
    }
}
