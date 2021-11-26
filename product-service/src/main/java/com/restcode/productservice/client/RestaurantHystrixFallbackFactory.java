package com.restcode.productservice.client;

import com.restcode.productservice.domain.reference.Restaurant;
import org.springframework.stereotype.Component;

@Component
public class RestaurantHystrixFallbackFactory implements RestaurantClient{

    @Override
    public Restaurant getOne(Long id) {
        Restaurant restaurant = Restaurant.builder()
                .name("none")
                .address("none").build();
        return restaurant;
    }
}
