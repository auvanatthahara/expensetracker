package com.atthahara.expensetracker.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.atthahara.expensetracker.dto.user.UserRequestDto;
import com.atthahara.expensetracker.dto.user.UserResponseDto;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }

    public UserResponseDto createUser(UserRequestDto data) {
        throw new UnsupportedOperationException("method is not finised");
    }

}
