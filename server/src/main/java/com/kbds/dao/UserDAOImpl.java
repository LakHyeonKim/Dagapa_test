package com.kbds.dao;

import com.kbds.vo.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO{
    private String ns = "UserMapper.";

    @Autowired
    private SqlSession sqlSession;

    @Override
    public User findUser(User user) {
        return sqlSession.selectOne(ns + "findUser", user);
    }
}
