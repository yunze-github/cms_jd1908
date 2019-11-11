package com.briup.apps.cms.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/findAll")
    public List<String> findAll() {
        List list = new ArrayList<>();
        list.add("1");
        list.add("2");
        return list;
    }

}
