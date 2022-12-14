package database;

import model.Movie;
import model.Serial;

public class FilmDatabase {
    public static Movie[] movies = {
            new Movie(1,"Endgame", "Khoa học", "obama","ngày 14/12/2022",200),
            new Movie(2,"Endgame2","Khoa học","obama2","Ngày 10/12/2022",149),
            new Movie(3,"Endgame3","Khoa học","obama3","Ngày 6/12/2022",159),
            new Movie(4,"Endgame4","Khoa học","obama4","Ngày 2/12/2022",139),

    };
    public static Serial[] serials = {
            new Serial(5,"Avatar","Viễn tưởng", "obama2", "ngày 15/12/2022", 150, "15h"),
            new Serial(6,"Avatar2","Viễn tưởng", "obama3", "ngày 14/12/2022", 140, "12h"),
            new Serial(7,"Avatar3","Viễn tưởng", "obama5", "ngày 13/12/2022", 120, "10h"),
            new Serial(8,"Avatar","Viễn tưởng", "obama4", "ngày 12/12/2022", 130, "8h"),
    };
}
