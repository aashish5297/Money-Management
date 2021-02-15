package com.management.money.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.money.dao.UserCrudDao;
import com.management.money.model.User;

@Service
public class UserCrudServiceImpl implements UserCrudService {

    private UserCrudDao userCrudDao;

    @Autowired
    public UserCrudServiceImpl(UserCrudDao userCrudDao) {
        this.userCrudDao = userCrudDao;
    }

    @Override
    public User createUser(User user) {
        return userCrudDao.createUser(user);
    }

    @Override
    public User readUser(String userId) {
        return userCrudDao.readUser(userId);
    }

    @Override
    public User updateUser(User user) {
        return userCrudDao.updateUser(user);
    }



}