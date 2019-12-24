package com.zzh.springbootwebservletfilterlistener.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @PACKAGE_NAME: com.zzh.springbootwebservletfilterlistener.servlet
 * @NAME: MyServlet
 * @Author: 钟子豪
 * @DATE: 2019/12/24
 * @MONTH_NAME_FULL: 十二月
 * @DAY: 24
 * @DAY_NAME_FULL: 星期二
 * @PROJECT_NAME: springboot
 **/
@Slf4j
@WebServlet(urlPatterns = "/myservlet")
public class MyServlet extends HttpServlet {
    //初始化
    @Override
    public void init() throws ServletException {
        log.info("Servlet 开始初始化");
        super.init();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("Servlet 开始处理GET方法");
        //PrintWriter把这个字符串以流的形式传递给原发送请求的页面。
        PrintWriter writer = resp.getWriter();
        writer.println("Hello FirstServlet");
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req,resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    public void destroy() {
        log.info("Servlet 开始销毁");
        super.destroy();
    }
}
