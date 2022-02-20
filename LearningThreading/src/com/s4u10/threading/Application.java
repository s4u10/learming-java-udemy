package com.s4u10.threading;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("Starting Thread 1");
//		Task taskRunner = new Task("Thread-A");
//		Thread t1 = new Thread(taskRunner);
		Thread t1 = new Thread(new Task("Thread-A"));
		t1.start();
//		taskRunner.start();
//		taskRunner.run();
		
		System.out.println("Starting Thread 2");
//		Task taskRunner2 = new Task("Thread-B");
//		Thread t2 = new Thread(taskRunner2);
		Thread t2 = new Thread(new Task("Thread-B"));
		t2.start();
//		tarkRunner2.start();
//		tarkRunner2.run();

	//	Task taskRunner = new Task();
	//	taskRunner.start();
	}

}

//class Task extends Thread {
class Task implements Runnable {
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	
	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i=0; i < 1000; i++) {
			System.out.println("number: "+ i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
