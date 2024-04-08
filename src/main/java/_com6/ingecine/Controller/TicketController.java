package _com6.ingecine.Controller;

import _com6.ingecine.Model.Ticket;
import _com6.ingecine.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketRepository repository;

    public TicketController() {
    }

    @PostMapping("/create")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return repository.save(ticket);
    }

    @GetMapping("/get")
    public List<Ticket> getTicket() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PostMapping("/update")
    public Ticket updateTicket(@RequestBody Ticket ticket) {
        if (repository.existsById(ticket.getId())) {
            repository.deleteById(ticket.getId());
            return repository.save(ticket);
        }
        return null;
    }
}
