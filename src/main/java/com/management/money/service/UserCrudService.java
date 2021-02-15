package com.management.money.service;

import com.management.money.model.User;

public interface UserCrudService {

	User updateUser(User user);

	User createUser(User user);

	User readUser(String userId);


}
