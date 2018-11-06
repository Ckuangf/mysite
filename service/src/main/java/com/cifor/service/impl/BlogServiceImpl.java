package com.cifor.service.impl;

import com.cifor.pojo.Blog;
import com.cifor.service.IBlogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Override
    public void addBlog(Blog blog) {

    }

    @Override
    public void deleteBlogById(int id) {

    }

    @Override
    public void updateBlogById(int id) {

    }

    @Override
    public Blog getBlogById(int id) {
        return null;
    }

    @Override
    public List<Blog> getAllBlog() {
        System.out.println("获取所有的博文");
        return null;
    }
}
