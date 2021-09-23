package stream.practical.assgnments;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Write a java program to

	i. Create an array list to store group of student 
	marks(99,98,97,100,92,84,80,89,90) in Student class

	ii. Create a method calculateAvg() in Student class to
 	calculate average marks of students by using Stream API .
 	
 */
public class Assignment_app2 {

	public static void main(String[] args) {

		Student s1 = new Student(new ArrayList<Integer>(
				Arrays.asList(99, 98, 97, 100, 92, 84, 80, 89, 90)));
		
		System.out.println("Average marks of student : " + s1.calculateAvg());
		
	}
}

class Student {

	ArrayList<Integer> marks;

	Student(ArrayList<Integer> marks) {

		this.marks = marks;
	}

	public float calculateAvg() {

		int totalMarks = marks.stream().reduce(0, Integer::sum);

		return totalMarks / marks.size();

	}

}
