package com.revature.threads.problems;

public class DeadlockSimulator {
	public static void main(String[] args) {
		DeadlockObject dObj = new DeadlockObject();

		for (int i = 0; i < 5; i++) {
			System.out.println("For loop iteration: " + i);
			Runnable r1 = () -> {
				dObj.func1();
			};
			Thread t1 = new Thread(r1, "Run 1");

			Runnable r2 = () -> {
				dObj.func2();
			};
			Thread t2 = new Thread(r2, "Run 2");
			t1.start();
			t2.start();
		}
	}
}
