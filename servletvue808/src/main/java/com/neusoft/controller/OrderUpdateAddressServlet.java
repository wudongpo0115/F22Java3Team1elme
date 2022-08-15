package com.neusoft.controller;

import com.neusoft.po.DeliveryAddress;
import com.neusoft.po.Orders;
import com.neusoft.service.impl.OrdersServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrderUpdateAddressServlet", value = "/OrderUpdateAddressServlet")
public class OrderUpdateAddressServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        Integer daId = Integer.valueOf(request.getParameter("daId"));
        Integer orderId = Integer.valueOf(request.getParameter("orderId"));
        OrdersServiceImpl ordersService = new OrdersServiceImpl();
        //输出结果
        PrintWriter out = response.getWriter();

        boolean b = ordersService.updateOrderState(new Orders(orderId,new DeliveryAddress(daId)));
        if (b){
            out.print("修改地址成功");
        }else {
            out.print("修改地址失败");
        }
        out.close();
    }
}
