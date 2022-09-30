package com.lzy.web;

import com.lzy.pojo.MyTexts;
import com.lzy.service.TextService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    TextService textService = new TextService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String myTest = request.getParameter("myText");

        if(myTest==null||myTest.length()==0) {

            request.setAttribute("msg","输入内容不能为空");
            request.getRequestDispatcher("/talk.jsp").forward(request,response);
        }else if(myTest.length()>100){

            request.setAttribute("msg","输入内容太长");
            request.getRequestDispatcher("/talk.jsp").forward(request,response);
        }else{
            MyTexts myTexts = new MyTexts(myTest);
            textService.addText(myTexts);

            response.sendRedirect("/task2/textServlet");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response);
    }
}
