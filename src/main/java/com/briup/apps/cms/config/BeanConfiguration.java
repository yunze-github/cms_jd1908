package com.briup.apps.cms.config;

import com.briup.apps.cms.bean.*;
import com.briup.apps.cms.bean.extend.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public Article returnArticle() {
        return new Article();
    }

    @Bean
    public Category returnCategory() {
        return  new Category();
    }

    @Bean
    public Comment returnComment() {
        return new Comment();
    }


    @Bean
    public Privilege returnPrivilege(){
        return  new Privilege();
    }

    @Bean
    public Role returnRole() {
        return new Role();
    }


    @Bean
    public User returnUser() {
        return new User();
    }

}
