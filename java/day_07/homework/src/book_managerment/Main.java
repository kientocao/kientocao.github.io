package book_managerment;

import book_managerment.controller.BookController;

public class Main {
    public static void main(String[] args) {
        BookController bookController = new BookController();
        bookController.run();
    }
}
