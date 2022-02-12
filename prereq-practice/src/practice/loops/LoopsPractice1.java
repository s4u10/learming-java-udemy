package practice.loops;

public class LoopsPractice1 {
	
	public static void main(String args[]) {
		
		String str = "We have a large inventory of things in our warehore falling in "
				+ "the category:apperal and the slightly"
				+ "more in demand category:makeup along with the category:furniture and ...";
		
		printCategories(str);
		
	}
	
	/**
	 * 
	 * extract all categories from the string argument
	 * @param str
	 */
	
	public static void printCategories(String string) {
		int i = 0;
		while (true) {
			int found = string.indexOf("category:", i);
			if (found == -1) break;
			int start = found +9; // Start of the actual category
			int end = string.indexOf(" ", start);
			System.out.println(string.substring(start, end));
			i = end+1;
		}
	
	}

}
