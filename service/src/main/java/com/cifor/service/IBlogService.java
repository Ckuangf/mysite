package com.cifor.service;

import com.cifor.pojo.Blog;

import java.util.List;

public interface IBlogService {
    void addBlog(Blog blog);
    void deleteBlogById(int id);
    void updateBlogById(int id);
    Blog getBlogById(int id);
    List<Blog> getAllBlog();
}
