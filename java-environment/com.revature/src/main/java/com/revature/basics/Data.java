package com.revature.basics;

public class Data {
	
	String username;
	String pass;
	
	public boolean checkisOdd(int value) {
		if (value % 2 == 0) {
			return false;
		}
		
		return true;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}
	
	
}
