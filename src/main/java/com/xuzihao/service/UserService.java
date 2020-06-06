package com.xuzihao.service;

import com.xuzihao.pojo.User;

/**
 * @version : V1.0
 * @ClassName: UserService
 * @Description: TODO
 * @Auther: xuzihao
 * @Date: 2020/2/25 21:32
 */
public interface UserService {
    User selectPasswordByName(String userName,String password);
}
