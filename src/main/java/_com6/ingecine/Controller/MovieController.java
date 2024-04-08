package _com6.ingecine.Controller;

import _com6.ingecine.Model.Movie;
import _com6.ingecine.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieRepository repository;

    public MovieController() {
    }

    @PostMapping("/create")
    public Movie createMovie(@RequestBody Movie movie) {
        return repository.save(movie);
    }

    @GetMapping("/get")
    public List<Movie> getMovie() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Movie updateMovie(@RequestBody Movie movie) {
        if (repository.existsById(movie.getId())) {
            repository.deleteById(movie.getId());
            return repository.save(movie);
        }
        return null;
    }
}
