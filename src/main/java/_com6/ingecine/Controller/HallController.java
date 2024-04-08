package _com6.ingecine.Controller;

import _com6.ingecine.Model.Hall;
import _com6.ingecine.Repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hall")
public class HallController {
    @Autowired
    private HallRepository repository;

    public HallController() {
    }

    @PostMapping("/create")
    public Hall createHall(@RequestBody Hall hall) {
        return repository.save(hall);
    }

    @GetMapping("/get")
    public List<Hall> getHall() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Hall updateHall(@RequestBody Hall hall) {
        if (repository.existsById(hall.getId())) {
            repository.deleteById(hall.getId());
            return repository.save(hall);
        }
        return null;
    }
}
