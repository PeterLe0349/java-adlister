package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (name = "UpdateAdsServlet", urlPatterns = "/update-ads")
public class UpdateAdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("user") != null){
            req.getRequestDispatcher("/WEB-INF/ads/update-ads.jsp").forward(req,resp);
        }else {
            resp.sendRedirect("/login");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String message = "Ad ID does not exist";
        User user = (User) session.getAttribute("user");
        long userId = user.getId();
        String adId = req.getParameter("adId");
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        Ad ad = DaoFactory.getAdsDao().findByAdID(Integer.parseInt(adId));
        try{
            if(userId != ad.getUserId()){
                message = "User ID does not match AD posters ID";
                req.getSession().setAttribute("message", message);
                req.getRequestDispatcher("/WEB-INF/ads/update-ads.jsp").forward(req, resp);
            } else {
                if(title != null && !title.isEmpty()) {
                    ad.setTitle(title);
                    DaoFactory.getAdsDao().updateAdTitle((long) Integer.parseInt(adId),title);
                }
                if(description != null && !description.isEmpty()){
                    ad.setDescription(description);
                    DaoFactory.getAdsDao().updateAdDescription((long) Integer.parseInt(adId),description);
                }
            }
            message = "Successfully updated.";
            req.getSession().setAttribute("message", message);
            req.getRequestDispatcher("/WEB-INF/ads/update-ads.jsp").forward(req, resp);
        }
        catch (Exception e) {
            req.getSession().setAttribute("message", message);
            req.getRequestDispatcher("/WEB-INF/ads/update-ads.jsp").forward(req, resp);
        }

    }
}
