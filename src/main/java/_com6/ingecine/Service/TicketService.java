package _com6.ingecine.Service;

import _com6.ingecine.Model.Cart;
import _com6.ingecine.Model.FunctionHallSchedule;
import _com6.ingecine.Model.HallChair;
import _com6.ingecine.Model.UserAccount;
import _com6.ingecine.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    private final TicketRepository repository;

    @Autowired
    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public boolean addFunction(FunctionHallSchedule function) {
        // TODO: Implement the functionality to add a new function. This function should return true if the function was added successfully, false otherwise.
        return false;
    }

    public boolean removeFunction(FunctionHallSchedule function) {
        // TODO: Implement the functionality to remove an existing function. This function should return true if the function was removed successfully, false otherwise.
        return false;
    }

    public boolean updateFunction(FunctionHallSchedule function, HallChair chair) {
        // TODO: Implement the functionality to update an existing function. This function should return true if the function was updated successfully, false otherwise.
        return false;
    }

    public FunctionHallSchedule getFunction() {
        // TODO: Implement the functionality to get the current function. This function should return the current FunctionHallSchedule object.
        return null;
    }

    public boolean setChair(HallChair chair) {
        // TODO: Implement the functionality to set a chair. This function should return true if the chair was set successfully, false otherwise.
        return false;
    }

    public HallChair getChair() {
        // TODO: Implement the functionality to get the current chair. This function should return the current Chair object.
        return null;
    }

    public boolean setUser(UserAccount user) {
        // TODO: Implement the functionality to set a user. This function should return true if the user was set successfully, false otherwise.
        return false;
    }

    public UserAccount getUser() {
        // TODO: Implement the functionality to get the current user. This function should return the current User object.
        return null;
    }

    public boolean setCart(Cart cart) {
        // TODO: Implement the functionality to set a cart. This function should return true if the cart was set successfully, false otherwise.
        return false;
    }

    public Cart getCart() {
        // TODO: Implement the functionality to get the current cart. This function should return the current Cart object.
        return null;
    }

    public double calculatePrice() {
        // TODO: Implement the functionality to calculate the price. This function should return the calculated price.
        return 0.0;
    }
}
