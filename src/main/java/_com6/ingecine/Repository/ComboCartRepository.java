package _com6.ingecine.Repository;

import _com6.ingecine.Model.ComboCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ComboCartRepository extends JpaRepository<ComboCart, Long>, JpaSpecificationExecutor<ComboCart> {

}