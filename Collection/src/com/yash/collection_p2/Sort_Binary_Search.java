package com.yash.collection_p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Binary_Search {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(10);
		al.add(20);
		System.out.println("List is :- "+al);
		
		int index = Collections.binarySearch(al, 10);
		System.out.println("Index of 10 is : "+index);

		
	}
}
