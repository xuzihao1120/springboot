package com.xuzihao.service;

import com.xuzihao.mapper.UserMapper;
import com.xuzihao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version : V1.0
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @Auther: xuzihao
 * @Date: 2020/2/25 21:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectPasswordByName(String userName,String password) {
        return userMapper.selectPasswordByName(userName,password);
    }
}
