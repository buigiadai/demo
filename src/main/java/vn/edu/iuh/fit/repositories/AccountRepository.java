package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.models.Account;

public interface  AccountRepository extends JpaRepository<Account,String> {

}
