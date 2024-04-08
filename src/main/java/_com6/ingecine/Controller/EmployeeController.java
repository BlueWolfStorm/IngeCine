package _com6.ingecine.Controller;

import _com6.ingecine.Model.Employee;
import _com6.ingecine.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeController() {
    }

    @PostMapping("/create")
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    @GetMapping("/get")
    public Employee getEmployee(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Employee updateEmployee(Employee employee) {
        if (repository.existsById(employee.getId())) {
            repository.deleteById(employee.getId());
            return repository.save(employee);
        }
        return null;
    }
}
