package com.zzh.springbootdatamybatispage.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

//继承自己的MyMapper
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    // 特别注意，这个接口不能被扫描到，否则会报错
}
