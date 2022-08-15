package com.neusoft.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//跨域过滤器
@WebFilter("/*")
public class CorsFilter implements Filter {
    public void destroy() {	}


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        response.setHeader("Access-Control-Allow- Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow- Credentials","true");


        chain.doFilter(req, resp);
    }


    public void init(FilterConfig fConfig) throws ServletException {	}
}
