package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        ProductBasket basket = new ProductBasket();
        ProductBasket basket2 = new ProductBasket();

        SimpleProduct rexona = new SimpleProduct("Rexona", 100);
        SimpleProduct axe = new SimpleProduct("Axe", 200);
        SimpleProduct faMen = new SimpleProduct("FaMen", 500);
        SimpleProduct maMen = new SimpleProduct("MaMen", 123);
        SimpleProduct naMen = new SimpleProduct("NaMen", 234);
        SimpleProduct raMen = new SimpleProduct("RaMen", 345);
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