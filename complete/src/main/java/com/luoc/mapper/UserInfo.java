package com.luoc.mapper;

import com.luoc.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author luoc
 * @date 2018/11/9 0009 17:09
 */
@Mapper
public interface UserInfo {
    /**
     *  用户登录验证用户密码
     * @param user 用户登录信息
     * @return 用户信息
     */

    User loginUser(User user);
}
