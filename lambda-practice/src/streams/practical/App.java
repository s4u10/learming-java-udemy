package streams.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class App {

	public static void main(String[] args) throws IOException {
		
		
		Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
		rows.map(x -> x.split(","))
			.filter(x -> x.length > 3)
			.filter(x -> Integer.parseInt(x[1].trim()) > 15)
			.forEach(x -> System.out.println(x[0].trim()+ " " + x[2].trim() + " " + x[3].trim()));
			rows.close();
		
	}
				
}
		
		
		
	/*	Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
		int rowCount = (int) rows
				.map(x -> x.split(","))
				.filter(x -> x.length > 3)
				.count();
		System.out.println(rowCount + " good rows.");
		rows.close();
		
		} */
		
		
	/*	List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
			.filter(x -> x.contains("th"))
			.collect(Collectors.toList());
			words.forEach(x -> System.out.print(x + ", "));
		System.out.println();
	}
		*/

/*			Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
			lines.sorted()
			.filter(l -> l.length() > 6)
			.forEach(x -> System.out.print(x + ", "));
			lines.close();
	}*/
	

	
/*		//Stream form a list, filter and print
		List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car", "Tent", "Door", "Toy");
		listOfItems.stream()
			.map(x -> x.toLowerCase())
			.filter(x -> x.startsWith("c"))
			.sorted()
			.forEach(x -> System.out.print(x + ", "));
		
	} */
		
		
		
		
		// Integer Stream with Skip
		
		
/*		// Average of squares of an int array
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
			.map((x) -> x * x)
			.average()
			.ifPresent(n -> System.out.print(n));
			System.out.println();
		} /*

		//Stream form Array, sort, filter and print
		
/*		String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
		Stream.of(items)
			.filter((x) -> x.startsWith("t"))
			.sorted()
			.forEach(x -> System.out.print(x + ", "));
		System.out.println();/*
			
		
		//Stream.of, sorted and findFirst
		
	/*	Stream.of("Hello", "bottle", "Africa")
			.sorted()
			.findFirst()
			.ifPresent((x) -> System.out.println(x));*/
		
		
	// Integer stream with sum
	/*	int val = IntStream
		.range(1, 5)
		.sum();
		System.out.println(val);*/

		
		//integer Stream with skip
	/*	IntStream
		.range(1, 10)
		.skip(5) // skip 5 elements of the stream
		.forEach((x) -> System.out.print(x));
		System.out.println();*/


