package _com6.ingecine.Service;

import _com6.ingecine.Model.Cart;
import _com6.ingecine.Model.UserAccount;
import _com6.ingecine.Repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService {
    private final UserAccountRepository repository;

    @Autowired
    public UserAccountService(UserAccountRepository repository) {
        this.repository = repository;
    }

    public UserAccount login(String email, String password) {
        // TODO: Implement the functionality to log in a user. This function should return the User object if the login was successful, null otherwise.
        return null;
    }

    public boolean register(String name, String address, String email, String phone) {
        // TODO: Implement the functionality to register a new user. This function should return true if the registration was successful, false otherwise.
        return false;
    }

    public boolean addCart(Cart cart, UserAccount user) {
        // TODO: Implement the functionality to add a new cart to a user. This function should return true if the cart was added successfully, false otherwise.
        return false;
    }

    public boolean removeCart(Cart cart, UserAccount user) {
        // TODO: Implement the functionality to remove an existing cart from a user. This function should return true if the cart was removed successfully, false otherwise.
        return false;
    }

    public boolean updateCart(Cart cart, UserAccount user) {
        // TODO: Implement the functionality to update an existing cart of a user. This function should return true if the cart was updated successfully, false otherwise.
        return false;
    }

    public List<Cart> getCarts(UserAccount user) {
        // TODO: Implement the functionality to get all carts of a user. This function should return a list of Cart objects.
        return null;
    }
}
