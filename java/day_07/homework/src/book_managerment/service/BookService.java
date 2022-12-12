package book_managerment.service;

import book_managerment.database.BookDatabase;
import book_managerment.model.Book;
import book_managerment.repository.BookRepository;

public class BookService {
    public BookRepository bookRepository = new BookRepository();

    public void findByTitle(String title) {
        int count = 0;
        for (Book book : bookRepository.findAll()) {
            if (book.title.toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có quyển sách nào có title = " + title);
        }
    }

    public void findByCategory(String category) {
        int count = 0;
        for (Book book : bookRepository.findAll()) {
            if (book.category.toLowerCase().contains(category.toLowerCase())) {
                System.out.println(book);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có quyển sách nào có thể loại = " + category);
        }
    }

    public void publishYears(int year) {

        for (Book book : bookRepository.findAll()) {
            if (book.year == year) {
                System.out.println(book);
            }
        }
    }
}
