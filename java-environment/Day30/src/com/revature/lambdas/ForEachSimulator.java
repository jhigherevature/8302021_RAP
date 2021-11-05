package com.revature.lambdas;

import java.util.ArrayList;
import java.util.List;

public class ForEachSimulator {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Abby");
		names.add("Bobby");
		names.add("Cali");
		
		for(String n : names) {
			System.out.println(n);
		}
		
		/*
		 * The forEach method can be invoked on collections to
		 * perform actions similar to an enhanced for-loop
		 */
		names.forEach( 
				(n) -> {
					System.out.println(n);
					System.out.println(n.toUpperCase());
				}
				);
	}
}
