package com.cifor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {

    private Logger logger = LoggerFactory.getLogger(HomePage.class);

    @RequestMapping("/homePage")
    public String homePage(){
        logger.debug("访问主页");
        return "index";
    }

}
