package overloading;

public class OverloadingPref {
	public static void main(String[] args) {	
		method(1);
		method(1.0f);
	}
	
	public static void method(int i) {
		System.out.println("int primitive");
	}
	
	public static void method(float f) {
		System.out.println("float primitive");
	}
	
	public static void method(int... varargs) {
		System.out.println("Var args...");
	}
}
