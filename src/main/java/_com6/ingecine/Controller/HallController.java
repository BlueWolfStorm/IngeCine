package _com6.ingecine.Controller;

import _com6.ingecine.Model.Hall;
import _com6.ingecine.Repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hall")
public class HallController {
    @Autowired
    private HallRepository repository;

    public HallController() {
    }

    public Hall createHall(Hall hall) {
        return repository.save(hall);
    }

    public Hall getHall(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteHall(Long id) {
        repository.deleteById(id);
    }

    public Hall updateHall(Hall hall) {
        if (repository.existsById(hall.getId())) {
            repository.deleteById(hall.getId());
            return repository.save(hall);
        }
        return null;
    }
}
