package com.neusoft.controller.Business;

import com.google.gson.Gson;
import com.neusoft.po.Business;
import com.neusoft.utils.MessageAndData;
import service.Impl.BusinessServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "BusinessServlet", value = "/BusinessServlet")
public class BusinessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doProcess(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request,response);


    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BusinessServiceImpl service = new BusinessServiceImpl();
        List<Business> businesses = service.SelectBusinessInfo();
        MessageAndData mad = MessageAndData.success("执行成功").add("ulists", businesses);

        Gson gson = new Gson();
        String s = gson.toJson(mad);
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        writer.print(s);
    }
}