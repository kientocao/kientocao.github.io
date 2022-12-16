package repository;

import model.Product;

import java.util.ArrayList;

import static database.ProductDatabase.products;

public class ProductRepository {
    public ArrayList<Product> findAll(){
        return products;
    }
    public ArrayList<Product> findByNameContainsIgnoreCase(String name) {
        ArrayList<Product> rs = new ArrayList<>();
        for (Product p: products) {
            if(p.getName().toLowerCase().contains(name.toLowerCase())){
                rs.add(p);
            }
        }
        return rs;
    }
    public void findById(int id) {
        for (Product p : products) {
            if( p.getId() == id){
                System.out.println(p);
            }
        }
//        System.out.println("Số lượng sản phẩm sau khi xóa là: " + (products.size()));
        ArrayList<Product> rs = new ArrayList<>();
        for (Product p: products){
            if (p.getId() != id) {
                rs.add(p);
            }
        }
        System.out.println("Cập nhật các sản phẩm sau khi xóa là: ");
        System.out.println(rs);

    }
    public ArrayList<Product> findByQuantity(){
        ArrayList<Product> rs = new ArrayList<>();
        for (Product p: products) {
            if (p.getQuantity() < 5) {
                rs.add(p);
            }
        }
        return rs;
    }
    public  void findByPrice() {
        ArrayList<Product> rs1 = new ArrayList<>();
        ArrayList<Product> rs2 = new ArrayList<>();
        ArrayList<Product> rs3 = new ArrayList<>();
        for (Product p: products){
            if(p.getPrice() < 50_000) {
                rs1.add(p);
            }
            if(p.getPrice()>=50_000 && p.getPrice()<= 100_000) {
                rs2.add(p);
            }
            if (p.getPrice() >100_000) {
                rs3.add(p);
            }
        }
        System.out.println("Các sản phẩm có gía từ 50000 trở xuống là: " +rs1);
        System.out.println("Các sản phẩm có gía từ 50000 đến 100000 là: " +rs2);
        System.out.println("Các sản phẩm có gía từ 100000 trở lên là: " +rs3);

    }
}
