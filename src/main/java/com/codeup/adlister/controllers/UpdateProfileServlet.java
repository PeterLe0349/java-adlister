package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;
import com.mysql.cj.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UpdateProfileServlet", urlPatterns = "/profile/update")
public class UpdateProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("user") != null) {
            req.getRequestDispatcher("/WEB-INF/update-profile.jsp").forward(req, resp);
        }
        else {
            resp.sendRedirect("/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        long userID = user.getId();
        if (req.getParameter("newUsername") != null && !req.getParameter("newUsername").isEmpty()) {
            String newUsername = req.getParameter("newUsername");
            user.setUsername(newUsername);
            DaoFactory.getUsersDao().updateUsername(newUsername, userID);
        }
        if (req.getParameter("newEmail") != null && !req.getParameter("newEmail").isEmpty()) {
            String newEmail = req.getParameter("newEmail");
            user.setEmail(newEmail);
            DaoFactory.getUsersDao().updateEmail(newEmail, userID);
        }
        if (req.getParameter("newPassword") != null && !req.getParameter("newPassword").isEmpty() && req.getParameter("newPassword").equals(req.getParameter("confirmPassword"))) {
            String newPassword = Password.hash(req.getParameter("newPassword"));
            user.setPassword(newPassword);
            DaoFactory.getUsersDao().updatePassword(newPassword, userID);
        }

            req.getRequestDispatcher("/WEB-INF/update-profile.jsp").forward(req, resp);
    }
}
