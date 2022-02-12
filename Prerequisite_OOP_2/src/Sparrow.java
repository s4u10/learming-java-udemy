
public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weighInLbs) {
		super(age, gender, weighInLbs);

	}


	public void fly() {
		System.out.println("Sparrow flying high...");
		
	}
	
}
