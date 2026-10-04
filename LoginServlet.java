package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String username = request.getParameter("username");

        HttpSession session = request.getSession();

        session.setAttribute("username", username);

        PrintWriter out = response.getWriter();

        out.println("<h1>Login Successful</h1>");
        out.println("<h2>Welcome " + username + "</h2>");
        out.println("<a href='logout'>Logout</a>");
    }
}