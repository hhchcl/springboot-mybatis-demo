package com.winter.mapper;

import com.winter.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer user_id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllUser();
}