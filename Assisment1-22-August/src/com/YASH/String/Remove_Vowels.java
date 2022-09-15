package com.YASH.String;

import java.util.Iterator;

public class Remove_Vowels
{
public static void main(String[] args) {
	String str="yashTechnologies";
	char[] a=str.toCharArray();
	for (int i = 0; i < a.length; i++) {
		if (a[i]=='a' || a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u') {
			
			continue;
			
		}
		System.out.println(a[i]);
		
	}
}
}
