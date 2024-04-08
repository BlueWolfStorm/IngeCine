package _com6.ingecine.Controller;

import _com6.ingecine.Model.UserAccount;
import _com6.ingecine.Repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/userAccount")
public class UserAccountController {
    @Autowired
    private UserAccountRepository repository;

    public UserAccountController() {
    }

    public UserAccount createUserAccount(UserAccount userAccount) {
        return repository.save(userAccount);
    }

    public UserAccount getUserAccount(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteUserAccount(Long id) {
        repository.deleteById(id);
    }

    public UserAccount updateUserAccount(UserAccount userAccount) {
        if (repository.existsById(userAccount.getId())) {
            repository.deleteById(userAccount.getId());
            return repository.save(userAccount);
        }
        return null;
    }
}
