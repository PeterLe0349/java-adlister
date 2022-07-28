package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.*;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.Category;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "controllers.SortAdServlet", urlPatterns = "/sort")
public class SortAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Ad> ads =  DaoFactory.getAdsDao().allSortByAdUser();
        List<Category> cats =  DaoFactory.getCategoriesDao().all();
        for(Ad a: ads){
            List<String> catnames = new ArrayList<>();
            String[] catnums = DaoFactory.getCategoriesDao().findAdCategories(a.getId());
            for(String s: catnums){
                for(Category c: cats){
                    if((Long.parseLong(s) == c.getId())){
                        catnames.add(c.getName());
                    }
                }
            }
            a.setCategories(catnames.toArray(new String[0]));
        }
        request.setAttribute("ads", ads);
        request.getRequestDispatcher("/WEB-INF/ads/sort.jsp").forward(request, response);
    }
}
