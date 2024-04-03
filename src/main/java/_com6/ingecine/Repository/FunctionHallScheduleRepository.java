package _com6.ingecine.Repository;

import _com6.ingecine.Model.FunctionHallSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FunctionHallScheduleRepository extends JpaRepository<FunctionHallSchedule, Long>, JpaSpecificationExecutor<FunctionHallSchedule> {

}