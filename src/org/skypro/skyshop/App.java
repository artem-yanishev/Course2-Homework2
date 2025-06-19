package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product rexona = new Product("Rexona", 100);
        Product axe = new Product("Axe", 200);
        Product faMen = new Product("FaMen", 500);
        ProductBasket.addBasket(rexona);
        ProductBasket.addBasket(axe);
        ProductBasket.addBasket(faMen);
        ProductBasket.totalCostBasket();
    }
}