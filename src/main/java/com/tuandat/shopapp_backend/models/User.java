package com.tuandat.shopapp_backend.models;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    private String fullname;

    @Column(name = "phone_number", nullable = false, length = 10)
    private String phoneNumber;

    private String address;

    @Column(nullable = false)
    private String password;

    private boolean isActive = true;
    private LocalDate dateOfBirth;

    private int facebookAccountId;
    private int googleAccountId;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}

