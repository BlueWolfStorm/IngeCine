package _com6.ingecine.Controller;

import _com6.ingecine.Model.ComboCart;
import _com6.ingecine.Repository.ComboCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comboCart")
public class ComboCartController {
    @Autowired
    private ComboCartRepository repository;

    public ComboCartController() {
    }

    @PostMapping("/create")
    public ComboCart createComboCart(@RequestBody ComboCart comboCart) {
        return repository.save(comboCart);
    }

    @GetMapping("/get")
    public List<ComboCart> getComboCart() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public ComboCart updateComboCart(@RequestBody ComboCart comboCart) {
        if (repository.existsById(comboCart.getId())) {
            repository.deleteById(comboCart.getId());
            return repository.save(comboCart);
        }
        return null;
    }
}
