package book_managerment.database;

import book_managerment.model.Book;

public class BookDatabase {
    public static Book[] books = {
            new Book(1,"Người cùng khổ","Nguyễn Ái Quốc", "báo", "lao động", 1969),
            new Book(2, "Dế mèn phiêu lưu kí", "Nguyễn Ngọc Kí", "truyện", "giáo dục đào tạo", 1990),
            new Book(3, "Trò chuyện buổi sáng cùng Tony Buzan", "Tony Buzan", "đời sống", "Singapore", 2001),
            new Book(4, "Đắc nhân tâm", "Dale Carnegie", "sách", "Simon and Schuster", 1936),
            new Book(5, "Phía sau tội các nhân danh khoa học", "Sam Kaen", "sách", "thời đại", 2022),
    };
}
