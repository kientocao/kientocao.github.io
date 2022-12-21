package controller;

import model.Book;
import repository.BookRepository;

import java.util.ArrayList;
import java.util.Scanner;

import static model.BookGson.getListObjectFromJsonFile;



    public class BookController {
      BookRepository bookRepository = new BookRepository();
      Scanner scanner = new Scanner(System.in);
        public void run() {
            Scanner sc = new Scanner(System.in);
            boolean isQuit = false;

            while (!isQuit) {
                showMenu();
                System.out.print("Nhập lựa chọn : ");
                int option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1: {
                        ArrayList<model.Book> books = getListObjectFromJsonFile("list-book.json");
                        System.out.println("Thông tin sách");
                        for (Book s : books
                        ) {
                            System.out.println(s);
                        }
                    }
                    break;
                    case 2:
                        System.out.println("Nhập tên cần tìm: ");
                        String title = scanner.nextLine();
                        ArrayList<Book> rs = bookRepository.findByNameContainsIgnoreCase(title);
                        for (Book p:rs
                             ) {
                            System.out.println(p);
                        }
                        break;
                    case 3:
                        System.out.println("Nhập thể loại cần tìm");
                        String category = scanner.nextLine();
                        ArrayList<Book> rs2 = bookRepository.findByCategory(category);
                        for (Book p:rs2
                             ) {
                            System.out.println(p);
                        }
                        break;
                    case 4:
                        System.out.println("Sắp xếp sách theo số trang");
                        break;
                    case 5:
                        System.out.println("Sắp xếp sách theo thể loại");
                        break;

                    case 6:
                        isQuit = true;
                        break;
                    default:{
                        System.out.println("Lựa chọn không hợp lệ");
                    }
                }
            }
        }

        public void showMenu() {
            System.out.println("\n------------MENU------------");
            System.out.println(
                    "1. Lấy thông tin toàn bộ sách\n" +
                            "2. Tìm sách theo tên\n" +
                            "3. Tìm sách theo thể loại\n" +
                            "4. Sắp xếp sách theo số trang\n" +
                            "5. Sắp xếp sách theo năm xuất bản\n" +
                            "6. Thoát");
        }
    }


