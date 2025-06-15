package com.atthahara.expensetracker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atthahara.expensetracker.dto.user.UserRequestDto;
import com.atthahara.expensetracker.dto.user.UserResponseDto;
import com.atthahara.expensetracker.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userDto) {
        final UserResponseDto response = userService.createUser(userDto);
        return new ResponseEntity<UserResponseDto>(response, HttpStatus.CREATED);
    }

}
