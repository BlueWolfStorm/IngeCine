package _com6.ingecine.Controller;

import _com6.ingecine.Model.Hall;
import _com6.ingecine.Repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hall")
public class HallController {
    @Autowired
    private HallRepository repository;

    public HallController() {
    }

    @PostMapping("/create")
    public Hall createHall(Hall hall) {
        return repository.save(hall);
    }

    @GetMapping("/get")
    public Hall getHall(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteHall(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Hall updateHall(Hall hall) {
        if (repository.existsById(hall.getId())) {
            repository.deleteById(hall.getId());
            return repository.save(hall);
        }
        return null;
    }
}
