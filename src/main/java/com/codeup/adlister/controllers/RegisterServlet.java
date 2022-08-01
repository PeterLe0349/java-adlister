package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");
        String message = "";

        if (email != null && username == null || password.length() > 240 || password.length() <= 0) {
            request.setAttribute("email", email);
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
        }

        if (username != null && email == null || password.length() > 240 || password.length() <= 0) {
            request.setAttribute("username", username);
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
        }

        // validate input
        boolean inputHasErrors = username.isEmpty()
            || email.isEmpty()
            || password.isEmpty()
            || (! password.equals(passwordConfirmation));

        if (inputHasErrors) {
            response.sendRedirect("/register");
            return;
        }

        // create and save a new user
        User user = new User(username, email, password);

        try {
            DaoFactory.getUsersDao().insert(user);
            message = "Created user successfully!";
            request.getSession().setAttribute("message", message);
            request.getSession().removeAttribute("user");
            request.getSession().invalidate();
            request.getRequestDispatcher("/login").forward(request, response);
            return;

        }
        catch (Exception e) {
            request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
        }
    }
}
