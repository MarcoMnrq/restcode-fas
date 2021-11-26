package com.restcode.productservice.domain.reference;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Restaurant {

    private Long id;

    private String name;

    private String address;
}
