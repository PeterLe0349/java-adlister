package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLAdsDao;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="controllers.DeleteServlet", urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendRedirect("WEB-INF/ads/delete.jsp");
        req.getRequestDispatcher("/WEB-INF/ads/delete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String deleteID = req.getParameter("delete");
        System.out.println(deleteID);
        Ad ad = DaoFactory.getAdsDao().findByAdID(Integer.parseInt(deleteID));
        if(ad != null){
        }
        resp.getWriter().printf("<h1>Deleted Ad %s. Title: %s, Description %s.</h1>", ad.getId(),ad.getTitle(), ad.getDescription());
        DaoFactory.getAdsDao().delete(Integer.parseInt(deleteID));
    }
}
