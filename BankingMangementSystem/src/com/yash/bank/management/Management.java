package com.yash.bank.management;

import java.util.Scanner;

import com.yash.bank.BankServise.BankService;
import com.yash.bank.BankServiseImpl.BankServiceImpl;

public class Management {

	public static void main(String[] args) {
		BankService service=new BankServiceImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("__________________________________________\n");
		System.out.println("         WELCOME TO SBI BANK         ");
		System.out.println("__________________________________________\n");
		while(true){
		System.out.println("---------------------------------------\n");
		System.out.println("\t Press 1 For Create Customer Account");
		System.out.println("\t Press 2 For Display Customer All Details ");
		System.out.println("\t Press 3 For Deposite Money");
		System.out.println("\t Press 4 For Withdraw Money");
		System.out.println("\t Press 5 For Check Available Balance ");
		System.out.println("\t Press 0 For Exit \n");
		System.out.println("---------------------------------------");
		
		double n=sc.nextDouble();
		
		if(n==1){
			service.createAccount();
		}
		else if(n==2){
			service.displayAllDetails();
		}
		
		else if(n==3){
			service.depositeMoney();
		}
		else if(n==4){
			service.withdrawal();
		}
		else if(n==5){
			service.balanceCheck();
		}
		else if(n>5){
			System.out.println("      Invalid Option \n"
					        +"    Enter valid Option     \n");
		}
		else{
			
			System.exit(0);
		}
		
		}		
		}


}
