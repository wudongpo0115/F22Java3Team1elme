package com.neusoft.controller.Orderdetailet;

import com.google.gson.Gson;
import com.neusoft.po.Business;
import com.neusoft.po.OrderDetailet;
import com.neusoft.utils.MessageAndData;
import service.Impl.BusinessServiceImpl;
import service.Impl.OrderdetailetServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "OrderdetailetSelectAllServlet", value = "/OrderdetailetSelectAllServlet")
public class OrderdetailetSelectAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.SelectAll(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.SelectAll(request, response);
    }
    protected void SelectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OrderdetailetServiceImpl orderdetailetService = new OrderdetailetServiceImpl();
        List<OrderDetailet> orderDetailets = orderdetailetService.selectOrderDetailetAll();
        MessageAndData mad = MessageAndData.success("执行成功").add("ulists", orderDetailets);

        Gson gson = new Gson();
        String s = gson.toJson(mad);
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        writer.print(s);
    }
}
