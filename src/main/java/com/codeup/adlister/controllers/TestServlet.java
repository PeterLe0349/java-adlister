package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.Categories;
import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLCategoriesDao;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.Category;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name="TestServlet", urlPatterns = "/test")
public class TestServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/ads/test.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String[] ss = (req.getParameterValues("category"));
//        System.out.println(ss.length);
//        Categories catdao = DaoFactory.getCategoriesDao();

//        for(String s: ss){
//            System.out.println("Cat num: " + s);
//            catdao.insert(6L, Long.parseLong(s));
//        }
//        List<Category> cats = catdao.all();
//        for(Category c: cats){
//            System.out.println(c.getName());
//        }

    }


}
