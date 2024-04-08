package _com6.ingecine.Controller;

import _com6.ingecine.Model.CastActor;
import _com6.ingecine.Repository.CastActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/castActor")
public class CastActorController {
    @Autowired
    private CastActorRepository repository;

    public CastActorController() {
    }

    public CastActor createCastActor(CastActor castActor) {
        return repository.save(castActor);
    }

    public CastActor getCastActor(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteCastActor(Long id) {
        repository.deleteById(id);
    }

    public CastActor updateCastActor(CastActor castActor) {
        if (repository.existsById(castActor.getId())) {
            repository.deleteById(castActor.getId());
            return repository.save(castActor);
        }
        return null;
    }
}
