package _com6.ingecine.Controller;

import _com6.ingecine.Model.ProductCart;
import _com6.ingecine.Repository.ProductCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productCart")
public class ProductCartController {
    @Autowired
    private ProductCartRepository repository;

    public ProductCartController() {
    }

    @PostMapping("/create")
    public ProductCart createProductCart(@RequestBody ProductCart productCart) {
        return repository.save(productCart);
    }

    @GetMapping("/get")
    public List<ProductCart> getProductCart() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public ProductCart updateProductCart(@RequestBody ProductCart productCart) {
        if (repository.existsById(productCart.getId())) {
            repository.deleteById(productCart.getId());
            return repository.save(productCart);
        }
        return null;
    }
}
