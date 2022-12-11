package book_managerment.model;

public class Book {
    public int id;
    public String title;
    public Book(){
    }
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
