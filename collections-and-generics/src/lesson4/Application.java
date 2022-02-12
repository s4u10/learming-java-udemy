package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class Application {

	public static void main(String[] args) {
		
		HashSet<Employee> hashSet = new HashSet<Employee>();

		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Paul", 3000, "Admin"));
		hashSet.add(new Employee("Peter", 4000, "IT"));
		hashSet.add(new Employee("Angel", 2000, "Maint"));
		
	    ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
		
//		hashSet.add("Random");
//		hashSet.add("Tooth Brush");
//		hashSet.add("Computer");
//		hashSet.add("Cloths");
		
		
//		ArrayList<String> myList = new ArrayList<String>(hashSet);
		
//		Collections.sort(myList);
		
//		System.out.println(myList);
		
	/*	HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(12);
		hashSet.add(43);
		hashSet.add(15);
		hashSet.add(67);
		hashSet.add(43);
		hashSet.add(10);
		hashSet.add(10);
		hashSet.add(10);
		hashSet.add(10);
		
		ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);
		
		Collections.sort(myList);
		
		System.out.println(myList); /*
		
	//	ArrayList<Integer> list1 = new ArrayList<Integer>();
	/*	HashSet<Integer> list1 = new HashSet<Integer>();
		
		
		
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		list1.add(10); /*
		
		
		
	/*	List<Integer> li = new ArrayList<Integer>(list1);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(10);
		newList.add(67);
		newList.add(15);
	
		list1.retainAll(newList);
		
	//	list1.addAll(newList);
	//	list1.removeAll(newList);
	//	list1.clear();
	//	boolean hasValue = list1.contains(67);
	//	boolean hasValue = list1.contains(48);
	//	boolean hasValue = list1.isEmpty();
	//	boolean hasValue = list1.retainAll(newList);
		
		//System.out.println(list1);
	//	System.out.println(hasValue);
		System.out.println(list1);
		
		*/
	}

}
