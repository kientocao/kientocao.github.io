package model;

public class Film {
    private int id;
    private String title;
    private String category;
    private String author;
    private String date;
    public Film(){

    }
    public Film(int id, String title, String category, String author, String date){
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
