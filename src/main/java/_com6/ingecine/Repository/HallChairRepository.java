package _com6.ingecine.Repository;

import _com6.ingecine.Model.HallChair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HallChairRepository extends JpaRepository<HallChair, Long>, JpaSpecificationExecutor<HallChair> {

}