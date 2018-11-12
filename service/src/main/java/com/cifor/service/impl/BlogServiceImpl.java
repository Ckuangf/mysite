package com.cifor.service.impl;

import com.cifor.mapper.BlogMapper;
import com.cifor.pojo.Blog;
import com.cifor.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BlogServiceImpl implements IBlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public void addBlog(Blog blog) {
        blogMapper.insert(blog);
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
        List<Blog> allBlog = blogMapper.getAllBlog();
        return null;
    }
}
