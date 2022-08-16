package com.neusoft.controller.Orderdetailet;

import com.google.gson.Gson;
import com.neusoft.po.OrderDetailet;
import com.neusoft.utils.MessageAndData;
import service.Impl.OrderdetailetServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderdetailetInsertServlet", value = "/OrderdetailetInsertServlet")
public class OrderdetailetInsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.InsertOrderdetailet(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.InsertOrderdetailet(request, response);
    }
    protected void InsertOrderdetailet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer odid= Integer.valueOf(request.getParameter("odid"));
        Integer orderid= Integer.valueOf(request.getParameter("orderid"));
        Integer foodid= Integer.valueOf(request.getParameter("foodid"));
        Integer quantity= Integer.valueOf(request.getParameter("quantity"));
        OrderdetailetServiceImpl orderdetailetService = new OrderdetailetServiceImpl();
        OrderDetailet orderDetailet = new OrderDetailet(odid,orderid,foodid,quantity);
        boolean b = orderdetailetService.Insert(orderDetailet);
        MessageAndData mad = MessageAndData.success("执行成功").add("reqSta",b);

        Gson gson = new Gson();
        String s = gson.toJson(mad);
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        writer.print(s);
    }

}
