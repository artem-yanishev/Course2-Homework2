package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.Arrays;

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

        SearchEngine testSearchEngine = new SearchEngine(12);
        testSearchEngine.add(rexona);
        testSearchEngine.add(axe);
        testSearchEngine.add(faMen);
        testSearchEngine.add(maMen);
        testSearchEngine.add(naMen);
        testSearchEngine.add(raMen);
        testSearchEngine.add(laMen);
        testSearchEngine.add(daMen);
        testSearchEngine.add(saMen);

        Article article1 = new Article("Уход за телом", "Rexona — лучший дезодорант для мужчин");
        Article article2 = new Article("Советы по гигиене", "Как выбрать дезодорант: Rexona или Axe?");
        Article article3 = new Article("Скидки на FaMen", "В этой статье рассказывается о выгодных предложениях на FaMen");

        testSearchEngine.add(article1);
        testSearchEngine.add(article2);
        testSearchEngine.add(article3);

        String[] queries = {"Rexona", "Axe", "FaMen", "NonExisting"};

        for (String q : queries) {
            Searchable[] found = testSearchEngine.search(q);

            System.out.print("Запрос: \"" + q + "\" -> ");
            boolean anyFound = false;
            for (Searchable s : found) {
                if (s != null) {
                    System.out.print(s.getStringRepresentation() + "; ");
                    anyFound = true;
                }
            }

            if (!anyFound) {
                System.out.print("ничего не найдено");
            }
            System.out.println();
        }

        System.out.println("\nПодробный вывод результатов для запроса \"Rexona\":");
        Searchable[] rexResults = testSearchEngine.search("Rexona");
        for (Searchable s : rexResults) {
            if (s != null) {
                System.out.println(" - " + s.getStringRepresentation());
            }
        }

    }
}