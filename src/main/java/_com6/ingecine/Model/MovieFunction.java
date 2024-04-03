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
public class MovieFunction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Movie movie;

    private LocalDate startDate;
    private LocalDate finishDate;

    @OneToMany
    private List<FunctionHallSchedule> scheduleList;
}