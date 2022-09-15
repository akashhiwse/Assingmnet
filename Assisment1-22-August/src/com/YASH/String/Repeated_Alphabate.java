package com.YASH.String;

public class Repeated_Alphabate 
{
public static void main(String[] args)
{
			
String str="yashTechnology";	
char[] ch= str.toCharArray();

for(int i=0; i<ch.length; i++)
 {
	for(int j=i+1; j<ch.length;j++)
	{
		if(ch[i]==ch[j])
		{
			System.out.println(ch[j]);
		}
	}
 }
}
}

