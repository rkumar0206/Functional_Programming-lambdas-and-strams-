package stream.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		// example 1
		IntStream.range(1, 10)// source // does not contain the last element
				.skip(5) // terminal operation
				.forEach((x) -> System.out.print(x));

		// example 2
		int val = IntStream.range(1, 5) // source
				.sum(); // terminal operation

		System.out.println("\nSum : " + val + "\n");

		// example 3
		Stream.of("Hello", "bottle", "Africa").sorted() // intermediate operation
				.findFirst() // intermediate operation
				.ifPresent((x) -> System.out.println(x)); // terminal operation

		// example 4

		System.out.println();
		
		String[] items = { "car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy" };

		Stream.of(items).filter((x) -> x.startsWith("t")) // intermediate operation
				.sorted() // intermediate operation
				.forEach(System.out::println); // terminal operation

		// example 5 - average
		System.out.println();
		Arrays.stream(new int[] {2,4,6,8,10})
			.map((x) -> x * x)
			.average()
			.ifPresent(System.out::println);
		
		// example 6 
		System.out.println();
		
		List<String> listOfItem = Arrays.asList("Car", "Computer", "Toothpaste", "Box", "Pencil", "Tent", "Door", "Toy" );
		
		listOfItem.stream()
			.map(x -> x.toLowerCase())
			.filter(x -> x.startsWith("c"))
			.sorted()
			.forEach(System.out::println);
		
		
		
	}

}
