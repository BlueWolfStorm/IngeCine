package _com6.ingecine.Controller;

import _com6.ingecine.Model.Admin;
import _com6.ingecine.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminRepository repository;

    public AdminController() {
    }

    @PostMapping("/create")
    public Admin createAdmin(@RequestBody Admin admin) {
        return repository.save(admin);
    }

    @GetMapping("/get")
    public List<Admin> getAdmin() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Admin updateAdmin(@RequestBody Admin admin) {
        if (repository.existsById(admin.getId())) {
            repository.deleteById(admin.getId());
            return repository.save(admin);
        }
        return null;
    }
}
