package _com6.ingecine.Controller;

import _com6.ingecine.Model.HallChair;
import _com6.ingecine.Repository.HallChairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hallChair")
public class HallChairController {
    @Autowired
    private HallChairRepository repository;

    public HallChairController() {
    }

    public HallChair createHallChair(HallChair hallChair) {
        return repository.save(hallChair);
    }

    public HallChair getHallChair(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteHallChair(Long id) {
        repository.deleteById(id);
    }

    public HallChair updateHallChair(HallChair hallChair) {
        if (repository.existsById(hallChair.getId())) {
            repository.deleteById(hallChair.getId());
            return repository.save(hallChair);
        }
        return null;
    }
}
