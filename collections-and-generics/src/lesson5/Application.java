package lesson5;


import java.util.Map;
import java.util.TreeMap;


public class Application {

	public static void main(String[] args) {
		
	//	HashMap<String, String> dictionary = new HashMap<String, String>();
	//	LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
		TreeMap<String, String> dictionary = new TreeMap<String, String>(); // not duplicat
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidente", "the state of feeling certain about the truth of something.");
		
		dictionary.put("Brilliant", "xxxxxxxxxxxxxxxxxxxx");
		
	/*	for (String word : dictionary.keySet()) {
		//	System.out.println(word);	
			System.out.println(dictionary.get(word));
		}*/
		
	//		for (String word : dictionary.values()) {
	//		System.out.println(dictionary.get(word));
	//	}
		
		for ( Map.Entry<String, String> entry : dictionary.entrySet()) {
			//	System.out.println(entry.getKey() + " --> "+ entry.getValue());
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
		}

	}

}
