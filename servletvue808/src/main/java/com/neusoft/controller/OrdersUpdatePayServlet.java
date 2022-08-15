package com.neusoft.controller;

import com.neusoft.po.Orders;
import com.neusoft.service.impl.OrdersServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrdersServlet", value = "/OrdersUpdatePayServlet")
public class OrdersUpdatePayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        Integer orderState = Integer.valueOf(request.getParameter("orderState"));
        Integer orderId = Integer.valueOf(request.getParameter("orderId"));
        OrdersServiceImpl ordersService = new OrdersServiceImpl();
        //输出结果
        PrintWriter out = response.getWriter();

        //如果用户付款，代表orderState==1,则修改订单状态
        if (orderState == 1){
            boolean b = ordersService.updateOrderState(new Orders(orderId,orderState));
            if (b){
                out.print("付款成功");
            }else {
                out.print("付款失败");
            }
        }else {     //如果orderState!=1，则代表用户未付款，不能修改订单状态
            out.print("请付款");
        }
        out.close();
    }
}
