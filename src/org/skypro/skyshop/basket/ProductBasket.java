package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private static Product[] products = new Product[30];
    private static int count = 0;

    public static void addBasket(Product product) {

        if (count >= products.length) {
            System.out.println("Корзина заполнена!");
            return;
        }
        if (products[count] == null) {
            products[count] = product;
            count++;
        }
        System.out.println("Товар " + product.getTitle() + " добавлен в корзину");
    }

    public static void totalCostBasket() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (products[i] != null) {
                sum += products[i].getCost();
            }
        }
        System.out.println(sum);
    }
}
