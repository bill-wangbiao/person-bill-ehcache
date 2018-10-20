package com.xyy.ec.service;

import com.xyy.ec.model.User;
import com.xyy.ec.util.Result;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author : wangbiao
 * @version V1.0
 * @Project: xyy-ec-ehcache
 * @Package com.xyy.ec.service
 * @Description: TODO
 * @date Date : 2018年10月20日 19:00
 */
public interface UserService {
    int insert(User user);

    int deleteByPrimaryKey(String id);

    User updateByPrimaryKey(User user);

    User selectByPrimaryKey(String id);

    Result selectUserByAcount(@Param("userId") Integer userId, @Param("name") String userName);

    List<User> selectAllUser();
}
