package com.cifor.controller;

import com.cifor.service.IBlogCommentService;
import com.cifor.service.IBlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    private Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private IBlogCommentService iBlogCommentService;

    @RequestMapping("/AllBlog")
    public String getAllBlog(){
        logger.debug("获取所有的Blog");
        iBlogService.getAllBlog();
        return "";
    }
}
