package com.yash.collection_p9;

import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		Employee z1 = new Employee(201, "shubham", 1000, "Hr", "jalgaon");
		Employee z2 = new Employee(202, "sumit", 2000, "software", "amravti");
		Employee z3 = new Employee(203, "tushar", 2300, "IT4", "mumbai");
		Employee z4 = new Employee(204, "akash", 5000, "Admin", "pune");
		Employee z5 = new Employee(205, "raju", 4000, "It1", "mumbai");
		Employee z6 = new Employee(206, "ram", 10000, "It2", "jalgaon");
		Employee z7 = new Employee(207, "sham", 17990, "It3", "mumbai");
		Employee z8 = new Employee(208, "lavish", 12000, "Admin", "mumbai");
		Employee z9 = new Employee(209, "ramdev", 7000, "It", "mumbai");
		Employee z10 = new Employee(210, "sahdev", 8400, "software", "pune");

		Set<Employee> list = new HashSet<>();
		list.add(z1);
		list.add(z2);
		list.add(z3);
		list.add(z4);
		list.add(z5);
		list.add(z6);
		list.add(z7);
		list.add(z8);
		list.add(z9);
		list.add(z10);

		for (Employee z : list) {
			System.out.println(z);
		}
	}
}