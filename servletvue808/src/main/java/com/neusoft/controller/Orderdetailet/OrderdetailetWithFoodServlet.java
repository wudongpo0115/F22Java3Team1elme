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

@WebServlet(name = "OrderdetailetWithFoodServlet", value = "/OrderdetailetWithFoodServlet")
public class OrderdetailetWithFoodServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.Orderdetailet(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.Orderdetailet(request, response);
    }
    protected void Orderdetailet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String foodid=request.getParameter("foodid");
        Integer id=Integer.valueOf(foodid);
        OrderdetailetServiceImpl service = new OrderdetailetServiceImpl();
        OrderDetailet orderDetailet = service.SelectBy(id);
        MessageAndData mad = MessageAndData.success("执行成功").add("ulists", orderDetailet);

            Gson gson = new Gson();
            String s = gson.toJson(mad);
            PrintWriter writer = response.getWriter();
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/json");
            writer.print(s);

    }

}
