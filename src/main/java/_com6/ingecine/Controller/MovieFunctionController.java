package _com6.ingecine.Controller;

import _com6.ingecine.Model.MovieFunction;
import _com6.ingecine.Repository.MovieFunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/movieFunction")
public class MovieFunctionController {
    @Autowired
    private MovieFunctionRepository repository;

    public MovieFunctionController() {
    }

    public MovieFunction createMovieFunction(MovieFunction movieFunction) {
        return repository.save(movieFunction);
    }

    public MovieFunction getMovieFunction(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteMovieFunction(Long id) {
        repository.deleteById(id);
    }

    public MovieFunction updateMovieFunction(MovieFunction movieFunction) {
        if (repository.existsById(movieFunction.getId())) {
            repository.deleteById(movieFunction.getId());
            return repository.save(movieFunction);
        }
        return null;
    }
}
