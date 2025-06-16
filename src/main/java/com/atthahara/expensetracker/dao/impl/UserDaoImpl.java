package com.atthahara.expensetracker.dao.impl;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.atthahara.expensetracker.dao.UserDao;
import com.atthahara.expensetracker.model.User;
import com.atthahara.expensetracker.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao {

    private final UserRepository userRepository;

    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User insert(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
