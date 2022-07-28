package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "controllers.SingleAdServlet", urlPatterns = "/ad")
public class SingleAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
//            Long adId = Long.parseLong(request.getParameter("id"));
//            request.setAttribute("ad", DaoFactory.getAdsDao().findByAdID(adId));
            request.getRequestDispatcher("/ads").forward(request, response);
        } catch (NumberFormatException e) {
            System.out.println("BAD");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Long adId = Long.parseLong(request.getParameter("id"));
            Ad a = DaoFactory.getAdsDao().findByAdID(adId);


            List<Category> cats =  DaoFactory.getCategoriesDao().all();
                List<String> catnames = new ArrayList<>();
                String[] catnums = DaoFactory.getCategoriesDao().findAdCategories(a.getId());
                for(String s: catnums){
                    for(Category c: cats){
                        if((Long.parseLong(s) == c.getId())){
                            System.out.println(c.getName());
                            catnames.add(c.getName());
                        }
                    }
                }
                a.setCategories(catnames.toArray(new String[0]));
            System.out.println(Arrays.toString(a.getCategories()));
            request.setAttribute("ad", a);
            request.getRequestDispatcher("/WEB-INF/ads/single-ad.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            System.out.println("BAD");
        }
    }
}

