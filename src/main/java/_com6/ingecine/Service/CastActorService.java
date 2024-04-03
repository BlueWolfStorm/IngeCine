package _com6.ingecine.Service;

import _com6.ingecine.Repository.CastActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastActorService {
    private final CastActorRepository repository;

    @Autowired
    public CastActorService(CastActorRepository repository) {
        this.repository = repository;
    }
}
