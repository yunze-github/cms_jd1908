package com.briup.apps.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CmsJd1911Application extends SpringBootServletInitializer {

    //tomcat启动war包读取到启动类，启动springboot
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CmsJd1911Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CmsJd1911Application.class, args);
    }

}
