package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.*;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "controllers.SortByCategoryServlet", urlPatterns = "/sortcat")
public class SortByCategoryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Ad> ads1 =  DaoFactory.getAdsDao().allByCategory(1);
        List<Ad> ads2 =  DaoFactory.getAdsDao().allByCategory(2);
        List<Ad> ads3 =  DaoFactory.getAdsDao().allByCategory(3);
        List<Ad> ads4 =  DaoFactory.getAdsDao().allByCategory(4);
        List<Ad> ads5 =  DaoFactory.getAdsDao().allByCategory(5);
        List<Ad> ads6 =  DaoFactory.getAdsDao().allByCategory(6);
        List<Ad> ads7 =  DaoFactory.getAdsDao().allByCategory(7);
        request.setAttribute("ads1", ads1);
        request.setAttribute("ads2", ads2);
        request.setAttribute("ads3", ads3);
        request.setAttribute("ads4", ads4);
        request.setAttribute("ads5", ads5);
        request.setAttribute("ads6", ads6);
        request.setAttribute("ads7", ads7);
        request.getRequestDispatcher("/WEB-INF/ads/sortByCat.jsp").forward(request, response);
    }
}
