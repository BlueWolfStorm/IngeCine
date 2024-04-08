package _com6.ingecine.Controller;

import _com6.ingecine.Model.Genre;
import _com6.ingecine.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    @Autowired
    private GenreRepository repository;

    public GenreController() {
    }

    @PostMapping("/create")
    public Genre createGenre(@RequestBody Genre genre) {
        return repository.save(genre);
    }

    @GetMapping("/get")
    public List<Genre> getGenre() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Genre updateGenre(@RequestBody Genre genre) {
        if (repository.existsById(genre.getId())) {
            repository.deleteById(genre.getId());
            return repository.save(genre);
        }
        return null;
    }
}
