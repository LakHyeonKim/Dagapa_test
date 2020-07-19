package com.kbds.service;

import com.kbds.dao.UserDAO;
import com.kbds.vo.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;

    @Override
    public User findUser(User user) {
        log.info("[SERVICE] :: findUser()");
        return userDAO.findUser(user);
    }
}
