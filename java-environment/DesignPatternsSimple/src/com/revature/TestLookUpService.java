package com.revature;

public class TestLookUpService {
	 public static void main(String[] args) {
		LookUpService ls = LookUpService.getSingleton(); 
		
		int index = ls.getName("Bob");
		
		System.out.println("Abby was found at " +index);
	}
}
