package service;

import model.Product;
import repository.ProductRepository;

import java.util.ArrayList;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();
    public void printProduct(){
        ArrayList<Product> rs = productRepository.findAll();
        for(Product p: rs) {
            System.out.println(p);
        }
    }
    public void printfindByName(String name) {
        for (Product product: productRepository.findByNameContainsIgnoreCase(name)) {
            System.out.println(product);
        }
    }
    public void printfindbyId(int id) {
        productRepository.findById(id);
    }
    public void printfindbyQuantity(){
        for(Product product: productRepository.findByQuantity()){
            System.out.println(product);
        }
    }
    public void printfindPrice() {
            productRepository.findByPrice();
    }
}
