package _com6.ingecine.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean disableStatus;
    private boolean vipStatus;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String billingInfo;
    private Date creationDate;

    @OneToMany
    private List<Cart> cartList;
}