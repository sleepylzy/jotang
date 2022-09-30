package com.lzy.web;

import com.lzy.pojo.MyTexts;
import com.lzy.service.TextService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/textServlet")
public class TextServlet extends HttpServlet {
    TextService textService = new TextService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<MyTexts> myTexts = textService.selectAll();
        request.setAttribute("myTexts",myTexts);
        request.getRequestDispatcher("/text.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response);
    }
}
