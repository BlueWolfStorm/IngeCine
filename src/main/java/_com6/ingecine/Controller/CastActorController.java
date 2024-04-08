package _com6.ingecine.Controller;

import _com6.ingecine.Model.CastActor;
import _com6.ingecine.Repository.CastActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/castActor")
public class CastActorController {
    @Autowired
    private CastActorRepository repository;

    public CastActorController() {
    }

    @PostMapping("/create")
    public CastActor createCastActor(@RequestBody CastActor castActor) {
        return repository.save(castActor);
    }

    @GetMapping("/get")
    public List<CastActor> getCastActor() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public CastActor updateCastActor(@RequestBody CastActor castActor) {
        if (repository.existsById(castActor.getId())) {
            repository.deleteById(castActor.getId());
            return repository.save(castActor);
        }
        return null;
    }
}
