package _com6.ingecine.Controller;

import _com6.ingecine.Model.Combo;
import _com6.ingecine.Repository.ComboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/combo")
public class ComboController {
    @Autowired
    private ComboRepository repository;

    public ComboController() {
    }

    @PostMapping("/create")
    public Combo createCombo(@RequestBody Combo combo) {
        return repository.save(combo);
    }

    @GetMapping("/get")
    public List<Combo> getCombo() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Combo updateCombo(@RequestBody Combo combo) {
        if (repository.existsById(combo.getId())) {
            repository.deleteById(combo.getId());
            return repository.save(combo);
        }
        return null;
    }
}
