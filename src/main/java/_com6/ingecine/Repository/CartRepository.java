package _com6.ingecine.Repository;

import _com6.ingecine.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CartRepository extends JpaRepository<Cart, Long>, JpaSpecificationExecutor<Cart> {

}