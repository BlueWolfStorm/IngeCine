package _com6.ingecine.Controller;

import _com6.ingecine.Model.Admin;
import _com6.ingecine.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/admin")
public class AdminController {
    @Autowired
    private AdminRepository repository;

    public AdminController() {
    }

    public Admin createAdmin(Admin admin) {
        return repository.save(admin);
    }

    public Admin getAdmin(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteAdmin(Long id) {
        repository.deleteById(id);
    }

    public Admin updateAdmin(Admin admin) {
        if (repository.existsById(admin.getId())) {
            repository.deleteById(admin.getId());
            return repository.save(admin);
        }
        return null;
    }
}
