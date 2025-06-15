package com.atthahara.expensetracker.dto.user;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public class UserRequestDto {

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
    private LocalDateTime createdAt;

}
