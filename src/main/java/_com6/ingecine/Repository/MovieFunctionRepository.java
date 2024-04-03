package _com6.ingecine.Repository;

import _com6.ingecine.Model.MovieFunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MovieFunctionRepository extends JpaRepository<MovieFunction, Long>, JpaSpecificationExecutor<MovieFunction> {

}