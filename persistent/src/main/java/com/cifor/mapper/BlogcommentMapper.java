package com.cifor.mapper;

import com.cifor.pojo.Blogcomment;

import javax.persistence.Id;

public interface BlogcommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blogcomment record);

    int insertSelective(Blogcomment record);

    Blogcomment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Blogcomment record);

    int updateByPrimaryKey(Blogcomment record);
}