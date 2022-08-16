package com.neusoft.controller.Food;

import com.google.gson.Gson;
import com.neusoft.po.Food;
import com.neusoft.utils.MessageAndData;
import service.Impl.FoodServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FoodByNameServlet", value = "/FoodByNameServlet")
public class FoodByNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.FoodByName(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.FoodByName(request, response);
    }
    protected void FoodByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String foodName=request.getParameter("foodName");
        FoodServiceImpl foodService = new FoodServiceImpl();
        Food food = foodService.SelectFoodByName(foodName);
        MessageAndData mad = MessageAndData.success("执行成功").add("ulists", food);

        Gson gson = new Gson();
        String s = gson.toJson(mad);
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        writer.print(s);
    }
}
