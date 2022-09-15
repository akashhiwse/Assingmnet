package com.yash.bank.model;

public class Customer{

	private int customerId;
	private String customerName;
	private String customerGender;
	private int customerAge;
	private long customerAdharNo;
	private String customerPanNo;
    private String customerEmail;
	private long customerMobileNo;
    private String customerCorrespondenceAddress;
    private String customerPermanentAddress;
    private long customerAccountNo;
    private double customerBalance;
    private Bank bank;
	
    public Customer() {
		super();
	}
    
    
	public long getCustomerAccountNo() {
		return customerAccountNo;
	}


	public void setCustomerAccountNo(long customerAccountNo) {
		this.customerAccountNo = customerAccountNo;
	}


	public double getCustomerBalance() {
		return customerBalance;
	}


	public void setCustomerBalance(double customerBalance) {
		this.customerBalance = customerBalance;
	}


	public String getCustomerGender() {
		return customerGender;
	}


	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}


	public void setBank(Bank bank) {
		this.bank = bank;
	}


	public Bank getBank() {
		return bank;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public long getCustomerAdharNo() {
		return customerAdharNo;
	}

	public void setCustomerAdharNo(long customerAdharNo) {
		this.customerAdharNo = customerAdharNo;
	}

	public String getCustomerPanNo() {
		return customerPanNo;
	}

	public void setCustomerPanNo(String customerPanNo) {
		this.customerPanNo = customerPanNo;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public long getCustomerMobileNo() {
		return customerMobileNo;
	}

	public void setCustomerMobileNo(long customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getCustomerCorrespondenceAddress() {
		return customerCorrespondenceAddress;
	}

	public void setCustomerCorrespondenceAddress(String customerCorrespondenceAddress) {
		this.customerCorrespondenceAddress = customerCorrespondenceAddress;
	}

	public String getCustomerPermanentAddress() {
		return customerPermanentAddress;
	}

	public void setCustomerPermanentAddress(String customerPermanentAddress) {
		this.customerPermanentAddress = customerPermanentAddress;
	}
       
}
