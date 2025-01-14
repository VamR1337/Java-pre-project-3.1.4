package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;


public interface UserService {

    List<User> findAll();

    User findByUsername(String username);

    User findUserById(Long id);

    void update(User user);

    void saveUser(User user);

    boolean deleteUserById(Long id);

}