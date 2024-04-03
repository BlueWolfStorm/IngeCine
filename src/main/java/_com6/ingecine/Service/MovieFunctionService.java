package _com6.ingecine.Service;

import _com6.ingecine.Repository.MovieFunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieFunctionService {
    private final MovieFunctionRepository repository;

    @Autowired
    public MovieFunctionService(MovieFunctionRepository repository) {
        this.repository = repository;
    }
}
