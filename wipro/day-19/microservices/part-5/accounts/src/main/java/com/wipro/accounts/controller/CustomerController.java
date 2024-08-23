package com.wipro.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.accounts.dto.AccountsContactInfoDto;
import com.wipro.accounts.dto.CardsDto;
import com.wipro.accounts.dto.CustomerDetailsDto;
import com.wipro.accounts.dto.CustomerDto;
import com.wipro.accounts.dto.LoansDto;
import com.wipro.accounts.service.IAccountsService;
import com.wipro.accounts.service.client.CardsFeignClient;
import com.wipro.accounts.service.client.LoansFeignClient;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class CustomerController {
	private IAccountsService accountService;
	private CardsFeignClient cardsClient;
	private LoansFeignClient loansClient;
	
    @GetMapping("/fetchCustomerDetails")
    public ResponseEntity<CustomerDetailsDto> fetchCustomerDetails(@RequestParam @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits") String mobileNumber){
        CustomerDto customer = accountService.fetchAccount(mobileNumber);
        CardsDto card = cardsClient.fetchCardDetails(mobileNumber).getBody();
        LoansDto loan = loansClient.fetchLoanDetails(mobileNumber).getBody();
        
        CustomerDetailsDto customerDetails = new CustomerDetailsDto();
        customerDetails.setCustomer(customer);
        customerDetails.setCards(card);
        customerDetails.setLoans(loan);
        
    	return new ResponseEntity<>(customerDetails, HttpStatus.OK);
    }
    
    @Autowired
    private AccountsContactInfoDto accountsContactInfoDto;
    
    @GetMapping("/contact-info")
    public ResponseEntity<AccountsContactInfoDto> getContactInfo(){
    	return ResponseEntity.status(HttpStatus.OK).body(accountsContactInfoDto);
    }
    
}
