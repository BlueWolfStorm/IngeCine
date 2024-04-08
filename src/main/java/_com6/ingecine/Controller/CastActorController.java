package _com6.ingecine.Controller;

import _com6.ingecine.Model.CastActor;
import _com6.ingecine.Repository.CastActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/castActor")
public class CastActorController {
    @Autowired
    private CastActorRepository repository;

    public CastActorController() {
    }

    @PostMapping("/create")
    public CastActor createCastActor(CastActor castActor) {
        return repository.save(castActor);
    }

    @GetMapping("/get")
    public CastActor getCastActor(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteCastActor(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public CastActor updateCastActor(CastActor castActor) {
        if (repository.existsById(castActor.getId())) {
            repository.deleteById(castActor.getId());
            return repository.save(castActor);
        }
        return null;
    }
}
