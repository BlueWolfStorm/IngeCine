package _com6.ingecine.Service;

import _com6.ingecine.Repository.ComboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComboService {
    private final ComboRepository repository;

    @Autowired
    public ComboService(ComboRepository repository) {
        this.repository = repository;
    }
}
