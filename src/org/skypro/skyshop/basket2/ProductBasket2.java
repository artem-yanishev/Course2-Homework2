package org.skypro.skyshop.basket2;

import org.skypro.skyshop.product.Product;

import java.util.Scanner;

public class ProductBasket2 {
    private Product[] products2 = new Product[5];
    private  int count = 0;

    public void addBasket(Product product) {

        if (count >= products2.length) {
            System.out.println("Корзина заполнена!");
            return;
        }
        if (products2[count] == null) {
            products2[count] = product;
            count++;
        }
        System.out.println("Товар " + product.getTitle() + " добавлен в корзину");
    }

    public int totalCostBasket() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (products2[i] != null) {
                sum += products2[i].getCost();
            }
        }
        return sum;
    }

    public void printAllInBasket() {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return;
        }
        System.out.println("--- Содержимое Корзины ---");
        for (int i = 0; i < count; i++) {
            if (products2[i] != null) {
                System.out.println(products2[i].toString());
            }
        }
        System.out.println("--------------------------");
        System.out.println("Итого: " + totalCostBasket());
    }

    public boolean checkingProdInBasketByTitle(String name) {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (products2[i] != null && products2[i].getTitle().equals(name)) {
                System.out.println("Товар " + name + " найден!");
                return true;
            }
        }
        System.out.println("Товар " + name + " не найден!");
        return false;
    }

    public void emptyingTheBasket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Очистить корзину? (да/нет): ");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.equals("да")) {
            for (int i = 0; i < count; i++) {
                products2[i] = null;
            }
            count = 0;
            System.out.println("Корзина очищена!");
        } else {
            System.out.println("Очистка отменена");
        }
    }
}
