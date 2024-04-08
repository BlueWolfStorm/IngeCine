package _com6.ingecine.Controller;

import _com6.ingecine.Model.MovieFunction;
import _com6.ingecine.Repository.MovieFunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movieFunction")
public class MovieFunctionController {
    @Autowired
    private MovieFunctionRepository repository;

    public MovieFunctionController() {
    }

    @PostMapping("/create")
    public MovieFunction createMovieFunction(@RequestBody MovieFunction movieFunction) {
        return repository.save(movieFunction);
    }

    @GetMapping("/get")
    public List<MovieFunction> getMovieFunction() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public MovieFunction updateMovieFunction(@RequestBody MovieFunction movieFunction) {
        if (repository.existsById(movieFunction.getId())) {
            repository.deleteById(movieFunction.getId());
            return repository.save(movieFunction);
        }
        return null;
    }
}
