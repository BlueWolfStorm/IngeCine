package _com6.ingecine.Repository;

import _com6.ingecine.Model.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HallRepository extends JpaRepository<Hall, Long>, JpaSpecificationExecutor<Hall> {

}