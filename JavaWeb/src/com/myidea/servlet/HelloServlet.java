package com.myidea.servlet;

import java.io.IOException;

/**
 * @author sanliuqj
 * @create 2020-01-08-21:20
 */
public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("hello servlet");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
