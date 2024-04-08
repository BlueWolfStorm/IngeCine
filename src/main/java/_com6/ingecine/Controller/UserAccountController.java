package _com6.ingecine.Controller;

import _com6.ingecine.Model.UserAccount;
import _com6.ingecine.Repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userAccount")
public class UserAccountController {
    @Autowired
    private UserAccountRepository repository;

    public UserAccountController() {
    }

    @PostMapping("/create")
    public UserAccount createUserAccount(@RequestBody UserAccount userAccount) {
        return repository.save(userAccount);
    }

    @GetMapping("/get")
    public List<UserAccount> getUserAccount() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public UserAccount updateUserAccount(@RequestBody UserAccount userAccount) {
        if (repository.existsById(userAccount.getId())) {
            repository.deleteById(userAccount.getId());
            return repository.save(userAccount);
        }
        return null;
    }
}
