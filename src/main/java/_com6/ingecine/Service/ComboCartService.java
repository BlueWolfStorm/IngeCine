package _com6.ingecine.Service;

import _com6.ingecine.Repository.ComboCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComboCartService {
    private final ComboCartRepository repository;

    @Autowired
    public ComboCartService(ComboCartRepository repository) {
        this.repository = repository;
    }
}
