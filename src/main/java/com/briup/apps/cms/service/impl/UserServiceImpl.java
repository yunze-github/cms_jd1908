package com.briup.apps.cms.service.impl;

import com.briup.apps.cms.bean.User;
import com.briup.apps.cms.bean.UserExample;
import com.briup.apps.cms.bean.extend.UserExtend;
import com.briup.apps.cms.dao.UserMapper;
import com.briup.apps.cms.dao.extend.UserExtendMapper;
import com.briup.apps.cms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <h3>cms_jd1908</h3>
 * <p>用户业务逻辑处理实现接口</p>
 *
 * @author : yunze
 * @date : 2019-11-14 22:23
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserExtendMapper userExtendMapper;

    @Override
    public List<User> findAllUsers() {
        return userExtendMapper.selectAllUsers();
    }
}
