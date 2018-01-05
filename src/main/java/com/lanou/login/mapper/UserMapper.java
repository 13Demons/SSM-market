package com.lanou.login.mapper;

import com.lanou.login.bean.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}