package com.atthahara.expensetracker.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.atthahara.expensetracker.constant.MessageConstant;
import com.atthahara.expensetracker.dao.UserDao;
import com.atthahara.expensetracker.dto.user.UserRequestDto;
import com.atthahara.expensetracker.dto.user.UserResponseDto;
import com.atthahara.expensetracker.model.User;
import com.atthahara.expensetracker.service.UserService;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserDao userDao;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserDao userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        final User user = userDao.findByEmail(email).get();

        if (user != null) {
            return new org.springframework.security.core.userdetails.User(email, user.getPassword(),
                    new ArrayList<>());
        }
        throw new UsernameNotFoundException(MessageConstant.LOGIN_FAILED.message);
    }

    @Override
    public UserResponseDto createUser(UserRequestDto data) {
        final UserResponseDto response = new UserResponseDto();

        final User user = new User();
        user.setEmail(data.getEmail());
        user.setName(data.getName());
        user.setRole(data.getRole());
        user.setPassword(passwordEncoder.encode(data.getPassword()));

        final User result = userDao.insert(user);
        response.setId(result.getId());
        response.setMessage(MessageConstant.USER_CREATED.message);

        return response;
    }

    @Override
    public UserResponseDto login(UserRequestDto data) {
        UserResponseDto response = new UserResponseDto();

        Optional<User> userOpt = userDao.findByEmail(data.getEmail());
        if (userOpt.isEmpty()) {
            response.setMessage(MessageConstant.USER_NOT_FOUND.message);
            return response;
        }

        User user = userOpt.get();

        boolean passwordMatches = passwordEncoder.matches(data.getPassword(), user.getPassword());
        if (!passwordMatches) {
            response.setMessage(MessageConstant.INVALID_PASSWORD.message);
            return response;
        }

        response.setId(user.getId());
        response.setMessage(MessageConstant.LOGIN_SUCCESS.message);
        return response;
    }

}
