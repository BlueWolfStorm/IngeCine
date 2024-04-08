package _com6.ingecine.Controller;

import _com6.ingecine.Model.Ticket;
import _com6.ingecine.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/ticket")
public class TicketController {
    @Autowired
    private TicketRepository repository;

    public TicketController() {
    }

    @PostMapping("/create")
    public Ticket createTicket(Ticket ticket) {
        return repository.save(ticket);
    }

    @GetMapping("/get")
    public Ticket getTicket(Long id) {
        return repository.getReferenceById(id);
    }

    @DeleteMapping("/delete")
    public void deleteTicket(Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Ticket updateTicket(Ticket ticket) {
        if (repository.existsById(ticket.getId())) {
            repository.deleteById(ticket.getId());
            return repository.save(ticket);
        }
        return null;
    }
}
