package xyz.wadewhy.api.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wadewhy.api.server.BookService;
import xyz.wadewhy.model.dao.BookDao;
import xyz.wadewhy.model.pojo.Book;

import java.util.List;

/**
 * @PACKAGE_NAME: xyz.wadewhy.api.server.impl
 * @NAME: BookServiceImpl
 * @Author: 钟子豪
 * @DATE: 2019/12/29
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 29
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot-models
 **/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookdao;
    @Override
    public List<Book> findBooks() {
        return bookdao.findBooks();
    }
}
