package _com6.ingecine.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HallChair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Hall hall;

    private Long columnHall;
    private char rowHall;
    private Boolean isVip;
    private Boolean isOccupied;
    private Boolean isDamaged;
    private double chairPrice;
    private double vipChairPrice;
}