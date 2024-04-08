package _com6.ingecine.Controller;

import _com6.ingecine.Model.ProductComboAmount;
import _com6.ingecine.Repository.ProductComboAmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productComboAmount")
public class ProductComboAmountController {
    @Autowired
    private ProductComboAmountRepository repository;

    public ProductComboAmountController() {
    }

    @PostMapping("/create")
    public ProductComboAmount createProductComboAmount(@RequestBody ProductComboAmount productComboAmount) {
        return repository.save(productComboAmount);
    }

    @GetMapping("/get")
    public List<ProductComboAmount> getProductComboAmount() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public ProductComboAmount updateProductComboAmount(@RequestBody ProductComboAmount productComboAmount) {
        if (repository.existsById(productComboAmount.getId())) {
            repository.deleteById(productComboAmount.getId());
            return repository.save(productComboAmount);
        }
        return null;
    }
}
