package _com6.ingecine.Service;

import _com6.ingecine.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    private final TicketRepository repository;

    @Autowired
    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }
}
