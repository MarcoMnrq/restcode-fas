package com.example.salesservice.domain.model;

import com.example.salesservice.domain.reference.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@JsonIgnoreProperties(value = {"id"}, allowGetters = true)
public class SaleItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double price; // product.getPrice() * quantity

    private Boolean onSale;

    private Integer quantity;

    @Transient
    private Product product; // Precio unitario

    @ManyToOne()
    private Sale sale;
}
