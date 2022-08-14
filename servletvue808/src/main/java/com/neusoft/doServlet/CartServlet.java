package com.neusoft.doServlet;

import com.neusoft.po.Cart;
import com.neusoft.service.Impl.CartServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CartServlet", value = "/CartServlet")
public class CartServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doselAll(request,response);
        dotestQueryWithUser(request,response);
        dotestQueryWithFood(request,response);
        dotestQueryWithBusiness(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doselAll(request,response);
        dotestQueryWithUser(request,response);
        dotestQueryWithFood(request,response);
        dotestQueryWithBusiness(request,response);
    }

    //查询全部信息
    protected void doselAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) resp;

        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        CartServiceImpl cartServiceImpl = new CartServiceImpl();
        List<Cart> carts = cartServiceImpl.selAll();


        PrintWriter writer = response.getWriter();
        writer.println(carts.toString());

        writer.close();

    }

    //两表连接通过用户id查询购物车表和用户表信息
    protected void dotestQueryWithUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String userId = request.getParameter("userId");

        CartServiceImpl cartServiceImpl = new CartServiceImpl();
        cartServiceImpl.queryInfoWithElmeUser(userId);

        PrintWriter writer = response.getWriter();
        writer.println();

        writer.close();
    }

    //两表连接通过食物id查询购物车表和食品表信息
    protected void dotestQueryWithFood(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String foodId = request.getParameter("foodId");

        CartServiceImpl cartServiceImpl = new CartServiceImpl();
        cartServiceImpl.queryInfoWithElmeUser(foodId);

        PrintWriter writer = response.getWriter();
        writer.println();

        writer.close();
    }

    //两表连接通过食物id查询购物车表和商家表信息
    protected void dotestQueryWithBusiness(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String businessId = request.getParameter("businessId");

        CartServiceImpl cartServiceImpl = new CartServiceImpl();
        cartServiceImpl.queryInfoWithElmeUser(businessId);

        PrintWriter writer = response.getWriter();
        writer.println();

        writer.close();
    }

}
