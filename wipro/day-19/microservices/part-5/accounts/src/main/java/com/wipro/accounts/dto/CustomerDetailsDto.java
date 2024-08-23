package com.wipro.accounts.dto;

import lombok.Data;

@Data
public class CustomerDetailsDto {
	private CustomerDto customer;
	private LoansDto loans;
	private CardsDto cards;
}
