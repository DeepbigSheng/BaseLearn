package com.victor.demo.dao;

import com.victor.demo.domain.User;
import com.victor.demo.domain.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Mapper
@Repository
public interface UserDAO extends MyBatisBaseDao<User, Integer, UserExample> {
}