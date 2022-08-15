package com.neusoft.controller;

import com.neusoft.po.Elmeuser;

import com.neusoft.service.impl.ElmeuserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ElmeuserQueryServlet", value = "/ElmeuserQueryServlet")
public class ElmeuserQueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String userId = request.getParameter("userId");

        ElmeuserServiceImpl e = new ElmeuserServiceImpl();
        Elmeuser elmeuser = e.queryUser(userId);
        //输出结果
        PrintWriter out = response.getWriter();
        if (elmeuser==null){
            out.print("无用户信息");
        }else {
            out.print(elmeuser.toString());
        }


        out.close();
    }
}
