package _com6.ingecine.Controller;

import _com6.ingecine.Model.ProductComboAmount;
import _com6.ingecine.Repository.ProductComboAmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/productComboAmount")
public class ProductComboAmountController {
    @Autowired
    private ProductComboAmountRepository repository;

    public ProductComboAmountController() {
    }

    @PostMapping("/create")
    public ProductComboAmount createProductComboAmount(ProductComboAmount productComboAmount) {
        return repository.save(productComboAmount);
    }

    @GetMapping("/get")
    public ProductComboAmount getProductComboAmount(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteProductComboAmount(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public ProductComboAmount updateProductComboAmount(ProductComboAmount productComboAmount) {
        if (repository.existsById(productComboAmount.getId())) {
            repository.deleteById(productComboAmount.getId());
            return repository.save(productComboAmount);
        }
        return null;
    }
}
