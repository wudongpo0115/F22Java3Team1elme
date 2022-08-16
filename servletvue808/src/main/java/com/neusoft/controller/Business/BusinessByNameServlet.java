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

@WebServlet(name = "BusinessByNameServlet", value = "/BusinessByNameServlet")
public class BusinessByNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doBusinessByName(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doBusinessByName(request, response);
    }

    protected void doBusinessByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String businessname=request.getParameter("businessname");
        BusinessServiceImpl service = new BusinessServiceImpl();
        Business business = service.SelectBusinessInfoByName(businessname);
        MessageAndData mad = MessageAndData.success("执行成功").add("ulists", business);

        Gson gson = new Gson();
        String s = gson.toJson(mad);
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        writer.print(s);
    }
}
