package com.cifor.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackstageSystemController {

    private Logger logger = LoggerFactory.getLogger(HomePageController.class);

    @RequestMapping("/manageHomePage")
    public String backstageHomePage(){
        logger.debug("访问后台主页");
        return "backstageSystem/index";
    }

}
