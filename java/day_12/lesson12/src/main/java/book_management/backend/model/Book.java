package book_management.backend.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

//Khai báo cấu trúc dữ liệu book
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
private int id;
private String title;
@SerializedName("category")
private List<String> categories;
private String author;
@SerializedName("page_number")
private int pageNumber;
@SerializedName("release_year")
private int releaseYear;
}
//3 biến cần phải map categories và pageNumber , releaseYear