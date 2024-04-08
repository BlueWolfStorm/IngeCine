package _com6.ingecine.Controller;

import _com6.ingecine.Model.Ticket;
import _com6.ingecine.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ticket")
public class TicketController {
    @Autowired
    private TicketRepository repository;

    public TicketController() {
    }

    public Ticket createTicket(Ticket ticket) {
        return repository.save(ticket);
    }

    public Ticket getTicket(Long id) {
        return repository.getReferenceById(id);
    }

    public void deleteTicket(Long id) {
        repository.deleteById(id);
    }

    public Ticket updateTicket(Ticket ticket) {
        if (repository.existsById(ticket.getId())) {
            repository.deleteById(ticket.getId());
            return repository.save(ticket);
        }
        return null;
    }
}
