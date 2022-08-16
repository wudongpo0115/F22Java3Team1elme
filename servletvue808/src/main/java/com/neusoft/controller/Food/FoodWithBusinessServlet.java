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
import java.util.List;

@WebServlet(name = "FoodWithBusinessServlet", value = "/FoodWithBusinessServlet")
public class FoodWithBusinessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.FoodWithBusiness(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.FoodWithBusiness(request, response);
    }
    protected void FoodWithBusiness(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Integer businessid= Integer.valueOf(request.getParameter("businessid"));
        FoodServiceImpl foodService = new FoodServiceImpl();
        List<Food> foods = foodService.SelectFoodInfoWithBusiness(businessid);
        MessageAndData mad = MessageAndData.success("执行成功").add("ulists", foods);

        Gson gson = new Gson();
        String s = gson.toJson(mad);
        PrintWriter writer = response.getWriter();
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        writer.print(s);
    }
}
