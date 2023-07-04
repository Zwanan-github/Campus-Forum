package com.zwan.studyprojectbackend.service.impl;

import com.zwan.studyprojectbackend.entity.user.AccountInfo;
import com.zwan.studyprojectbackend.mapper.UserMapper;
import com.zwan.studyprojectbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public void saveUserInfo(AccountInfo info) {
        userMapper.saveInfo(info);
    }
}
