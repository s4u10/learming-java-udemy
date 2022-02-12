
public abstract class Animal {

	int age;
	String gender;
	int weighInLbs;
	
	
	public Animal(int age, String gender, int weighInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weighInLbs = weighInLbs;
	}
	
/*	public void speak() {
		System.out.println("The animal " + age + " years old");
		System.out.println("It is  " + gender );
		System.out.println("My eye color is " + weighInLbs);
	}
*/	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}	

	public abstract void move();
}
