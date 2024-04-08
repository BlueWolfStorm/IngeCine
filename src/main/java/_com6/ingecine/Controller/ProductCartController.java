package _com6.ingecine.Controller;

import _com6.ingecine.Model.ProductCart;
import _com6.ingecine.Repository.ProductCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/productCart")
public class ProductCartController {
    @Autowired
    private ProductCartRepository repository;

    public ProductCartController() {
    }

    public ProductCart createProductCart(ProductCart productCart) {
        return repository.save(productCart);
    }

    public ProductCart getProductCart(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteProductCart(Long id) {
        repository.deleteById(id);
    }

    public ProductCart updateProductCart(ProductCart productCart) {
        if (repository.existsById(productCart.getId())) {
            repository.deleteById(productCart.getId());
            return repository.save(productCart);
        }
        return null;
    }
}
