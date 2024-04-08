package _com6.ingecine.Controller;

import _com6.ingecine.Model.Admin;
import _com6.ingecine.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/admin")
public class AdminController {
    @Autowired
    private AdminRepository repository;

    public AdminController() {
    }

    @PostMapping("/create")
    public Admin createAdmin(Admin admin) {
        return repository.save(admin);
    }

    @GetMapping("/get")
    public Admin getAdmin(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteAdmin(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Admin updateAdmin(Admin admin) {
        if (repository.existsById(admin.getId())) {
            repository.deleteById(admin.getId());
            return repository.save(admin);
        }
        return null;
    }
}
