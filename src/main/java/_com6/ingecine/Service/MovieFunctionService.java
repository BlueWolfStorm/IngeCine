package _com6.ingecine.Service;

import _com6.ingecine.Model.FunctionHallSchedule;
import _com6.ingecine.Repository.MovieFunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieFunctionService {
    private final MovieFunctionRepository repository;

    @Autowired
    public MovieFunctionService(MovieFunctionRepository repository) {
        this.repository = repository;
    }

    public boolean addSchedule(FunctionHallSchedule schedule) {
        // TODO: Implement the functionality to add a new schedule. This function should return true if the schedule was added successfully, false otherwise.
        return false;
    }

    public boolean removeSchedule(FunctionHallSchedule schedule) {
        // TODO: Implement the functionality to remove an existing schedule. This function should return true if the schedule was removed successfully, false otherwise.
        return false;
    }
}
