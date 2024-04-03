package _com6.ingecine.Service;

import _com6.ingecine.Repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HallService {
    private final HallRepository repository;

    @Autowired
    public HallService(HallRepository repository) {
        this.repository = repository;
    }
}
