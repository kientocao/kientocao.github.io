package book_managerment.repository;

import book_managerment.database.BookDatabase;
import book_managerment.model.Book;

public class BookRepository {
    public static Book[] findAll() {
        return BookDatabase.books;
    }
}
