package loops;

public class BreakAndContinue {
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		System.out.println("Letters Loop [isolation]");
		for (char c = 'A'; c <= 'D'; c++) {
			System.out.println(c);
		}
		System.out.println("Numbers Loop [isolation]");
		for (int n = 1; n <= 4; n++) {
			System.out.println(n);
		}
		
		System.out.println("Letters & Numbers [nested]");
		for (char c = 'A'; c <= 'D'; c++) {
			for (int n = 1; n <= 4; n++) {
				System.out.println(c + " : " + n);
			}
		}
		
		/*
		 * The keywords 'break' and 'continue' give us more control
		 * over the execution of a looping structure. Break will
		 * allow you to halt the execution of code within the 
		 * closest looping structure in which it is called.
		 * 
		 * Continue will allow you to stop the current cycle of
		 * the closest looping structure in which it is called,
		 * and beging execution of the next cycle.
		 */
		System.out.println("Letters & Numbers [BREAK]");
		for (char c = 'A'; c <= 'D'; c++) {
			for (int n = 1; n <= 4; n++) {
				if (n == 2)
					break;
				
				System.out.println(c + " : " + n);
				System.out.println("INNER LOOP END");
			}
		System.out.println("OUTER LOOP END");
		}
		
		System.out.println("Letters & Numbers [CONTINUE]");
		for (char c = 'A'; c <= 'D'; c++) {
			for (int n = 1; n <= 4; n++) {
				if (n == 2)
					continue;
				
				System.out.println(c + " : " + n);
				System.out.println("INNER LOOP END");
			}
		System.out.println("OUTER LOOP END");
		}
		
		
		System.out.println("Letters & Numbers [LABELS : BREAK]");
		/*
		 * A label is an arbitrary moniker/identifier that you can
		 * place on a looping structure in Java. These are typically
		 * used with nested loops, and provides you with a way to
		 * indicate that you want to apply the logic of a break/continue
		 * statement to a loop other than the closest enclosing one.
		 * 
		 * Syntax:
		 * label : looping structure
		 */
		letters : for (char c = 'A'; c <= 'D'; c++) {
			numbers : for (int n = 1; n <= 4; n++) {
				if (n == 2)
					break letters;
				
				System.out.println(c + " : " + n);
				System.out.println("INNER LOOP END");
			}
		System.out.println("OUTER LOOP END");
		}	
		
		
		System.out.println("Letters & Numbers [LABELS : CONTINUE]");
		letters : for (char c = 'A'; c <= 'D'; c++) {
			numbers : for (int n = 1; n <= 4; n++) {
				if (n == 2)
					continue letters;
				
				System.out.println(c + " : " + n);
				System.out.println("INNER LOOP END");
			}
		System.out.println("OUTER LOOP END");
		}
		System.out.println("::: END OF APPLICATION :::");
	}
}
