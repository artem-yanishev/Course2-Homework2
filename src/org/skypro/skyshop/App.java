package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        ProductBasket basket2 = new ProductBasket();

        DiscountedProduct rexona = new DiscountedProduct("Rexona", 100, 17);
        DiscountedProduct axe = new DiscountedProduct("Axe", 200, 18);
        DiscountedProduct faMen = new DiscountedProduct("FaMen", 500, 19);
        DiscountedProduct maMen = new DiscountedProduct("MaMen", 123, 20);
        DiscountedProduct naMen = new DiscountedProduct("NaMen", 234, 21);
        FixPriceProduct raMen = new FixPriceProduct("RaMen");
        SimpleProduct laMen = new SimpleProduct("LaMen", 456);
        SimpleProduct daMen = new SimpleProduct("DaMen", 567);
        SimpleProduct saMen = new SimpleProduct("SaMen", 678);

        basket.addBasket(rexona);
        basket.addBasket(axe);
        basket.addBasket(faMen);
        basket2.addBasket(maMen);
        basket2.addBasket(naMen);
        basket2.addBasket(raMen);
        basket2.addBasket(laMen);
        basket2.addBasket(daMen);
        basket2.addBasket(saMen);
        basket.printAllInBasket();
        basket2.printAllInBasket();
        System.out.println(basket.totalCostBasket());
        System.out.println(basket2.totalCostBasket());
        basket.searchProdInBasketByTitle("Rexona");
        basket.searchProdInBasketByTitle("Nexona");
        basket.emptyingTheBasket();
        basket.printAllInBasket();
        System.out.println(basket.totalCostBasket());
        basket.searchProdInBasketByTitle("Rexona");



    }
}