
public class Earth {
	
	public static void main(String args[]) {
		
		/*	
		 
		Human tom;
		
		tom = new Human();
		tom.name = "Tom Zsabo";
		tom.age = 5;
		tom.heightInInches = 72;
		tom.eyeColor = "Grown";
				
		tom.speak();
		
		Human joe = new Human();
		
		joe.name = "Joe Greensilk";
		joe.age = 36;
		joe.heightInInches = 68;
		joe.eyeColor = "Green";
		
		joe.speak();
		*/
		
		Human human1 = new Human("Ton", 25, 76, "Blue");
		Human human2 = new Human("Joe", 28, 68, "Green");
		
		
		human1.speak();
		human2.speak();
		
	}

}
