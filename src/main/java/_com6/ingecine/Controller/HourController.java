package _com6.ingecine.Controller;

import _com6.ingecine.Model.Hour;
import _com6.ingecine.Repository.HourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hour")
public class HourController {
    @Autowired
    private HourRepository repository;

    public HourController() {
    }

    @PostMapping("/create")
    public Hour createHour(@RequestBody Hour hour) {
        return repository.save(hour);
    }

    @GetMapping("/get")
    public List<Hour> getHour() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Hour updateHour(@RequestBody Hour hour) {
        if (repository.existsById(hour.getId())) {
            return repository.save(hour);
        }
        return null;
    }
}
