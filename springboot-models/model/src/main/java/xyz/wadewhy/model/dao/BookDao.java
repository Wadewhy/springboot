package xyz.wadewhy.model.dao;

import xyz.wadewhy.model.pojo.Book;

import java.util.List;

/**
 * @PACKAGE_NAME: xyz.wadewhy.model.dao
 * @NAME: BookDao
 * @Author: 钟子豪
 * @DATE: 2019/12/29
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 29
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot-models
 **/
public interface BookDao {
    List<Book>  findBooks();
}
