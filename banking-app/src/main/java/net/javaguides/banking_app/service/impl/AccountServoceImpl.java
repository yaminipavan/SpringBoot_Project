package net.javaguides.banking_app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.banking_app.Dto.AccountDto;
import net.javaguides.banking_app.entity.Account;
import net.javaguides.banking_app.mapper.AccountMapper;
import net.javaguides.banking_app.repository.AccountRepository;
import net.javaguides.banking_app.service.AccountService;

@Service
public class AccountServoceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapTOAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccountById(Long id) {
		Account account = accountRepository
				.findById(id)
				.orElseThrow(() -> new RuntimeException("Account is not exists " + id));
		return AccountMapper.mapTOAccountDto(account);
	}

	@Override
	public AccountDto Deposit(Long id, double amount) {
		// TODO Auto-generated method stub
		Account account = accountRepository
				.findById(id)
				.orElseThrow(() -> new RuntimeException("Account is not exists " + id));
		double total = account.getBalance() + amount;
		account.setBalance(total);
		Account account2 = accountRepository.save(account);
		return AccountMapper.mapTOAccountDto(account2);
	}

	@Override
	public AccountDto Withdrow(Long id, double amount) {
		Account account = accountRepository
				.findById(id)
				.orElseThrow(() -> new RuntimeException("Account is not exists " + id));
		double balence = account.getBalance()-amount;
		account.setBalance(balence);
		Account account2 = accountRepository.save(account);
		return AccountMapper.mapTOAccountDto(account2);
	}

	@Override
	public List<AccountDto> getAllAccounts() {
		List<Account> accounts = accountRepository.findAll();
		return accounts.stream().map((account) -> AccountMapper.mapTOAccountDto(account))
				.collect(Collectors.toList());
	}

	@Override
	public void AccountDeleted(Long id) {
		 accountRepository
				.findById(id)
				.orElseThrow(() -> new RuntimeException("Account is not exists " + id));
		accountRepository.deleteById(id);
		
	}
}
