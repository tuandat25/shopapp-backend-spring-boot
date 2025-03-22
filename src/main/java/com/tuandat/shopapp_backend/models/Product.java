package com.tuandat.shopapp_backend.models;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    private String name;

    private float price;

    private String thumbnail;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
