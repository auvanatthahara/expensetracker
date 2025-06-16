package com.atthahara.expensetracker.dto.user;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

public class UserResponseDto {

    @Getter
    @Setter
    private UUID id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String role;

    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private String token;

}
