package com.restcode.productservice.client;

import com.restcode.productservice.domain.reference.Restaurant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "RESTAURANT-SERVICE",fallback = RestaurantHystrixFallbackFactory.class)
public interface RestaurantClient {

    @GetMapping("/api/v2/restaurants/{id}")
    Restaurant getOne(@PathVariable(name = "id") Long id);
}
