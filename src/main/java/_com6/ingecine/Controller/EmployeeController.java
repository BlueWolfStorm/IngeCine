package _com6.ingecine.Controller;

import _com6.ingecine.Model.Employee;
import _com6.ingecine.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeController() {
    }

    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Employee getEmployee(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    public Employee updateEmployee(Employee employee) {
        if (repository.existsById(employee.getId())) {
            repository.deleteById(employee.getId());
            return repository.save(employee);
        }
        return null;
    }
}
