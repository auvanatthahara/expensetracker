package com.atthahara.expensetracker.dao;

import java.util.Optional;

import com.atthahara.expensetracker.model.User;

public interface UserDao {

    User insert(User user);

    Optional<User> findByEmail(String email);

}