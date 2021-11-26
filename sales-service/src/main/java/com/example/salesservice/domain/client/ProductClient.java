package com.example.salesservice.domain.client;

import com.example.salesservice.domain.reference.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "PRODUCT-SERVICE",fallback = ProductHystrixFallbackFactory.class)
public interface ProductClient {
    @GetMapping("/api/v2/products/{id}")
    Product getOne(@PathVariable(name = "id") Long id);
}
