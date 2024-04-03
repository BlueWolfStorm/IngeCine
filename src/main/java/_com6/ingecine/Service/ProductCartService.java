package _com6.ingecine.Service;

import _com6.ingecine.Model.Cart;
import _com6.ingecine.Model.ProductCart;
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

    public boolean isProductExist(ProductCart product) {
        // TODO: Implement the functionality to check if a product exists in the cart. This function should return true if the product exists, false otherwise.
        return false;
    }

    public boolean addProduct(ProductCart product, Cart cart) {
        // TODO: Implement the functionality to add a new product to the cart. This function should return true if the product was added successfully, false otherwise.
        return false;
    }

    public boolean removeProduct(ProductCart product, Cart cart) {
        // TODO: Implement the functionality to remove an existing product from the cart. This function should return true if the product was removed successfully, false otherwise.
        return false;
    }

    public boolean updateProduct(ProductCart product, Cart cart) {
        // TODO: Implement the functionality to update an existing product in the cart. This function should return true if the product was updated successfully, false otherwise.
        return false;
    }

    public boolean addDiscount(ProductCart product) {
        // TODO: Implement the functionality to add a discount to a product. This function should return true if the discount was added successfully, false otherwise.
        return false;
    }

    public boolean removeDiscount(ProductCart product) {
        // TODO: Implement the functionality to remove a discount from a product. This function should return true if the discount was removed successfully, false otherwise.
        return false;
    }

    public boolean getPrice(ProductCart product) {
        // TODO: Implement the functionality to get the price of a product. This function should return true if the price was retrieved successfully, false otherwise.
        return false;
    }

    public int selectAmountProduct(ProductCart product) {
        // TODO: Implement the functionality to select the amount of a product. This function should return the selected amount.
        return 0;
    }

    public double getTotalPrice(ProductCart product, Cart cart) {
        // TODO: Implement the functionality to get the total price of a product in the cart. This function should return the total price.
        return 0.0;
    }
}
