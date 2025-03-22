package com.tuandat.shopapp_backend.models;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private float price;

    @Column(name = "number_of_products")
    private int numberOfProducts;

    private float totalMoney;

    private String color;
}

