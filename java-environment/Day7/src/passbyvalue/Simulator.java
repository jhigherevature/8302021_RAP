package passbyvalue;

/*
 * In programming there are (generally speaking) two ways that we
 * can pass information into a method/function. Those are:
 * 
 * pass-by-value : You provide that information/data that a variable
 * is holding onto/referencing, but NOT the variable itself
 * 
 * pass-by-reference : You provide a direct reference to a variable
 * when using it as an argument to a method/function
 * 
 * Java is strictly a pass-by-value language. BUT the 'value' of a
 * variable depends on the type of variable itself...remember we have
 * primitive and reference variables.
 */
public class Simulator {
	public static void main(String[] args) {
		int x = 10;
		modify(x);
		System.out.println(x); // 10
		
		Data d = new Data(10);
		System.out.println(d.value); // 10
		modify(d);
		System.out.println(d.value); // 25
		
		Integer i = 15;
		modifyWrapper(i);
		System.out.println(i);
	}
	
	/*
	 * Because of unboxing (and autoboxing) when looking at
	 * 'pass-by-value' vs 'pass-by-reference' with respect to
	 * wrappers, they act more similar to primitive variables
	 * than they do to Objects.
	 */
	public static Integer modifyWrapper(Integer i) {
		i = 100;
		return i;
	}
	
	/*
	 * A scope is an isolated level within our programs. When
	 * you create a variable within a scope, it is only accessible
	 * within that scope. Below, even though we use the variable
	 * name 'x' for our modify method's parameter, this is NOT
	 * the same variable as the variable 'x' within our main method
	 * above. There are two variables named x that we used in our
	 * program.
	 */
	public static int modify(int x) {
		x = x + 5;
		return x;
	}
	public static Data modify(Data other) {
		other.value = 25;
		return other;
	}
}
