package com.atthahara.expensetracker.dto.user;

import lombok.Getter;
import lombok.Setter;

public class UserResponseDto {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String role;

}
