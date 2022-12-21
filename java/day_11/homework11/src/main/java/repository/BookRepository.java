package repository;

import model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static database.BookDatabase.books;

public class BookRepository {

    public ArrayList<Book> findByNameContainsIgnoreCase (String name){
        ArrayList<Book> rs = new ArrayList<>();
        for (Book p: books) {
            if(p.getTitle().toLowerCase().contains(name)) {
                rs.add(p);
            }
        }
        return rs;
    }
    public ArrayList<Book> findByCategory (String category) {
        ArrayList<Book> rs = new ArrayList<>();
        for (Book p: books) {
            if(Arrays.toString(p.getCategory()).toLowerCase().contains(category.toLowerCase())){
                rs.add(p);
            }
        }
        return rs;
    }
    public void sortByPageNumber() {
        ArrayList<Book> rs = (ArrayList<Book>) books.clone();
        rs.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage_number() - o2.getPage_number();
            }
        });
        for (Book b :rs
        ) {
            System.out.println(b);
        }
    }
    public void sortByYear() {
        ArrayList<Book> rs = (ArrayList<Book>) books.clone();
        rs.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getRelease_year() - o2.getRelease_year();
            }
        });
        for (Book b: rs
             ) {
            System.out.println(b);
        }
    }
}
