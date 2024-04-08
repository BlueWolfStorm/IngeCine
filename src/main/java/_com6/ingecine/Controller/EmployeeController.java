package _com6.ingecine.Controller;

import _com6.ingecine.Model.Employee;
import _com6.ingecine.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeController() {
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @GetMapping("/get")
    public List<Employee> getEmployee() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        if (repository.existsById(employee.getId())) {
            repository.deleteById(employee.getId());
            return repository.save(employee);
        }
        return null;
    }
}
