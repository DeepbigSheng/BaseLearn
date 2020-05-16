package com.victor.demo.service;

import com.victor.demo.dao.UserDAO;
import com.victor.demo.domain.User;
import com.victor.demo.domain.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<User> getUsers(){
        UserExample userExample = new UserExample();
        return userDAO.selectByExample(userExample);
    }
}
