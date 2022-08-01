package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    List<Ad> allAdsByUserID(long id);
    List<Ad> allSortByAdUser();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);

    List<Ad> searchedAds(String search);

    Ad findByAdID(long id);

    boolean delete(long id);

    void updateAdTitle (Long adId,String newTitle);
    void updateAdDescription (Long adId,String newDescription);




}
