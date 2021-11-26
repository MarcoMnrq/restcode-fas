package com.example.salesservice.domain.client;

import com.example.salesservice.domain.reference.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient{
    @Override
    public Product getOne(Long id) {
        Product product = Product.builder()
                .enabled(false)
                .name("none")
                .price(0.0)
                .description("none").build();
        return product;
    }
}
