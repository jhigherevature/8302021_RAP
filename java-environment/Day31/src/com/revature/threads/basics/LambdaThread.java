package com.revature.threads.basics;

public class LambdaThread {
	public static void main(String[] args) {
		System.out.println("::: START OF APPLICATION :::");
		
		Runnable r = () -> {
			System.out.println("I am a thread created with Lambdas!");
			
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " is running");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
					 /*
					  * If the thread is interrupted, we want this
					  * loop to stop, so  that we do not potentially
					  * cause a stop in our system. 
					  */
					break;
				}
			}
			
			System.out.println(Thread.currentThread().getName() + " has finished");
		};
		
		// Thread lamThread = new Thread(r, "LamThread"); // similar implementation to the RunThread in ThreadSimulator
		r.run(); // Ultimately a thread's actions are dictated by the code in the run method
		
		System.out.println("::: END OF APPLICATION :::");
	}
}
