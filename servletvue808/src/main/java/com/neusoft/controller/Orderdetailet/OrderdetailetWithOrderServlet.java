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

@WebServlet(name = "OrderdetailetWithOrderServlet", value = "/OrderdetailetWithOrderServlet")
public class OrderdetailetWithOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.OrderdetailetWitOrder(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.OrderdetailetWitOrder(request, response);
    }
    protected void OrderdetailetWitOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer odid= Integer.valueOf(request.getParameter("odid"));

        OrderdetailetServiceImpl service = new OrderdetailetServiceImpl();
        OrderDetailet orderDetailet = service.selectall(odid);
        MessageAndData mad = MessageAndData.success("执行成功").add("ulists", orderDetailet);

        Gson gson = new Gson();
        String s = gson.toJson(mad);
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        writer.print(s);

    }
}
