package stream.practical.assgnments;

import java.util.List;
import java.util.stream.Collectors;

/*
  	Create a java class to create a list of string objects

		i. Count no. strings whose length is> 5

		ii. Count no. of empty strings
		
		iii. Find out empty strings & store them into new list by using Stream API
 */

public class Assignment_app3 {

	public static void main(String[] args) {

		List<String> strings = List.of("Rohit", "", "Hello", "", "Powerade", "Camera", "Samantha",
				"Computer Application", "Keyboard", "Bottle", "", "", "");
		
		int lengthGreaterThan5 = (int) strings.stream().filter(x -> x.length() > 5).count();
		
		//int noOfemptyStrings = (int) strings.stream().filter(x -> x.equals("")).count();
		
		List<String> emptyStrings = strings.stream().filter(x -> x.equals("")).collect(Collectors.toList());
		
		System.out.println("String with length > 5 : " + lengthGreaterThan5 );
		System.out.println("Number of empty strings : " + emptyStrings.size() );
		System.out.println("Empty String list : " +emptyStrings );
		
	}
}
