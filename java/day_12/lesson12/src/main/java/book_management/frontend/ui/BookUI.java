package book_management.frontend.ui;

import book_management.backend.controller.BookController;
import book_management.backend.exception.NotFoundException;
import book_management.backend.model.Book;
import book_management.backend.request.CreateBookRequest;
import book_management.backend.request.UpdateBookRequest;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
//Gọi đến BookController
public class BookUI {
    BookController bookController = new BookController();

    public void run() {
        Scanner sc = new Scanner(System.in);
        int option =0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();
            try {
                System.out.print("Nhập lựa chọn : ");
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }

            switch (option) {
                case 1: {
                    List<Book> books = bookController.getBooks();
                    if (books.isEmpty()) {
                        System.out.println("Không có quyển sách nào trong danh sách");
                    } else {
                        System.out.println("Danh sách book: ");
                        for (book_management.backend.model.Book b: books
                             ) {
                            System.out.println(b);
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nhập tên sách : ");
                    String name = sc.nextLine();
                    List<Book> books = bookController.getBookByName(name);
                    if (books.isEmpty()) {
                        System.out.println("Không có quyển sách nào có tên là : " + name);
                    } else {
                        System.out.println("Danh sách book có tên : " + name + "là :");
                        for (Book b: books
                        ) {
                            System.out.println(b);
                        }
                    }

                    break;
                }
                case 3: {
                    System.out.println("Nhập id cần xóa:");
                    int id = Integer.parseInt(sc.nextLine());
                    try {
                        bookController.deleteBook(id);
                    } catch (NotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhập id cần chỉnh sửa : ");
                    int id =Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập vào tiêu đề : ");
                    String title = sc.nextLine();
                    System.out.println("Nhập vào tên tác giả: ");
                    String author = sc.nextLine();
                    UpdateBookRequest request = new UpdateBookRequest(title, author);
                    try {
                        Book book = bookController.updateBook(id, request);
                        System.out.println("Thông tin sách sau khi cập nhật là: ");
                        System.out.println(book);
                    } catch (NotFoundException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 5: {
                    System.out.print("Nhập vào tiêu đề : ");
                    String title = sc.nextLine();

                    System.out.print("Nhập vào tên tác giả : ");
                    String author = sc.nextLine();

                    System.out.print("Nhập vào số trang sách : ");
                    int pageNumber = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập vào năm xuất bản : ");
                    int releaseYear = Integer.parseInt(sc.nextLine());

                    CreateBookRequest request = new CreateBookRequest(title, author, pageNumber, releaseYear);
                    Book book = bookController.createBook(request);

                    System.out.println("Quyển sách sau khi tạo là : ");
                    System.out.println(book);
                    break;
                }
                case 6: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                }
            }
        }
    }
        public void showMenu() {
            System.out.println("\n------------MENU------------");
            System.out.println("1- Xem danh sách books");
            System.out.println("2- Tìm sách theo tên ");
            System.out.println("3- Xóa sách theo id ");
            System.out.println("4- Nhập id cần chỉnh sửa  ");
            System.out.println("5- Thêm sách mới ");
            System.out.println("6 - Thoát\n");
    }

}
