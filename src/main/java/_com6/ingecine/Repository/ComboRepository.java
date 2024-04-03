package _com6.ingecine.Repository;

import _com6.ingecine.Model.Combo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ComboRepository extends JpaRepository<Combo, Long>, JpaSpecificationExecutor<Combo> {

}