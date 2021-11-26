package com.example.salesservice.domain.reference;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
    private Long id;

    private boolean enabled;

    private String name;

    private Double price;

    private String description;
}
