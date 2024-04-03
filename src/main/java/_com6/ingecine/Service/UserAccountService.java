package _com6.ingecine.Service;

import _com6.ingecine.Repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {
    private final UserAccountRepository repository;

    @Autowired
    public UserAccountService(UserAccountRepository repository) {
        this.repository = repository;
    }
}
