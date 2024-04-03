package _com6.ingecine.Service;

import _com6.ingecine.Repository.ProductCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductCartService {
    private final ProductCartRepository repository;

    @Autowired
    public ProductCartService(ProductCartRepository repository) {
        this.repository = repository;
    }
}
