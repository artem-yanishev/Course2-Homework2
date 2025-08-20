package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

import java.util.Scanner;

public class ProductBasket {
    private Product[] products = new Product[5];
    private  int count = 0;

    public void addBasket(Product product) {

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

    public int totalCostBasket() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            if (products[i] != null) {
                sum += products[i].getCost();
            }
        }
        return sum;
    }

    public void printAllInBasket() {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return;
        }

        int specialCount = 0;
        System.out.println("--- Содержимое Корзины ---");
        for (int i = 0; i < count; i++) {
            if (products[i] != null) {
                System.out.println(products[i].toString());
                if (products[i].isSpecial()) {
                    specialCount++;
                }
            }
        }
        System.out.println("--------------------------");
        System.out.println("Итого: " + totalCostBasket());
        System.out.println("Специальных товаров: " + specialCount);
    }

    public boolean searchProdInBasketByTitle(String name) {
        if (count == 0) {
            System.out.println("В корзине пусто");
            return false;
        }
            for (int i = 0; i < count; i++) {
                if (products[i] != null && products[i].getTitle().equals(name)) {
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
                products[i] = null;
            }
            count = 0;
            System.out.println("Корзина очищена!");
        } else {
            System.out.println("Очистка отменена");
        }
    }



}
