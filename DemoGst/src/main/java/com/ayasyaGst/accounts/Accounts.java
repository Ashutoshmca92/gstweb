package com.ayasyaGst.accounts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="accounts_details")
public class Accounts {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	//Bil-By-Bil Details
	private String bilDetails;
	
	//credit limits
	private String creditLimits;
	
	//Targets
	private String targets;
	
	//cost center
	private String costCenters;
	
	//Accounts wise interest rate
	private String accountInterestRate;
	
	
	//ledger Reconciliation
	private String ledgerReconciliation;
	
	//show accounts current balance during vouchers entry
	private double accountsCurrentBalance;
	
	//Balance Sheet Stock Updation 
	private String balanceSheet;
	
	//show party dash board after selecting party in Vouchers;
	private String dashBoardVouchers;
	
	//single entry system for payments & receipt vouchers
	private String singleEntryPaymentsVouchers;
	
	//posting in accounts Through sales return and purchase return;
	private String  salesPurchaseReturn;
	
	
	

}
