package _com6.ingecine.Repository;

import _com6.ingecine.Model.CastActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CastActorRepository extends JpaRepository<CastActor, Long>, JpaSpecificationExecutor<CastActor> {

}