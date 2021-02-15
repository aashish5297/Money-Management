package com.management.money.dao;

import com.management.money.model.User;

public interface UserCrudDao {

	User createUser(User user);

	User updateUser(User user);

	User readUser(String userId);


}
