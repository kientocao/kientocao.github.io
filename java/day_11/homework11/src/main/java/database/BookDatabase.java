package database;

import model.Book;

import java.util.ArrayList;

import static model.BookGson.getListObjectFromJsonFile;

public class BookDatabase {
    public static ArrayList<Book> books = getListObjectFromJsonFile("list-book.json");
}
