package _com6.ingecine.Controller;

import _com6.ingecine.Model.Hour;
import _com6.ingecine.Repository.HourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hour")
public class HourController {
    @Autowired
    private HourRepository repository;

    public HourController() {
    }

    public Hour createHour(Hour hour) {
        return repository.save(hour);
    }

    public Hour getHour(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteHour(Long id) {
        repository.deleteById(id);
    }

    public Hour updateHour(Hour hour) {
        if (repository.existsById(hour.getId())) {
            repository.deleteById(hour.getId());
            return repository.save(hour);
        }
        return null;
    }
}
