package _com6.ingecine.Service;

import _com6.ingecine.Repository.FunctionHallScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FunctionHallScheduleService {
    private final FunctionHallScheduleRepository repository;

    @Autowired
    public FunctionHallScheduleService(FunctionHallScheduleRepository repository) {
        this.repository = repository;
    }
}
