package com.cifor.mapper;

import com.cifor.pojo.Blog;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);

    @Select("select * from blog")
    List<Blog> getAllBlog();
}