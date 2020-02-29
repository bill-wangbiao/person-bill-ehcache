package com.xyy.ec.dao;

import com.xyy.ec.model.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author : wangbiao
 * @version V1.0
 * @Project: xyy-ec-ehcache
 * @Package com.xyy.ec.dao
 * @Description: TODO
 * @date Date : 2018年10月20日 19:04
 */
public interface UserDao {
    int insert(User user);

    int deleteByPrimaryKey(String id);

    int updateByPrimaryKey(User user);

    User selectByPrimaryKey(String id);

    List<User> selectAllUser();

    List<User> selectUserByAcount(@Param("userId") Integer userId, @Param("name") String userName);
}
