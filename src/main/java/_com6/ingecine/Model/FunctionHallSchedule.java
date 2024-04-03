package _com6.ingecine.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FunctionHallSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MovieFunction movieFunction;

    @ManyToOne
    private Hall hall;

    private LocalDate startDate;
    private LocalDate finishDate;

    @ManyToMany
    private List<Hour> hoursList;
}