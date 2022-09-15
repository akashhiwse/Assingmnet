package com.yash.bank.BankServiseImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.DropMode;

import com.yash.bank.BankServise.BankService;
import com.yash.bank.model.Customer;

public class BankServiceImpl implements BankService {

	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);

	Customer customer=new Customer();
	Map map = new HashMap<>();
	
	public void createAccount() 
	{   
		System.out.println("Add Customer Account No");
		customer.setCustomerAccountNo(sc.nextInt());
		
		System.out.println("Add Account Holder Name");
		String s=sc.next() +sc.nextLine();
		customer.setCustomerName(s);
		
		System.out.println("Add Customer Mobile Number ");
		customer.setCustomerMobileNo(sc.nextLong());
		
		System.out.println("Add Customer Aadharcard Number");
		customer.setCustomerAdharNo(sc.nextLong());
		
		System.out.println("Add Customer Gender");
		customer.setCustomerGender(sc.next());
		
		System.out.println("Add Customer Age");
		customer.setCustomerAge(sc.nextInt());
		
		System.out.println("Add Customer Correspondance Address");
		customer.setCustomerCorrespondenceAddress(sc.nextLine());
		
		System.out.println("Add Customer Permanent Address");
		customer.setCustomerPermanentAddress(sc1.nextLine());
		
		System.out.println("Add Customer Balance");
		double d=sc.nextDouble();
		customer.setCustomerBalance(d);
        
		while(d < 500)
		{
			System.out.println("___________________________________________________\n");
			System.out.println("!! SORRY !! <<--- Credit Amount Above 500    -->>");
			System.out.println("___________________________________________________\n");
			d=sc.nextDouble();
		}
		
		System.out.println("___________________________________________________\n");
		System.out.println("!!-------Your Account has been created succesufully-------!!\n");
		System.out.println("___________________________________________________\n");
		
		customer.setCustomerBalance(d);
				
	}
	
	public void displayAllDetails() 
	{
		if(customer.getCustomerAge() == 0){
			System.out.println("\t SORRY____Please Create Account Frist");
		}
		else{
			
		System.out.println("Customer Account Number is       "+ customer.getCustomerAccountNo());
		System.out.println("Customer Account Holder Name is  "+ customer.getCustomerName());
		System.out.println("Customer Mobile Number is        " + customer.getCustomerMobileNo());
		System.out.println("Customer Aadharcard Number is    " + customer.getCustomerAdharNo());
		System.out.println("Customer Gender is               " + customer.getCustomerGender());
		System.out.println("Customer Age is                  " + customer.getCustomerAge());
		System.out.println("Customer Available Balance is    "+ customer.getCustomerBalance());
		System.out.println("Customer Permanent Address is    "+ customer.getCustomerPermanentAddress());
		System.out.println("Customer Correspondence Address is "+ customer.getCustomerCorrespondenceAddress());
		
		}
	}
	
	public void depositeMoney() 
	{
	 	if(customer.getCustomerAge() == 0){
			System.out.println("\t SORRY____Please Create Account Frist");
		}
	 	else{
	 		double oldbalance=customer.getCustomerBalance();
	 		
	 		System.out.println("Enter Diposit Amount");
	 		
	 		double newbalance=sc.nextDouble();
	 		
	 		
	 		while(newbalance < 500){
	 			System.out.println("\t SORRY____Please Deposite Above 500 Ruprss ");
	 			newbalance=sc.nextDouble();
	 		}
	 		if(newbalance>500) {
	 			
	 			newbalance =newbalance +oldbalance;
	 			customer.setCustomerBalance(newbalance);
	 			System.out.println("Diposited succesfully balance is   "+ customer.getCustomerBalance());
	 			
	 		}	 	
	 	}
	 	
	 }	
	
	
	
	public void withdrawal() {
	 
		if(customer.getCustomerAge()==0){
			System.out.println("\t SORRY____Please Create Account Frist");
		}
	 	else if(customer.getCustomerBalance()>0){
	
	 		double oldbalance=customer.getCustomerBalance();
	 		System.out.println("Enter Withdrawal Amount");
	 		double newbalance=sc.nextDouble();
	 		
	 		while(newbalance<500){
	 		
	 			System.out.println("\t SORRY____Please Withdrawal Above 500 Ruprss ");
	 			newbalance=sc.nextDouble();
	 		}
	 		if(newbalance>500){
	 		
	 			newbalance= oldbalance-newbalance;
	 			customer.setCustomerBalance(newbalance);
	 			System.out.println(" Withdrawal succesfully balance is   "+customer.getCustomerBalance());
	 	    }
	    }
	}
	
	public void balanceCheck() {

		if(customer.getCustomerAge() == 0){
			System.out.println("\t SORRY____Please Create Account Frist");
		}
	 	else{
		System.out.println("Current Balance is " +customer.getCustomerBalance() );
	 	}
	}


}
