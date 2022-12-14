package service;

import model.Movie;
import model.Serial;
import repository.FilmRepository;

public class FilmService {
    public void findByTitle(String title) {
        int count = 0;
        for (Movie movie : FilmRepository.findMovies()) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(movie);
                count++;
            }
        }
        for (Serial serial : FilmRepository.findSerials()) {
            if (serial.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(serial);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có quyển sách nào có title = " + title);
        }
    }

    public void printFilm() {
        for (Movie movie: FilmRepository.findMovies()) {
            System.out.println(movie);
        }
        for (Serial serial:FilmRepository.findSerials()) {
            System.out.println(serial);
        }
    }
}
