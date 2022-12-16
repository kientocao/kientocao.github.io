package database;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    public static ArrayList<Product> products = new ArrayList<>(List.of(
            new Product(1, "Rượu", "Say cấp 1", 1, 10000),
            new Product(2, "Rượu2", "Say cấp 2", 2 , 80000),
            new Product(3, "Rượu3", "Say cấp 3", 12 , 300000),
            new Product(4, "Rượu4", "Say cấp 4", 13 , 400000),
            new Product(5, "Rượu5", "Say cấp 5", 14, 500000),
            new Product(6, "Rượu6", "Say cấp 6", 15 , 600000)

    ));
}
