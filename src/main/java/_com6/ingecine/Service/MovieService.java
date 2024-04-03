package _com6.ingecine.Service;

import _com6.ingecine.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private final MovieRepository repository;

    @Autowired
    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }
}
