package com.s4u10.threading;

public class Application2 {
	
	public static void main (String[] arg) {
	
	Sequence sequence = new Sequence();
	
	Worker worke1 = new Worker(sequence);
	worke1.start();
	
	Worker worke2 = new Worker(sequence);
	worke2.start();
	
	}
}

class Worker extends Thread{
	
	Sequence sequence = null;
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() {
	for(int i=0; i < 100; i++) {
		System.out.println(Thread.currentThread().getName() + " got value: " + sequence.getNext());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		}
	}
}
