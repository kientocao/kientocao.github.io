package controller;

import repository.ProductRepository;
import service.ProductService;

import java.util.Scanner;

public class ProductController {
    ProductRepository productRepository = new ProductRepository();
    static ProductService productService = new ProductService();
    public static void run(){
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Thông tin tất cả các sản phẩm là : ");
                    productService.printProduct();
                    break;
                }

                case 2: {
                    System.out.print("Nhập tên cần tìm : ");
                    String name = sc.nextLine();
                    productService.printfindByName(name);
                    break;
                }
                case 3: {
                    System.out.println("Nhập id cần tìm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    productService.printfindbyId(id);
                    break;
                }case 4: {
                    System.out.println("Các sản phẩm có số lượng dưới 5 là: ");
                    productService.printfindbyQuantity();
                    break;
                }case 5: {
                    productService.printfindPrice();
                    break;

                }case 6: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }
    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - In thông tin của tất cả các sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên: ");
        System.out.println("3 - Tìm sản phẩm theo id");
        System.out.println("4 - Tìm  sản phẩm có số lượng dưới 5");
        System.out.println("5 - Tìm sản phẩm theo mức giá");
        System.out.println("6 - Thoát");
    }
}
