package _com6.ingecine.Service;

import _com6.ingecine.Repository.HallChairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HallChairService {
    private final HallChairRepository repository;

    @Autowired
    public HallChairService(HallChairRepository repository) {
        this.repository = repository;
    }
}
