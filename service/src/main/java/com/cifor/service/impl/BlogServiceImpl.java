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
        blogMapper.insertSelective(blog);
    }

    @Override
    public void deleteBlogById(int id) {
        int i = blogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateBlogByIdSelective(Blog blog) {
        blogMapper.updateByPrimaryKeySelective(blog);
    }

    @Override
    public void updateBlogByIdWithBlobs(Blog blog) {
        blogMapper.updateByPrimaryKeyWithBLOBs(blog);
    }

    @Override
    public void updateBlogByIdWithoutMainText(Blog blog) {
        blogMapper.updateByPrimaryKey(blog);
    }

    @Override
    public Blog getBlogById(int id) {
        Blog blog = blogMapper.selectByPrimaryKey(id);
        return blog;
    }

    @Override
    public List<Blog> getAllBlog() {
        List<Blog> allBlog = blogMapper.getAllBlog();
        return allBlog;
    }
}
