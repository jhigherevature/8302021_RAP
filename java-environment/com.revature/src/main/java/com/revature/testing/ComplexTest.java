package com.revature.testing;

public class ComplexTest {
	public Data d;
	
	public String performComplexCheck(int value) {
		if (value > 10)
			return "Greater than 10";
		else if (d.checkisOdd(value)) {
			return "Number is odd";
		} else if (value < 100){
			return "Still less than 100";
		} else {
			return "Some other number";
		}
	}
}
