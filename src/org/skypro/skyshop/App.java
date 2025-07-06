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
        Product maMen = new Product("MaMen", 123);
        Product naMen = new Product("NaMen", 234);
        Product raMen = new Product("RaMen", 345);
        Product laMen = new Product("LaMen", 456);
        Product daMen = new Product("DaMen", 567);
        Product saMen = new Product("SaMen", 678);

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
        System.out.println(basket.totalCostBasket());
        basket.searchProdInBasketByTitle("Rexona");
        basket.searchProdInBasketByTitle("Nexona");
        basket.emptyingTheBasket();
        basket.printAllInBasket();
        System.out.println(basket.totalCostBasket());
        basket.searchProdInBasketByTitle("Rexona");
    }
}