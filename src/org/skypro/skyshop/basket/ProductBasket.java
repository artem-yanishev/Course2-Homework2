package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {

    public static void addBasket(Product product) {
        Product[] products = new Product[30];
        int count = 0;
        if (count >= 30) {
            System.out.println("Корзина заполнена!");
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                count++;
            }
        }
        System.out.println("Товар добавлен в корзину");
    }
}
