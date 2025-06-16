package com.atthahara.expensetracker.service;

import com.atthahara.expensetracker.dto.user.UserRequestDto;
import com.atthahara.expensetracker.dto.user.UserResponseDto;

public interface UserService {

    UserResponseDto createUser(UserRequestDto data);

    UserResponseDto login(UserRequestDto data);

}
