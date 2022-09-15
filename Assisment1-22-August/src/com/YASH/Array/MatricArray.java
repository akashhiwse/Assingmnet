package com.YASH.Array;

import java.util.Scanner;

public class MatricArray {
//static	int arr[][];
//static int a,b;
	
	public static void main(String[] args) {
		
		//int a=0,b=0;
		
		System.out.println("Enter the order of matrix:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				 arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("----------");
		for(int a=0;a==0||a==n-1;a++)
		{
			for(int b=0;b==0||b==n-1;b++)
			{
				System.out.println(arr[a][b]+"  ");
				//b++;
			}
			System.out.println();
			//a++;
		}
	}

}
