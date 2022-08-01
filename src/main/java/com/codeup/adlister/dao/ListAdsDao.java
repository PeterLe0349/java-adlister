package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    @Override
    public List<Ad> allAdsByUserID(long id) {
        return null;
    }

    @Override
    public List<Ad> allSortByAdUser() {
        return null;
    }

    public Long insert(Ad ad) {
        // make sure we have ads
        if (ads == null) {
            ads = generateAds();
        }
        // we'll assign an "id" here based on the size of the ads list
        // really the dao would handle this
        ad.setId((long) ads.size());
        ads.add(ad);
        return ad.getId();
    }

    public List<Ad> searchedAds(String search) {
        if (ads == null) {
            ads = all();
        }
        return ads;
    }
     
    public Ad findByAdID(long id) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return true;
    }

    @Override
    public void updateAdTitle(Long adId, String newTitle) {
        System.out.println("Updated ad title");
    }

    @Override
    public void updateAdDescription(Long adId, String newDescription) {
        System.out.println("Updated ad description");
    }

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();
        ads.add(new Ad(
            1,
            1,
            "playstation for sale",
            "This is a slightly used playstation"
        ));
        ads.add(new Ad(
            2,
            1,
            "Super Nintendo",
            "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
            3,
            2,
            "Junior Java Developer Position",
            "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
            4,
            2,
            "JavaScript Developer needed",
            "Must have strong Java skills"
        ));
        return ads;
    }
}
