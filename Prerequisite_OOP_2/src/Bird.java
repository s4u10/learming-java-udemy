
public class Bird extends Animal {
	

	public Bird(int age, String gender, int weighInLbs) {
		super(age, gender, weighInLbs);

	}

	@Override
	public void move() {
		System.out.println("Flapping wings...");
		
	}


}
