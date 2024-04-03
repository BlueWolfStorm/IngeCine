package _com6.ingecine.Service;

import _com6.ingecine.Model.HallChair;
import _com6.ingecine.Repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HallService {
    private final HallRepository repository;

    @Autowired
    public HallService(HallRepository repository) {
        this.repository = repository;
    }

    public boolean addHallChair(HallChair chair) {
        // TODO: Implement the functionality to add a new hall chair. This function should return true if the hall chair was added successfully, false otherwise.
        return false;
    }

    public boolean removeHallChair(HallChair chair) {
        // TODO: Implement the functionality to remove an existing hall chair. This function should return true if the hall chair was removed successfully, false otherwise.
        return false;
    }
}
