package com.yash.exception_p4;

import java.util.Scanner;

public class A {

	public static void main(String[] args) throws ItemPurchaseLimitExceed {
		System.out.println("----------------Welcome To m-Mart-------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Customer");
		int size = sc.nextInt();

		for (int i = 0; i <= size; i++) {
			Item item = new Item();
			Category category = new Category();

			System.out.println("Please Enter catogory:- ");
			sc.nextLine();
			String catname = sc.next();

			System.out.println("Enter Item Name:- ");
			String itemname = sc.next();
			System.out.println("Enter price:- ");
			float price = sc.nextFloat();
			System.out.println("Enter the Item Quantity:- ");
			int itqut = sc.nextInt();

			ItemBought ib = new ItemBought();
			ib.setItemid(i);
			sc.nextLine();

		}

	}

}
