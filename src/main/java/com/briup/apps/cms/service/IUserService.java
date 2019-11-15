package com.briup.apps.cms.service;

import com.briup.apps.cms.bean.User;

import java.util.List;

public interface IUserService {
    List<User> findAllUsers();
}
