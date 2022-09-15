package com.yash.collection_p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortCollectionEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("car");
		list.add("bike");
		list.add("plane");
		list.add("motarcycle");

		System.out.println("Before sorting list: " + list);

		Set<String> s = new TreeSet<>(Arrays.asList("car", "bike", "plane", "motarcycle"));
		System.out.println("After sorting element: ");
		for (String s1 : s) {

			System.out.println(s1);

		}

	}

}
