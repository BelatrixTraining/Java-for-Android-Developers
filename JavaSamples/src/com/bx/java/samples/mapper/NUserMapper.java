package com.bx.java.samples.mapper;

import java.util.List;

/**
 * Created by eduardo on 06/01/17.
 */
public class NUserMapper implements Mapper<User,UserEntity> {

    @Override
    public User transform(User tClass, UserEntity vClass) {
        return null;
    }

    @Override
    public List<User> transformList(List<User> tClass, List<UserEntity> vClass) {
        return null;
    }
}
