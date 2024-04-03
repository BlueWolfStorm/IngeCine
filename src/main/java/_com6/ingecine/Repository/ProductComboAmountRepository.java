package _com6.ingecine.Repository;

import _com6.ingecine.Model.ProductComboAmount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductComboAmountRepository extends JpaRepository<ProductComboAmount, Long>, JpaSpecificationExecutor<ProductComboAmount> {

}