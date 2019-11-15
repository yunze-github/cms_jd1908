package com.briup.apps.cms.service.impl;

import com.briup.apps.cms.bean.User;
import com.briup.apps.cms.bean.UserExample;
import com.briup.apps.cms.dao.UserMapper;
import com.briup.apps.cms.dao.extend.UserExtendMapper;
import com.briup.apps.cms.exception.CustomerException;
import com.briup.apps.cms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    private UserMapper userMapper;
    @Autowired
    private UserExtendMapper userExtendMapper;

    //查找所有用户
    @Override
    public List<User> findAllUsers() {
        return userExtendMapper.selectAllUsers();
    }

    //检测姓名是否在数据库中
    @Override
    public void checkName(String username) throws CustomerException {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> list = userMapper.selectByExample(userExample);
        if (list.size()==0) {
            throw new CustomerException("用户不存在!");
        }
    }

    //检测用户登录信息
    @Override
    public void checkLogin(String username,String password) throws CustomerException {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> list = userMapper.selectByExample(userExample);
        if (list.size()==0){
            throw new CustomerException("密码错误!");
        }
    }

    //注册用户
    @Override
    public void save(User user) throws CustomerException {
        //判断是否存在注册用户
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> list = userMapper.selectByExample(userExample);
        if (list.size()!=0) {
            throw new CustomerException("用户已注册!");
        }
        //用户
        user.setRegisterTime(System.currentTimeMillis());
        //注册用户
        userMapper.insert(user);
    }

    //修改用户信息
    @Override
    public void update(User user) throws CustomerException {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
        List<User> list = userMapper.selectByExample(userExample);
        if (list.size()==0){
            throw new CustomerException("无法修该用户信息!");
        }
        userMapper.updateByExample(user,userExample);
    }
}
