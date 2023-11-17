package net.mustafabaser.getirappclone.data.entity;

import java.io.Serializable;

public class Categories implements Serializable {
    private String CategoryName;
    private String CategoryBanner;

    public Categories() {
    }

    public Categories(String categoryName, String categoryBanner) {
        CategoryName = categoryName;
        CategoryBanner = categoryBanner;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategoryBanner() {
        return CategoryBanner;
    }

    public void setCategoryBanner(String categoryBanner) {
        CategoryBanner = categoryBanner;
    }
}
