package com.revature;

import java.util.ArrayList;
import java.util.List;

public class LookUpService {
	private static final List<String> NAMES = new ArrayList<>();
	
	static {
		System.out.println("Class is loading.");
		NAMES.add("Abby");
		NAMES.add("Betty");
		NAMES.add("Bob");
		NAMES.add("Andy");
		
	}
	
	{
		System.out.println("Initializing object");
	}
	private static LookUpService singleton = new LookUpService(); 
	
	
	private LookUpService() {}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
	}
	
	
	public static LookUpService getSingleton() {
		return singleton; 
	}
	
	public int getName(String name) {
		return NAMES.indexOf(name); 
	}
	
	
}
