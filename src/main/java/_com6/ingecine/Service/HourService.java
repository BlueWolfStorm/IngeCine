package _com6.ingecine.Service;

import _com6.ingecine.Repository.HourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HourService {
    private final HourRepository repository;

    @Autowired
    public HourService(HourRepository repository) {
        this.repository = repository;
    }
}
