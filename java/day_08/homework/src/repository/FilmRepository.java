package repository;

import database.FilmDatabase;
import model.Movie;
import model.Serial;

public class FilmRepository {
    public  static Movie[] findMovies(){
        return FilmDatabase.movies;
    }
    public static Serial[] findSerials(){
        return FilmDatabase.serials;
    }
}
