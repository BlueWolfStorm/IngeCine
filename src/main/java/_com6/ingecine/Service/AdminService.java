package _com6.ingecine.Service;

import _com6.ingecine.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository repository;

    @Autowired
    public AdminService(AdminRepository repository) {
        this.repository = repository;
    }
}
