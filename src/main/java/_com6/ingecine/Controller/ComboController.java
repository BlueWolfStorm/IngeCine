package _com6.ingecine.Controller;

import _com6.ingecine.Model.Combo;
import _com6.ingecine.Repository.ComboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/combo")
public class ComboController {
    @Autowired
    private ComboRepository repository;

    public ComboController() {
    }

    @PostMapping("/create")
    public Combo createCombo(Combo combo) {
        return repository.save(combo);
    }

    @GetMapping("/get")
    public Combo getCombo(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteCombo(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Combo updateCombo(Combo combo) {
        if (repository.existsById(combo.getId())) {
            repository.deleteById(combo.getId());
            return repository.save(combo);
        }
        return null;
    }
}
