package bookManagement.service;

import bookManagement.repository.BookRepository;

public class BookService {
    public BookRepository bookRepository = new BookRepository();
    public void findByTitle (String title) {
        int count =0;
        for (Book book:
        BookRepository.findAll()) {
            if(book.title.toLowerCase().contains(title.toLowerCase())){
                System.out.println(book);
                count++;
            }
            if(count ==0) {
                System.out.println("Không có quyển sách nào có title =" + title);
            }
        }
    }
}
