package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 0;

    public FixPriceProduct(String title) {
        super(title);
    }

    @Override
    public int getCost() {
        return FIXED_PRICE;
    }

    @Override
    public String toString() {
        return getTitle() + ": Фиксированная цена " + FIXED_PRICE;
    }
}
