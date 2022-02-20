package com.s4u10.client;

import com.s4u10.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		InventoryManager manager = new InventoryManager();
		
		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.populateSoldProducts();
				
			}
			
			
		});
		
		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				manager.displaySoldProducts();
				
			}
			
			
		});
		
		inventoryTask.start();
		Thread.sleep(2000);
	//	Thread.sleep(20000);
	//	inventoryTask.join();
		displayTask.start();
		
	}

}
