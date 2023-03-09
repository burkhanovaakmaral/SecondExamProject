import productStore.StoreService;
import productStore.product.Product;
import productStore.product.flourProduct.Bread;
import productStore.product.flourProduct.Pasta;
import productStore.product.flourProduct.Torment;
import productStore.product.meatProduct.Fish;
import productStore.product.meatProduct.LambMeat;
import productStore.product.meatProduct.Sausage;
import productStore.product.milkProduct.Kefir;
import productStore.product.milkProduct.Milk;
import productStore.product.milkProduct.SourCream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new LambMeat(1, "Lamb ribs", "SALIH", LocalDate.of(2023, 3, 21)));
        products.add(new LambMeat(2, "Minced lamb", "TOIBOSS", LocalDate.of(2023, 3, 12)));
        products.add(new Sausage(3, "Servelat", "TOIBOSS", LocalDate.of(2023, 2, 3)));
        products.add(new Sausage(4, "Salami", "TOIBOSS", LocalDate.of(2023, 3, 14)));
        products.add(new Fish(5, "Mackerel", "MORE", LocalDate.of(2023, 3, 1)));
        products.add(new Fish(6, "Trout", "TOIBOSS", LocalDate.of(2023, 3, 15)));

        products.add(new Kefir(7, "Домик в деревне", "MILK", LocalDate.of(2023, 3, 22)));
        products.add(new Kefir(8, "Зеленая линия", "PARMALAT", LocalDate.of(2023, 4, 3)));
        products.add(new SourCream(9, "Сарафанова", "MILK", LocalDate.of(2023, 3, 23)));
        products.add(new SourCream(10, "Простоквашино", "PROSTOKVASHINO", LocalDate.of(2023, 3, 2)));
        products.add(new Milk(11, "Простоквашино", "PROSTOKVASHINO", LocalDate.of(2023, 4, 1)));
        products.add(new Milk(12, "Домик в деревне", "MILK", LocalDate.of(2023, 3, 28)));

        products.add(new Pasta(13, "Вермишель", "NUR", LocalDate.of(2022, 4, 2)));
        products.add(new Pasta(14, "Спагетти", "SULTAN", LocalDate.of(2023, 6, 23)));
        products.add(new Torment(15, "Пышечка", "MAKFA", LocalDate.of(2023, 4, 2)));
        products.add(new Torment(16, "Рязаночка", "BATON", LocalDate.of(2023, 8, 21)));
        products.add(new Bread(17, "Звездный", "NUR", LocalDate.of(2023, 3, 25)));
        products.add(new Bread(18, "Батон", "NUR", LocalDate.of(2023, 3, 29)));

        StoreService storeService = new StoreService();
        storeService.manager(products);


    }


}