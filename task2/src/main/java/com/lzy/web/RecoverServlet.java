package com.lzy.web;

import com.lzy.service.TextService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/recoverServlet")
public class RecoverServlet extends HttpServlet {
    TextService textService = new TextService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        textService.recover();
        response.sendRedirect("/task2/textServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response);
    }
}
