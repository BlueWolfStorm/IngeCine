package _com6.ingecine.Controller;

import _com6.ingecine.Model.MovieFunction;
import _com6.ingecine.Repository.MovieFunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/movieFunction")
public class MovieFunctionController {
    @Autowired
    private MovieFunctionRepository repository;

    public MovieFunctionController() {
    }

    @PostMapping("/create")
    public MovieFunction createMovieFunction(MovieFunction movieFunction) {
        return repository.save(movieFunction);
    }

    @GetMapping("/get")
    public MovieFunction getMovieFunction(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteMovieFunction(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public MovieFunction updateMovieFunction(MovieFunction movieFunction) {
        if (repository.existsById(movieFunction.getId())) {
            repository.deleteById(movieFunction.getId());
            return repository.save(movieFunction);
        }
        return null;
    }
}
