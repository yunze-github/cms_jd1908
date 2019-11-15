package com.briup.apps.cms.web.controller;

import com.briup.apps.cms.service.IUserService;
import com.briup.apps.cms.utils.Message;
import com.briup.apps.cms.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h3>cms_jd1908</h3>
 * <p>用户控制器</p>
 *
 * @author : yunze
 * @date : 2019-11-14 22:18
 **/
@RestController
@RequestMapping("user")
public class IUserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/findAll")
    public Message findAllUsers(){
        return MessageUtil.success("查询成功!",userService.findAllUsers());
    }
}
