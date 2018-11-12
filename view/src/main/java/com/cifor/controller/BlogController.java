package com.cifor.controller;

import com.cifor.pojo.Blog;
import com.cifor.service.IBlogCommentService;
import com.cifor.service.IBlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan({"com.cifor.mapper"})
public class BlogController {
    private Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private IBlogCommentService iBlogCommentService;

    @RequestMapping("/allBlog")
    public String getAllBlog(){
        logger.debug("获取所有的Blog");
        iBlogService.getAllBlog();
        return "";
    }

    @PostMapping("/addBlog")
    public String addBlog(){
        Blog blog = new Blog();
        blog.setAuthor("cifor");
        blog.setCategory("java");
        blog.setDescription("测试插入");
        blog.setCreatetime(System.currentTimeMillis());
        blog.setTitle("测试");
        blog.setMaintext("abc");
        blog.setTrait("java");
        iBlogService.addBlog(blog);
        return "";
    }
}
