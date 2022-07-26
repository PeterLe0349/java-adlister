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
        if (req.getSession().getAttribute("user") == null) {
            resp.sendRedirect("/login");
            return;
        }
        req.getRequestDispatcher("/WEB-INF/ads/delete.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String deleteID = req.getParameter("delete");
        System.out.println(deleteID);
        try{
            User user = (User)req.getSession().getAttribute("user");
            System.out.println(user.getId());
            Ad ad = DaoFactory.getAdsDao().findByAdID(Integer.parseInt(deleteID));
            if(user.getId() != ad.getUserId()){
                System.out.println(user.getId() + ", " + ad.getUserId());
                String message = "User ID does not match Ad Poster ID";
                req.getSession().setAttribute("message", message);
                req.getRequestDispatcher("/WEB-INF/ads/delete.jsp").forward(req, resp);
                return;
            }
            DaoFactory.getAdsDao().delete(Integer.parseInt(deleteID));
            resp.getWriter().printf("<h1>Deleted Ad %s. Title: %s, Description %s.</h1>", ad.getId(),ad.getTitle(), ad.getDescription());
        }catch(Exception e){
            req.getRequestDispatcher("/WEB-INF/ads/delete.jsp").forward(req, resp);
        }
    }

}
