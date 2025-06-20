package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.basket2.ProductBasket2;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        ProductBasket2 basket2 = new ProductBasket2();

        Product rexona = new Product("Rexona", 100);
        Product axe = new Product("Axe", 200);
        Product faMen = new Product("FaMen", 500);

        basket.addBasket(rexona);
        basket.addBasket(axe);
        basket.addBasket(faMen);
    }
}