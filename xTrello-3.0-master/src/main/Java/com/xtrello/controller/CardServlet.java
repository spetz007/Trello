package com.xtrello.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CardServlet", urlPatterns = {"/Card/*"})
public class CardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<a href=\"/Card/createCard\" class=\"btn btn-primary  role=\"button\">Створити карточку</a>");
        out.println("<a href=\"/Card/removeCard\" class=\"btn btn-primary  role=\"button\">Видалити карточку</a>");
        out.println("<a href=\"/Card/updateCard\" class=\"btn btn-primary  role=\"button\">Редагувати карточку</a>");

        switch (request.getPathInfo()){
            case "/":
                out.write("<H1>Hello User!</H1>");
                break;
            case "/createCard":

                out.write("<H1>Create Card</H1>");

                break;
            case "/removeCard":

                out.write("<H1>Remove Card</H1>");

                break;
            case "/updateCard":

                out.write("<H1>Update Card</H1>");

                break;
        }





    }
}
