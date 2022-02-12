
public class Chicken extends Bird {

	public Chicken(int age, String gender, int weighInLbs) {
		super(age, gender, weighInLbs);

	}
	
	//overriding the method difined in Bird
	public void fly() {
		System.out.println("Not able to fly...");
	}

}
