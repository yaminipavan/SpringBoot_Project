package net.javaguides.banking_app.repository;

import net.javaguides.banking_app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository  extends JpaRepository<Account,Long> {
}
