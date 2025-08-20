package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private int simpleCost;

    public SimpleProduct(String title, int simpleCost) {
        super(title);
        this.simpleCost = simpleCost;
    }

    @Override
    public int getCost() {
        return simpleCost;
    }

    @Override
    public String toString() {
        return getTitle() +
                ": " + simpleCost;
    }

}
