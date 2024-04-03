package _com6.ingecine.Repository;

import _com6.ingecine.Model.ProductCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductCartRepository extends JpaRepository<ProductCart, Long>, JpaSpecificationExecutor<ProductCart> {

}