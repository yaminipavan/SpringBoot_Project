package net.javaguides.banking_app.service;

import java.util.List;
import net.javaguides.banking_app.Dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto accountDto);
	
	AccountDto getAccountById(Long id);
	
	AccountDto Deposit(Long id,double amount);
	
	AccountDto Withdrow(Long id,double amount);
	
	List<AccountDto> getAllAccounts();
	
	void AccountDeleted(Long id);
}
