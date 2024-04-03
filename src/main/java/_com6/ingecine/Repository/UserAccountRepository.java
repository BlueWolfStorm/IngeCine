package _com6.ingecine.Repository;

import _com6.ingecine.Model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long>, JpaSpecificationExecutor<UserAccount> {

}