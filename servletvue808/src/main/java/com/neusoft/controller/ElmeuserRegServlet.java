package com.neusoft.controller;

import com.neusoft.po.Elmeuser;
import com.neusoft.service.impl.ElmeuserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ElmeuserRegServlet", value = "/ElmeuserRegServlet")
public class ElmeuserRegServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        String userPsd = request.getParameter("userPsd");
        Integer userSex = Integer.valueOf(request.getParameter("userSex"));
        String userImg = request.getParameter("userImg");
        Integer delTag = Integer.valueOf(request.getParameter("delTag"));

        ElmeuserServiceImpl e = new ElmeuserServiceImpl();
        boolean b = e.regUser(new Elmeuser(userId, userPsd, userName, userSex, delTag, userImg));
//        boolean b = e.loginUser(new Elmeuser(userPsd, userName));
//        Elmeuser elmeuser = e.queryUser(userId);
        //输出结果
        PrintWriter out = response.getWriter();
        if (b){
            out.print("注册成功");
        }else {
            out.print("注册失败");
        }


        out.close();
    }
}
