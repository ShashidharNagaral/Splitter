package com.splitwise.userservice.services;

import com.splitwise.userservice.entities.Group;
import com.splitwise.userservice.entities.User;

import java.util.List;
import java.util.Set;

public interface UserService {

    User registerUser(User user);
    User findUserByEmailAndPassword(String email, String password);

    Set<Group> getAllGroupsByUserID(String userID);
}