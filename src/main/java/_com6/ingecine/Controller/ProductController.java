package _com6.ingecine.Controller;

import _com6.ingecine.Model.Product;
import _com6.ingecine.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    public ProductController() {
    }

    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping("/get")
    public List<Product> getProduct() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        if (repository.existsById(product.getId())) {
            repository.deleteById(product.getId());
            return repository.save(product);
        }
        return null;
    }
}
