package _com6.ingecine.Controller;

import _com6.ingecine.Model.FunctionHallSchedule;
import _com6.ingecine.Repository.FunctionHallScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/functionHallSchedule")
public class FunctionHallScheduleController {
    @Autowired
    private FunctionHallScheduleRepository repository;

    public FunctionHallScheduleController() {
    }

    public FunctionHallSchedule createFunctionHallSchedule(FunctionHallSchedule functionHallSchedule) {
        return repository.save(functionHallSchedule);
    }

    public FunctionHallSchedule getFunctionHallSchedule(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteFunctionHallSchedule(Long id) {
        repository.deleteById(id);
    }

    public FunctionHallSchedule updateFunctionHallSchedule(FunctionHallSchedule functionHallSchedule) {
        if (repository.existsById(functionHallSchedule.getId())) {
            repository.deleteById(functionHallSchedule.getId());
            return repository.save(functionHallSchedule);
        }
        return null;
    }
}
