package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract int getCost();

    public boolean isSpecial() {
        return false;
    }

    @Override
    public String toString() {
        return title + ": " + getCost();
    }

    @Override
    public String getSearchTerm() {
        return title;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getName() {
        return title;
    }
}
