package _com6.ingecine.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private HallChair chair;

    @ManyToOne
    private FunctionHallSchedule functionHallSchedule;

    private LocalDateTime usageDate;
    private LocalDateTime creationDate;
    private double price;

    @ManyToOne
    private UserAccount user;

    @ManyToOne
    private Cart cart;
}