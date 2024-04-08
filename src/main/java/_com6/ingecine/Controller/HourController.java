package _com6.ingecine.Controller;

import _com6.ingecine.Model.Hour;
import _com6.ingecine.Repository.HourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hour")
public class HourController {
    @Autowired
    private HourRepository repository;

    public HourController() {
    }

    @PostMapping("/create")
    public Hour createHour(Hour hour) {
        return repository.save(hour);
    }

    @GetMapping("/get")
    public Hour getHour(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteHour(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Hour updateHour(Hour hour) {
        if (repository.existsById(hour.getId())) {
            repository.deleteById(hour.getId());
            return repository.save(hour);
        }
        return null;
    }
}
