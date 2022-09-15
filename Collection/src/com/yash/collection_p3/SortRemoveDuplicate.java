package com.yash.collection_p3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortRemoveDuplicate 
{

	public static void main(String[] args)
	{
	
		List l=new ArrayList();
		l.add(10);
		l.add(3);
		l.add(10);
		l.add(4);
		l.add(1);
		l.add(5);
		l.add(4);
		l.add(4);
		l.add(6);
		
		System.out.println("List is : " +l);
		
		Set s=new HashSet(l);
		System.out.println("After Removing Duplicate is : " +s);
		
		
		
	}
}
