package _com6.ingecine.Service;

import _com6.ingecine.Model.Hall;
import _com6.ingecine.Model.Hour;
import _com6.ingecine.Model.MovieFunction;
import _com6.ingecine.Repository.FunctionHallScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionHallScheduleService {
    private final FunctionHallScheduleRepository repository;

    @Autowired
    public FunctionHallScheduleService(FunctionHallScheduleRepository repository) {
        this.repository = repository;
    }

    public boolean addMovieFunction(MovieFunction movieFunction) {
        // TODO: Implement the functionality to add a new movie function. This function should return true if the movie function was added successfully, false otherwise.
        return false;
    }

    public boolean removeMovieFunction(MovieFunction movieFunction) {
        // TODO: Implement the functionality to remove an existing movie function. This function should return true if the movie function was removed successfully, false otherwise.
        return false;
    }

    public boolean setHall(Hall hall) {
        // TODO: Implement the functionality to set a hall. This function should return true if the hall was set successfully, false otherwise.
        return false;
    }

    public boolean removeHall(Hall hall) {
        // TODO: Implement the functionality to remove a hall. This function should return true if the hall was removed successfully, false otherwise.
        return false;
    }

    public boolean getHoursList(List<Hour> listHours) {
        // TODO: Implement the functionality to get a list of hours. This function should return true if the list was retrieved successfully, false otherwise.
        return false;
    }
}
