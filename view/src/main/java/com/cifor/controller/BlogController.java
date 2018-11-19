package com.cifor.controller;

import com.cifor.pojo.Blog;
import com.cifor.service.IBlogCommentService;
import com.cifor.service.IBlogService;
import com.cifor.utils.HttpUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

@Controller
@ComponentScan({"com.cifor.mapper"})
public class BlogController {
    private Logger logger = LoggerFactory.getLogger(BlogController.class);

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private IBlogCommentService iBlogCommentService;

    //todo 修改为获取部分字段的，该处只用于获取列表
    @RequestMapping("/allBlog")
    public String getAllBlog() {
        logger.debug("获取所有的Blog");
        List<Blog> allBlog = iBlogService.getAllBlog();
        for (Blog blog : allBlog) {
            System.out.println(blog);
        }
        return "";
    }

    @GetMapping("/blog")
    public String getBlogById(HttpServletRequest request){
        JSONObject httpRequestBody = null;
        try {
            httpRequestBody = HttpUtils.getHttpRequestBody(request);
        } catch (IOException e) {

        }
        Integer id = httpRequestBody.getInteger("id");
        logger.debug("获取id为{}的blog",id);
        Blog blogById = iBlogService.getBlogById(id);
        return "";
    }

    @PostMapping("/addBlog")
    public String addBlog(HttpServletRequest request) {
        logger.debug("插入blog");
        JSONObject blogParam = null;
        try {
            blogParam = HttpUtils.getHttpRequestBody(request);
        } catch (IOException e) {
            logger.error("error get request param for addBlog");
        }

        if (blogParam == null) {
            logger.error("failed to get the blog param");
            return "";
        }

        Blog blog = new Blog();

        if (blogParam.getString("auth") != null && !"".equals(blogParam.getString("auth"))) {
            blog.setAuthor(blogParam.getString("auth"));
        } else {

        }
        if (blogParam.getString("category") != null && !"".equals(blogParam.getString("category"))) {
            blog.setCategory(blogParam.getString("category"));
        } else {

        }
        if (blogParam.getString("title") != null && !"".equals(blogParam.getString("title"))) {
            blog.setTitle(blogParam.getString("title"));
        } else {

        }
        if (blogParam.getString("trait") != null && !"".equals(blogParam.getString("trait"))) {
            blog.setTrait(blogParam.getString("trait"));
        } else {

        }
        if (blogParam.getString("maintext") != null && !"".equals(blogParam.getString("maintext"))) {
            blog.setMaintext(blogParam.getString("maintext"));
        } else {

        }

        if (blogParam.getString("description") != null) {
            blog.setDescription(blogParam.getString("description"));
        }
        long time = System.currentTimeMillis();
        blog.setCreatetime(time);
        blog.setLastmodefiedtime(time);
        iBlogService.addBlog(blog);
        return "";
    }

    @DeleteMapping("/deleteBlog")
    public String deleteBlog(HttpServletRequest request) {
        JSONObject httpRequestBody = null;
        try {
            httpRequestBody = HttpUtils.getHttpRequestBody(request);
        } catch (IOException e) {

        }
        int id = httpRequestBody.getIntValue("id");
        Blog blogById = iBlogService.getBlogById(id);
        if (blogById != null) {
            iBlogService.deleteBlogById(id);
        } else {

        }
        return "";
    }

    @PutMapping("/updateBlog")
    public String updateBlog(HttpServletRequest request){
        //可修改范围：标题，内容，标签，类目，描述，
        return "";
    }
}
