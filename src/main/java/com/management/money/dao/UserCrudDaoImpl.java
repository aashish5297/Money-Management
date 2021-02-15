package com.management.money.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.management.money.model.User;

@Component
public class UserCrudDaoImpl implements UserCrudDao {

    private DynamoDBMapper dynamoDBMapper;

    @Autowired
    public UserCrudDaoImpl(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    @Override
    public User createUser(User user) {
        dynamoDBMapper.save(user);
        return user;
    }

    @Override
    public User readUser(String userId) {
        return dynamoDBMapper.load(User.class, userId);
    }

    @Override
    public User updateUser(User user) {
        Map<String, ExpectedAttributeValue> expectedAttributeValueMap = new HashMap<>();
        expectedAttributeValueMap.put("userId", new ExpectedAttributeValue(new AttributeValue().withS(user.getUserId())));
        DynamoDBSaveExpression saveExpression = new DynamoDBSaveExpression().withExpected(expectedAttributeValueMap);
        dynamoDBMapper.save(user, saveExpression);
        return user;
    }

    
}