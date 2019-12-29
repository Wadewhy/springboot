package xyz.wadewhy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.wadewhy.api.enums.StatusCode;
import xyz.wadewhy.api.response.BaseResponse;
import xyz.wadewhy.api.server.BookService;
import xyz.wadewhy.model.pojo.Book;

import java.util.List;

/**
 * @PACKAGE_NAME: xyz.wadewhy.controller
 * @NAME: BookController
 * @Author: 钟子豪
 * @DATE: 2019/12/29
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 29
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: springboot-models
 **/
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/findBooks")
    public BaseResponse findBooks(){
        List<Book> books = bookService.findBooks();
        BaseResponse baseResponse = new BaseResponse(StatusCode.Success);
        baseResponse.setData(books);
        return baseResponse;
    }
}
