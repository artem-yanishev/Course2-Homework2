package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private int simpleCost;
    private int discountInWholePercentages;

    public DiscountedProduct(String title, int simpleCost, int discountInWholePercentages) {
        super(title);
        this.simpleCost = simpleCost;
        this.discountInWholePercentages = discountInWholePercentages;
    }

    @Override
    public int getCost() {
        return simpleCost - simpleCost / 100 * discountInWholePercentages;
    }
}
