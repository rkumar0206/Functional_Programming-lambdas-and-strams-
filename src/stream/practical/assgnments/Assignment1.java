package stream.practical.assgnments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Create a file named the Numbers and populate it with 30 random numbers
 *  in the range 1 to 30 including the end points. Place 1 number per line. 
 *  Open the file and print the numbers 10 per line Find and print the following.
 *   1. Average of the numbers 2. Sum of the numbers
 */

public class Assignment1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		Stream<String> lines = Files.lines(Paths.get("files/Numbers.txt"));
		
		List<Integer> numbers = lines.map(x -> Integer.parseInt(x))
													.collect(Collectors.toList());
		
		int sum = numbers.stream().reduce(0, Integer::sum);
		
		int average = sum / numbers.size();
		
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + average);
				
	}

}
