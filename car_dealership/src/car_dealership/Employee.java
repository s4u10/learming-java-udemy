package car_dealership;

public class Employee {
	public void handelCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			// customer pays in cash
			processTranaction(cust, vehicle);
		} else {
			System.out.println("Customer will need more money to parchase vehicle: " + vehicle);
		}
	}

	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer...");
		System.out.println("Customer has been approved to purchase the vehicle");
	}
	
	public void processTranaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: " 
				           + vehicle + " for the price "+ vehicle.getPrice());
	}
}
