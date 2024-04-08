package _com6.ingecine.Controller;

import _com6.ingecine.Model.Cart;
import _com6.ingecine.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cart")
public class CartController {
    @Autowired
    private CartRepository repository;

    public CartController() {
    }

    @PostMapping("/create")
    public Cart createCart(Cart cart) {
        return repository.save(cart);
    }

    @GetMapping("/get")
    public Cart getCart(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteCart(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Cart updateCart(Cart cart) {
        if (repository.existsById(cart.getId())) {
            repository.deleteById(cart.getId());
            return repository.save(cart);
        }
        return null;
    }
}
