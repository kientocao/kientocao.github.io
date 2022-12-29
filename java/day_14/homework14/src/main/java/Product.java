import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface IProduct{
    void display();
}
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Product {
    private String code;
    private String name;
    private String description;
    private int price;
    private int count;
    private String firm;
    private String list;

public void printInfo() {
    System.out.println(code + "-" + name + "-" + description +"-"+ price + "-" + count + "-" + firm + "-" + list );}

public static void main(String[]args){
    List<Product> products = new ArrayList<>();
products.add(new Product("abc", "iphone14", "tốt", 10_000_000,100,"Mỹ","Điện thoại"));
products.add(new Product("abc", "iphone14", "tốt", 10_000_000,100,"Anh","Laptop"));
products.add(new Product("abc", "iphone14", "tốt", 10_000_000,100,"Đức","Apple"));
products.add(new Product("abc", "iphone14", "tốt", 10_000_000,100,"Ý","Phụ kiện"));
products.add(new Product("abc", "iphone14", "tốt", 10_000_000,101,"Ý","Phụ kiện"));
products.add(new Product("abc", "iphone14", "tốt", 10_000_000,100,"HàLan","Điện thoại, Apple"));
//      In sản phẩm theo tên
    products.sort((prd1, prd2) -> prd1.getList().compareTo(prd2.getList()));
    products.sort(Comparator.comparing(Product::getList));
    System.out.println("Danh sách sản phẩm theo list: ");
    products.forEach(System.out::println);
//      In sản phẩm theo hãng
    products.sort((prd1, prd2) -> prd1.getFirm().compareTo(prd2.getFirm()));
    products.sort(Comparator.comparing(Product::getFirm));
    System.out.println("Danh sách sản phẩm theo hãng: ");
    products.forEach(System.out::println);
//      In sản phẫm theo số sản phẩm của hãng

    Collections.sort(products,new Comparator<Product>() {

        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getCount() < o2.getCount()) {
                return 1;
            } else {
                if(o1.getCount()==o2.getCount()){
                    return 0;
                } else {
                    return -1;
                }
            }

        }
    });
    System.out.println("Danh sách sản phẫm theo hãng và số lượng giảm dần là: ");
    products.forEach(System.out::println);
}
}