package _com6.ingecine.Controller;

import _com6.ingecine.Model.Product;
import _com6.ingecine.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/product")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    public ProductController() {
    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }

    public Product getProduct(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    public Product updateProduct(Product product) {
        if (repository.existsById(product.getId())) {
            repository.deleteById(product.getId());
            return repository.save(product);
        }
        return null;
    }
}
