package com.neusoft.controller;

import com.neusoft.po.Orders;
import com.neusoft.service.impl.OrdersServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CheckOrdersServlet", value = "/rdersCheckOServlet")
public class OrdersCheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{


        Integer userid = Integer.valueOf(request.getParameter("userid"));
        OrdersServiceImpl ordersService = new OrdersServiceImpl();

        Orders orders = ordersService.checkOrders(userid);

        //输出结果
        PrintWriter out = response.getWriter();
        if (orders==null){
            out.print("无订单");
        }else {
            out.print(orders.toString());
        }

        out.close();
    }
}
