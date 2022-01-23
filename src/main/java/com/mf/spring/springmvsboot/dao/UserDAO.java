package com.mf.spring.springmvsboot.dao;

import com.mf.spring.springmvsboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDAO {

    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUser(long id);

    void updateUser(User user);
}
