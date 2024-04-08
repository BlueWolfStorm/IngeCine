package _com6.ingecine.Controller;

import _com6.ingecine.Model.Product;
import _com6.ingecine.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    public ProductController() {
    }

    @PostMapping("/create")
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @GetMapping("/get")
    public Product getProduct(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Product updateProduct(Product product) {
        if (repository.existsById(product.getId())) {
            repository.deleteById(product.getId());
            return repository.save(product);
        }
        return null;
    }
}
