package com.baidu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取发送过来的数据
        request.setCharacterEncoding("utf-8");
        response.setContentType("utf-8");
        //默认为登录成功
        boolean bo=true;
        if (bo){
            String remember = request.getParameter("remember");
            if ("ok".equals(remember)){
                //创建Cookie,把Cookie的值传递给界面。让界面获取到
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                Cookie co1=new Cookie("name",username);
                Cookie co2=new Cookie("password",password);
                //把cookie返回给客户端
                response.addCookie(co1);
                response.addCookie(co2);
                //设置Cookie存在的时间
                co1.setMaxAge(60*60);
                co2.setMaxAge(60*60);
            }else {
                Cookie co1=new Cookie("name",null);
                Cookie co2=new Cookie("password",null);
                co1.setMaxAge(0);
                co2.setMaxAge(0);
                response.addCookie(co1);
                response.addCookie(co2);
            }
            response.sendRedirect("index.jsp");
        }else {
            response.sendRedirect("login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
