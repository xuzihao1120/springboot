package com.xuzihao.mapper;

import com.xuzihao.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @version : V1.0
 * @ClassName: UserMapper
 * @Description: TODO
 * @Auther: xuzihao
 * @Date: 2020/2/25 19:58
 */
@Mapper
@Repository
public interface UserMapper {
    User selectPasswordByName(@Param("userName") String userName,@Param("password") String password);
}
