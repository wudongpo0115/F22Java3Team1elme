package com.neusoft.controller;

import com.neusoft.po.Orders;
import com.neusoft.service.impl.OrdersServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrdersCancelServlet", value = "/OrdersCancelServlet")
public class OrdersCancelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request,response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{


        Integer orderId = Integer.valueOf(request.getParameter("orderId"));
        OrdersServiceImpl ordersService = new OrdersServiceImpl();

        boolean b = ordersService.cancelOrder(new Orders(orderId));

        //输出结果
        PrintWriter out = response.getWriter();
        if (b){
            out.print("取消成功");
        }else {
            out.print("取消失败");
        }

        out.close();
    }
}

