package book_management.backend.service;

import book_management.backend.model.Book;
import book_management.backend.repository.BookRepository;
import book_management.backend.request.CreateBookRequest;
import book_management.backend.request.UpdateBookRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookService {
    private final BookRepository bookRepository = new BookRepository();
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBooksByName(String name) {
        List<Book> books = bookRepository.findAll();
        List<Book> rs = new ArrayList<>();
        for (Book book: books) {
            if(book.getTitle().toLowerCase().contains(name.toLowerCase())) {
                rs.add(book);
            }
        }
        return rs;
//        Có 2 cách lọc từ findAll
//        Lọc từ danh sách trong Database
    }

    public void deleteBook(int id) {

//        không có sách-> báo lỗi
        Book book = bookRepository.findById(id);
//              có sách - > xóa
        bookRepository.delete(book);
    }

    public Book updateBook(int id, UpdateBookRequest request) {
        Book book = bookRepository.findById(id);
//        Có sách cập nhật
//        book.setTitle(request.getTitle());
//        book.setAuthor(request.getAuthor());
        bookRepository.update(id,request);
        return book;
    }

    public Book createBook(CreateBookRequest request) {
        Random rd = new Random();

        Book book = new Book();
        book.setId(rd.nextInt(1000));
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setCategories(request.getCategories());
        book.setPageNumber(request.getPageNumber());
        book.setReleaseYear(request.getReleaseYear());

        bookRepository.save(book);

        return book;
    }
}
