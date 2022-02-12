package lesson2;

public class Vehicle {
	
	String make;
	String modle;
	int price;
	boolean fourWdrive;
	
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", modle=" + modle + ", price=" + price + ", fourWdrive=" + fourWdrive + "]";
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModle() {
		return modle;
	}
	public void setModle(String modle) {
		this.modle = modle;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFourWdrive() {
		return fourWdrive;
	}
	public void setFourWdrive(boolean fourWdrive) {
		this.fourWdrive = fourWdrive;
	}
	
	public Vehicle(String make, String modle, int price, boolean fourWdrive) {
		super();
		this.make = make;
		this.modle = modle;
		this.price = price;
		this.fourWdrive = fourWdrive;
	}


}
