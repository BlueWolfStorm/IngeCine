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
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;
    private String title;
    private String director;
    private LocalDate releaseYear;

    @ManyToOne
    private Genre genre;

    private int duration;
    private String synopsis;

    @ManyToMany
    private List<CastActor> cast;

    private String studio;
}
