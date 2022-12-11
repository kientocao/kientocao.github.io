package bookManagement.repository;

import bookManagement.database.BookDatabase;

import java.awt.print.Book;

public class BookRepository {
    public static Book [] findAll() {
        return BookDatabase.books;
    }
}
//Chứa các phương thức để truy cập vào database
