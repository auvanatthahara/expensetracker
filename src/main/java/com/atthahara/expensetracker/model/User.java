package com.atthahara.expensetracker.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private UUID id;

    @NotNull
    @Column(nullable = false)
    @Setter
    @Getter
    private String name;

    @NotNull
    @Email
    @Column(nullable = false, unique = true)
    @Setter
    @Getter
    private String email;

    @NotNull
    @Column(nullable = false)
    @Setter
    @Getter
    private String password;

    @NotNull
    @Column(nullable = false)
    @Setter
    @Getter
    private String role;

    @NotNull
    @Column(nullable = false)
    @Setter
    @Getter
    private LocalDateTime createdAt;

}
