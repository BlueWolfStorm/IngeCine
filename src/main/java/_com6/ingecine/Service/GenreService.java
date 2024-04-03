package _com6.ingecine.Service;

import _com6.ingecine.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    private final GenreRepository repository;

    @Autowired
    public GenreService(GenreRepository repository) {
        this.repository = repository;
    }
}
