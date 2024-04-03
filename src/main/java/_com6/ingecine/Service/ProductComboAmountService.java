package _com6.ingecine.Service;

import _com6.ingecine.Repository.ProductComboAmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductComboAmountService {
    private final ProductComboAmountRepository repository;

    @Autowired
    public ProductComboAmountService(ProductComboAmountRepository repository) {
        this.repository = repository;
    }
}
