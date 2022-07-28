package com.codeup.adlister.dao;
import com.codeup.adlister.models.Category;
import java.util.List;


public interface Categories {
        // get a list of all the categories
        List<Category> all();

        int insert(Long adid, Long catid);

        String[] findAdCategories(long adid);

}


