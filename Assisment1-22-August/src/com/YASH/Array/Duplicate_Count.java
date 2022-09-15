package com.YASH.Array;

public class Duplicate_Count {

	public static void main(String[] args) {
		int[] numArr = { 2, 3, 5, 3, 5, 6, 5 };

		for (int i = 0; i < numArr.length; i++) {
			int counter = 1;
			for (int j = 0; j < numArr.length; j++) {
				if (i == j) 
				{
					break;
				}
				if (numArr[i] == numArr[j]) {
					counter++;
				}
			}
			if (counter > 1)
				System.out.println("for numArr[" + i + "]=" + numArr[i] + " count= " + counter);
		}
	}
}
