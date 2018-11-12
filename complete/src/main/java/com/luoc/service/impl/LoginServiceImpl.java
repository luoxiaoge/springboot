package com.luoc.service.impl;

import com.luoc.mapper.UserInfo;
import com.luoc.model.User;
import com.luoc.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luoc
 * @date 2018/11/12 0012
 * @Time 14:19
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private UserInfo userInfoMapper;

    @Override
    public User login(User user) {
         return  userInfoMapper.loginUser(user);
    }
}
