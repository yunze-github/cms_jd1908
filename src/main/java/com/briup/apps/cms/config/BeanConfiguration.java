package com.briup.apps.cms.config;

import com.briup.apps.cms.bean.*;
import com.briup.apps.cms.bean.extend.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {
    @Bean
    @Scope("prototype")
    public Article returnArticle() {
        return new Article();
    }

    @Bean
    @Scope("prototype")
    public Category returnCategory() {
        return new Category();
    }

    @Bean
    @Scope("prototype")
    public Comment returnComment() {
        return new Comment();
    }


    @Bean
    @Scope("prototype")
    public Privilege returnPrivilege() {
        return new Privilege();
    }

    @Bean
    @Scope("prototype")
    public Role returnRole() {
        return new Role();
    }


    @Bean
    @Scope("prototype")
    public User returnUser() {
        return new User();
    }

    @Bean
    @Scope("prototype")
    public Log returnLog() {
        return new Log();
    }

}
