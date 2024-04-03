package _com6.ingecine.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UserAccount user;

    @OneToMany
    private List<Ticket> ticketList;

    @OneToMany
    private List<ProductCart> productList;

    @OneToMany
    private List<ComboCart> comboList;

    private double totalPrice;
    private LocalDateTime creationDate;
}