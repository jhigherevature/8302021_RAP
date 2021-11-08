package com.revature.threads.problems;

public class DeadlockObject {
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	public void func1() {
		synchronized (lock1) {
			synchronized (lock2) {
				System.out.println("Func 1: ");
				System.out.println("\t"+Thread.currentThread().getName());
			}
		}
	}
	
	public void func2() {
		synchronized (lock2) {
			synchronized (lock1) {
				System.out.println("Func 2: ");
				System.out.println("\t"+Thread.currentThread().getName());
			}
		}
	}
}
