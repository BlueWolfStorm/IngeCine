package _com6.ingecine.Controller;

import _com6.ingecine.Model.ComboCart;
import _com6.ingecine.Repository.ComboCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/comboCart")
public class ComboCartController {
    @Autowired
    private ComboCartRepository repository;

    public ComboCartController() {
    }

    public ComboCart createComboCart(ComboCart comboCart) {
        return repository.save(comboCart);
    }

    public ComboCart getComboCart(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteComboCart(Long id) {
        repository.deleteById(id);
    }

    public ComboCart updateComboCart(ComboCart comboCart) {
        if (repository.existsById(comboCart.getId())) {
            repository.deleteById(comboCart.getId());
            return repository.save(comboCart);
        }
        return null;
    }
}
