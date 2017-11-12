package com.xtrello.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LogServlet", urlPatterns = {"/Log/*"})
public class LogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<a href=\"/Log/createLog\" class=\"btn btn-primary  role=\"button\">Створити лог</a>");
        out.println("<a href=\"/Log/removeLog\" class=\"btn btn-primary  role=\"button\">Видалити лог</a>");
        out.println("<a href=\"/Log/updateLog\" class=\"btn btn-primary  role=\"button\">Редагувати лог</a>");

        switch (request.getPathInfo()){
            case "/":
                out.write("<H1>Hello User!</H1>");
                break;
            case "/createLog":

                out.write("<H1>Create Log</H1>");

                break;
            case "/removeLog":

                out.write("<H1>Remove Log</H1>");

                break;
            case "/updateLog":

                out.write("<H1>Update Log</H1>");

                break;
        }





    }
}
