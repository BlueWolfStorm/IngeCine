package _com6.ingecine.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ComboCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Cart cart;

    @ManyToOne
    private Combo combo;

    private int amount;
    private double totalPrice;
}