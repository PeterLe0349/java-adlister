package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/users/create")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/register.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // TODone: ensure the submitted information is valid - Done inside usersdao
        User user = new User(1,
                request.getParameter("username"),
                request.getParameter("email"),
                request.getParameter("password")
        );
        DaoFactory.getUsersDao().insert(user);
        if(DaoFactory.getUsersDao().findByUsername(request.getParameter("username")) != null){
            request.getSession().setAttribute("user", request.getParameter("username"));
            request.getRequestDispatcher("/profile")
                    .forward(request, response);
            return;
        }
        response.sendRedirect("/users/create");
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
    }
}
