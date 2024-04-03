package _com6.ingecine.Repository;

import _com6.ingecine.Model.Hour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HourRepository extends JpaRepository<Hour, Long>, JpaSpecificationExecutor<Hour> {

}