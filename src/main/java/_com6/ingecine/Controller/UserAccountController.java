package _com6.ingecine.Controller;

import _com6.ingecine.Model.UserAccount;
import _com6.ingecine.Repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/userAccount")
public class UserAccountController {
    @Autowired
    private UserAccountRepository repository;

    public UserAccountController() {
    }

    @PostMapping("/create")
    public UserAccount createUserAccount(UserAccount userAccount) {
        return repository.save(userAccount);
    }

    @GetMapping("/get")
    public UserAccount getUserAccount(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteUserAccount(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public UserAccount updateUserAccount(UserAccount userAccount) {
        if (repository.existsById(userAccount.getId())) {
            repository.deleteById(userAccount.getId());
            return repository.save(userAccount);
        }
        return null;
    }
}
