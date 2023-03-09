package productStore;

import productStore.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreService {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    private final List<Product> supermarket = new ArrayList<>();

    public void addNewProduct(List<? extends Product> products) {
        List<Product> wrongProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getDate().isAfter(LocalDate.now())) {
                if (product.getCompanyName().equals("TOIBOSS") || product.getCompanyName().equals("MILK") ||
                        product.getCompanyName().equals("NUR")) {
                    supermarket.add(product);
                } else {
                    wrongProducts.add(product);
                }
            } else {
                wrongProducts.add(product);
            }
        }
        System.out.println(ANSI_GREEN + "Список принятых продуктов:");
        for (Product newProduct : supermarket) {
            System.out.println(newProduct);
        }
        System.out.println(ANSI_BLUE + "Список непринятых продуктов:");
        wrongProducts.forEach(System.out::println);
    }

    public void sortByDiscount() {
        List<Product> storeShelves = new ArrayList<>();
        for (int i = 0; i < supermarket.size(); i++) {
            if (supermarket.get(i).getDate().isAfter(LocalDate.now())) {
                if (supermarket.get(i).getDate().minusDays(7).isBefore(LocalDate.now())) {
                    storeShelves.add(supermarket.get(i));
                }
            } else {
                supermarket.remove(supermarket.get(i));
            }
        }
        System.out.println(ANSI_RED + "Товары со скидкой:");
        for (Product product : storeShelves) {
            System.out.println(product);
        }
    }

    public void manager(List<Product> products) {
        Manager manager = new Manager("akmaral", "1234");
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_PURPLE + "Enter login: ");
        String login = scanner.nextLine();
        System.out.println(ANSI_PURPLE + "Enter password: ");
        String password = scanner.nextLine();
        if (login.equals(manager.getLogin()) && password.equals(manager.getPassword())) {
            addNewProduct(products);
            sortByDiscount();
        } else {
            System.out.println("Пароль или логин не верный");
        }
    }
}
