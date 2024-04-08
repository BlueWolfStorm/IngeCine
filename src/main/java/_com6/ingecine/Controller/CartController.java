package _com6.ingecine.Controller;

import _com6.ingecine.Model.Cart;
import _com6.ingecine.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartRepository repository;

    public CartController() {
    }

    @PostMapping("/create")
    public Cart createCart(@RequestBody Cart cart) {
        return repository.save(cart);
    }

    @GetMapping("/get")
    public List<Cart> getCart() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Cart updateCart(@RequestBody Cart cart) {
        if (repository.existsById(cart.getId())) {
            repository.deleteById(cart.getId());
            return repository.save(cart);
        }
        return null;
    }
}
