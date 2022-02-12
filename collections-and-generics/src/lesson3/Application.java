package lesson3;


import java.util.HashSet;

public class Application {

	public static void main(String[] args) {
	
	/*	HashSet<Integer> values = new HashSet<Integer>();
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(43);  */
		
	/*	HashSet<String> values = new HashSet<String>();
		values.add("Rondom");
		values.add("Animal");
		values.add("People");
		values.add("Rondom");
		values.add("Rondom");*/
		
	/*	LinkedHashSet<String> values = new LinkedHashSet<String>();
		values.add("Rondom");
		values.add("Animal");
		values.add("People");
		values.add("Zoo");
		values.add("Car");
		values.add("Car");
		values.add("Car");
		values.add("Car");
		values.add("People"); */
		
		HashSet<Animal> animals = new HashSet<Animal>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangorro", 24);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
//		System.out.println(animal1.equals(animal4));
		
//		System.out.println(animal1.hashCode());
//		System.out.println(animal4.hashCode());
		
		for(Animal value: animals) {
			System.out.println(value);
		}
	}
}


