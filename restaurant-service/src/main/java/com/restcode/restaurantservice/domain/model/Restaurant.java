package com.restcode.restaurantservice.domain.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;
}
