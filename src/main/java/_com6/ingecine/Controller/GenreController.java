package _com6.ingecine.Controller;

import _com6.ingecine.Model.Genre;
import _com6.ingecine.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/genre")
public class GenreController {
    @Autowired
    private GenreRepository repository;

    public GenreController() {
    }

    @PostMapping("/create")
    public Genre createGenre(Genre genre) {
        return repository.save(genre);
    }

    @GetMapping("/get")
    public Genre getGenre(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteGenre(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Genre updateGenre(Genre genre) {
        if (repository.existsById(genre.getId())) {
            repository.deleteById(genre.getId());
            return repository.save(genre);
        }
        return null;
    }
}
