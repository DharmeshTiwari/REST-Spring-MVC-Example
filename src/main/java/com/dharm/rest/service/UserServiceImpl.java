package com.dharm.rest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dharm.rest.dao.UserDao;
import com.dharm.rest.model.User;

@Service
public class UserServiceImpl implements UserService {
 
 UserDao userDao;
 
 @Autowired
 public void setUserDao(UserDao userDao) {
  this.userDao = userDao;
 }



 public void addUser(User user) {
  userDao.addUser(user);
 }

}