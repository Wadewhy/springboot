package com.zzh.springbootdatamybatispage;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzh.springbootdatamybatispage.dao.BookMapper;
import com.zzh.springbootdatamybatispage.pojo.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @PACKAGE_NAME: com.zzh.springbootdatamybatispage
 * @NAME: BookMapperTest
 * @Author: 钟子豪
 * @DATE: 2019/12/27
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 27
 * @DAY_NAME_FULL: 星期五
 * @PROJECT_NAME: springboot
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookMapperTest {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void SelectOne() {
        Book book = new Book();
        book.setId(2);
        Book selectOne = bookMapper.selectOne(book);
        Assert.assertNotNull(selectOne);
        System.err.println(selectOne);
    }

    @Test
    public void testSelectByPrimaryKey() {
        Book book = bookMapper.selectByPrimaryKey(2);
        Assert.assertNotNull(book);
        System.out.println(book);
    }

    /**
     * 分页测试
     */
    @Test
    public void testSelectPageInfo() {
        PageHelper.startPage(2, 3);
        List<Book> bookList = bookMapper.selectAll();
        Assert.assertNotNull(bookList);
        System.err.println("查询出数量：" + bookList.size());
        PageInfo<Book> pageInfo = PageInfo.of(bookList);
        System.err.println("总数量：" + pageInfo.getTotal());
        System.err.println("总页数：" + pageInfo.getPages());
        System.err.println("页大小：" + pageInfo.getPageSize());
        System.err.println("第几页：" + pageInfo.getPageNum());
        System.err.println("当前量：" + pageInfo.getSize());
    }

    /**
     * 分页测试
     */
    @Test
    public void testSelectPage() {
        PageHelper.startPage(2, 3);
        List<Book> bookList = bookMapper.selectAll();
        Assert.assertNotNull(bookList);
        System.out.println("查询出数量：" + bookList.size());
        System.out.println("总数量：" + ((Page) bookList).getTotal());
        System.out.println("总页数：" + ((Page) bookList).getPages());
        System.out.println("第几页：" + ((Page) bookList).getPageNum());
    }
}
