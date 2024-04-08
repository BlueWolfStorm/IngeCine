package _com6.ingecine.Controller;

import _com6.ingecine.Model.Movie;
import _com6.ingecine.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/movie")
public class MovieController {
    @Autowired
    private MovieRepository repository;

    public MovieController() {
    }

    public Movie createMovie(Movie movie) {
        return repository.save(movie);
    }

    public Movie getMovie(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteMovie(Long id) {
        repository.deleteById(id);
    }

    public Movie updateMovie(Movie movie) {
        if (repository.existsById(movie.getId())) {
            repository.deleteById(movie.getId());
            return repository.save(movie);
        }
        return null;
    }
}
