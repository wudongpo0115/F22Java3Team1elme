package com.neusoft.controller;

import com.neusoft.po.Elmeuser;
import com.neusoft.service.impl.ElmeuserServiceImpl;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ElemuserLoginServlet", value = "/ElemuserLoginServlet")
public class ElemuserLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

        String userName = request.getParameter("userName");
        String userPsd = request.getParameter("userPsd");


        ElmeuserServiceImpl e = new ElmeuserServiceImpl();
        boolean b = e.loginUser(new Elmeuser(userPsd, userName));

        //输出结果
        PrintWriter out = response.getWriter();
        if (b){
            out.print("等陆成功");
        }else {
            out.print("登陆失败");
        }
        out.close();
    }
}
