package controller;

import entity.Users;
import services.UserServices;
import services.impl.UserServicesImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入doGet");
     UserServices us = new UserServicesImpl();
        List<Users> all = us.selectAll();
        //将数据设置到req中
        request.setAttribute("users",all);
        //设置跳转的页面
        request.getRequestDispatcher("users.jsp").forward(request,response);
    }
}
