package com.zzh.springbootdatamybatispage.dao;

import com.zzh.springbootdatamybatispage.pojo.Book;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/*
        Mapper接口：基本的增、删、改、查方法
        MySqlMapper：针对MySQL的额外补充接口，支持批量插入*/
@Repository
public interface BookMapper extends MySqlMapper<Book>, Mapper<Book> {
}