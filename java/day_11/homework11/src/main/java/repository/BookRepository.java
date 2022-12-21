package repository;

import database.BookDatabase;
import model.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class BookRepository {

    public ArrayList<Book> findByNameContainsIgnoreCase (String name){
        ArrayList<Book> rs = new ArrayList<>();
        for (Book p:BookDatabase.books) {
            if(p.getTitle().toLowerCase().contains(name)) {
                rs.add(p);
            }
        }
        return rs;
    }
    public ArrayList<Book> findByCategory (String category) {
        ArrayList<Book> rs = new ArrayList<>();
        for (Book p: BookDatabase.books) {
            if(Arrays.toString(p.getCategory()).toLowerCase().contains(category.toLowerCase())){
                rs.add(p);
            }
        }
        return rs;
    }
}
