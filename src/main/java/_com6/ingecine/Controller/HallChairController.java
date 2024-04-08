package _com6.ingecine.Controller;

import _com6.ingecine.Model.HallChair;
import _com6.ingecine.Repository.HallChairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hallChair")
public class HallChairController {
    @Autowired
    private HallChairRepository repository;

    public HallChairController() {
    }

    @PostMapping("/create")
    public HallChair createHallChair(HallChair hallChair) {
        return repository.save(hallChair);
    }

    @GetMapping("/get")
    public HallChair getHallChair(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteHallChair(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public HallChair updateHallChair(HallChair hallChair) {
        if (repository.existsById(hallChair.getId())) {
            repository.deleteById(hallChair.getId());
            return repository.save(hallChair);
        }
        return null;
    }
}
