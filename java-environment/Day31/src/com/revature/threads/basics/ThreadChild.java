package com.revature.threads.basics;

/*
 * This is an example of a Thread that extends the Thread class
 * Note that we must override the method run from the Thread class
 * in order to specify the work this Thread will complete
 */
public class ThreadChild extends Thread {
	@Override
	public void run() {
		System.out.println("I am a thread which extends the Thread class!");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running");
			
			try {
				Thread.sleep(1500);
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
	}
	
	public ThreadChild() { }
	
	public ThreadChild(String name) {
		super(name);
	}
}
