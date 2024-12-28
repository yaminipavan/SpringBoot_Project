package net.javaguides.banking_app.mapper;

import net.javaguides.banking_app.Dto.AccountDto;
import net.javaguides.banking_app.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
		Account account = new Account(accountDto.id(), accountDto.accountHolderName(), accountDto.balance());
		return account;
    }

    public static AccountDto mapTOAccountDto(Account account){
       AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
       return accountDto;
    }

}
