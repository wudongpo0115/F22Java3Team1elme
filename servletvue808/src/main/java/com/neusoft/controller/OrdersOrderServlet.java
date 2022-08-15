package com.neusoft.controller;

import com.neusoft.po.Orders;
import com.neusoft.service.impl.OrdersServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OrdersOrderServlet", value = "/OrdersOrderServlet")
public class OrdersOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doProcess(request,response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

        String userid = request.getParameter("userid");
        Integer businessid = Integer.valueOf(request.getParameter("businessid"));
        Double ordertotal = Double.valueOf(request.getParameter("ordertotal"));
        Integer daid = Integer.valueOf(request.getParameter("daid"));
        OrdersServiceImpl ordersService = new OrdersServiceImpl();

        boolean b = ordersService.order(new Orders(userid, businessid, ordertotal, daid));

        //输出结果
        PrintWriter out = response.getWriter();
        if (b){
            out.print("下单成功");
        }else {
            out.print("下单失败");
        }

        out.close();
    }
}
