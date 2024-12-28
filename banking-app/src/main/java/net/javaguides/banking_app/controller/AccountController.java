package net.javaguides.banking_app.controller;

import net.javaguides.banking_app.Dto.AccountDto;
import net.javaguides.banking_app.service.AccountService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	@Autowired
    private AccountService accountService;

    //Add Account Data
	
    @PostMapping("/")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
    	AccountDto account = accountService.createAccount(accountDto);
        return new ResponseEntity<AccountDto>(account, HttpStatus.CREATED);
    }
    
    @GetMapping("{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
    	     AccountDto accountDto =  accountService.getAccountById(id);
		return ResponseEntity.ok(accountDto);
    	
    }
    
    @PutMapping("/{id}/diposit")
    public ResponseEntity<AccountDto> dipositAmount(@PathVariable Long id, @RequestBody Double amount){
//    	Double amount = request.get("amount");
    	AccountDto accountDto = accountService.Deposit(id, amount);
		return ResponseEntity.ok(accountDto);
    }
    
    @PutMapping("{id}/withdrow")
    public ResponseEntity<AccountDto> withdrowAmount(@PathVariable Long id,@RequestBody double amount){
		AccountDto accountDto = accountService.Withdrow(id, amount);
    	return ResponseEntity.ok(accountDto);
    	
    }
    
    @GetMapping("getallAccounts")
    public ResponseEntity<List<AccountDto>> getallAccounts(){
    	List<AccountDto> accounts = accountService.getAllAccounts();
    	return  ResponseEntity.ok(accounts);
    }
    @DeleteMapping("/{id}/DeleteAccountById")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id){
    	accountService.AccountDeleted(id);
    	return ResponseEntity.ok("Account deleted Sucessfully...!");
    }
}
