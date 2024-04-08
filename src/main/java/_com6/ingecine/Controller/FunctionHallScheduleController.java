package _com6.ingecine.Controller;

import _com6.ingecine.Model.FunctionHallSchedule;
import _com6.ingecine.Repository.FunctionHallScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/functionHallSchedule")
public class FunctionHallScheduleController {
    @Autowired
    private FunctionHallScheduleRepository repository;

    public FunctionHallScheduleController() {
    }

    @PostMapping("/create")
    public FunctionHallSchedule createFunctionHallSchedule(@RequestBody FunctionHallSchedule functionHallSchedule) {
        return repository.save(functionHallSchedule);
    }

    @GetMapping("/get")
    public List<FunctionHallSchedule> getFunctionHallSchedule() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public FunctionHallSchedule updateFunctionHallSchedule(@RequestBody FunctionHallSchedule functionHallSchedule) {
        if (repository.existsById(functionHallSchedule.getId())) {
            repository.deleteById(functionHallSchedule.getId());
            return repository.save(functionHallSchedule);
        }
        return null;
    }
}
