package _com6.ingecine.Controller;

import _com6.ingecine.Model.HallChair;
import _com6.ingecine.Repository.HallChairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hallChair")
public class HallChairController {
    @Autowired
    private HallChairRepository repository;

    public HallChairController() {
    }

    @PostMapping("/create")
    public HallChair createHallChair(@RequestBody HallChair hallChair) {
        return repository.save(hallChair);
    }

    @GetMapping("/get")
    public List<HallChair> getHallChair() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public HallChair updateHallChair(@RequestBody HallChair hallChair) {
        if (repository.existsById(hallChair.getId())) {
            repository.deleteById(hallChair.getId());
            return repository.save(hallChair);
        }
        return null;
    }
}
