package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Book {
    private int id;
    private String title;
    private String[] category = {"Action", "Drama", "Romance", "War", "Crime",
            "Adventure", "Comedy", "Horror", "Mystery", "Thriller", "Sci-Fi"};
    private String author;
    private int page_number;
    private int release_year;

    @Override
    public String toString() {
        System.out.printf("%-5d %-45s %-30s %-25s %-15d %-10d", this.getId(), this.getTitle(), Arrays.toString(this.getCategory()),
                this.getAuthor(), this.getPage_number(), this.getRelease_year());
        return "";
    }
}