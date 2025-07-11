package org.skypro.skyshop.product;

public abstract class Product {
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
}
