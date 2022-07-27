
package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.Category;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySQLCategoriesDao implements Categories {
    private Connection connection = null;

    public MySQLCategoriesDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    public int insert(Long adid, Long catid) {
        try {
            String insertQuery = "INSERT INTO category_and_ad(ad_id, category_id) VALUES (?, ?)";
            PreparedStatement stmt = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            stmt.setLong(1, adid);
            stmt.setLong(2, catid);
            int n = stmt.executeUpdate();
            System.out.println("Total entries: " + n);
            return n;
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad and category relation.", e);
        }
    }


    @Override
    public List<Category> all() {
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM categories");
            ResultSet rs = stmt.executeQuery();
            return createCategoriesFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all categories.", e);
        }
    }

    private List<Category> createCategoriesFromResults(ResultSet rs) throws SQLException {
        List<Category> cats = new ArrayList<>();
        while (rs.next()) {
            cats.add(extractCategory(rs));
        }
        return cats;
    }

    private Category extractCategory(ResultSet rs) throws SQLException {
        return new Category(
                rs.getLong("id"),
                rs.getString("name")
        );
    }

    public String[] findAdCategories(long adid){
        List<String> cc = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("SELECT * FROM category_and_ad where ad_id = ?");
            stmt.setLong(1, adid);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cc.add(rs.getString("category_id"));
            }
            return cc.toArray(new String[0]);


        } catch (SQLException e) {
            throw new RuntimeException("Error matching ad to categories.", e);
        }
    }

//    public static void main(String[] args) {
//        MySQLCategoriesDao sql = new MySQLCategoriesDao(new Config());
//        List<Category> cats = sql.all();
//        String[] catnums = sql.findAdCategories(22);
//        List<String> catnames = new ArrayList<>();
//        for(String s: catnums){
//            for(Category c: cats){
//                if((Long.parseLong(s) == c.getId())){
//                    catnames.add(c.getName());
//                }
//            }
//        }
//        System.out.println(catnames);
//
//
//    }

}
