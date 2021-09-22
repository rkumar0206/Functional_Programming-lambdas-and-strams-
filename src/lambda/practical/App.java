package lambda.practical;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {

		List<Car> cars = List.of(

				new Car("Honda", "Accord", "Red", 22300), new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500), new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Canry", "Blue", 24000), new Car("Nissan", "Sentra", "White", 17300),
				new Car("Honda", "Accord", "Red", 22300), new Car("Misubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500));

		// printCarsPriceRange(cars, 18000, 22000);
		// printCarByColor(cars, "Red");

		// using anonymous class
		
//		System.out.println("Printing cars between price 18000 and 22000");
//		printCars(cars, new Condition<Car>() {
//
//			@Override
//			public boolean test(Car car) {
//
//				return car.getPrice() <= 18000 && car.getPrice() <= 22000;
//			}
//		});
//
//		System.out.println("Printing cars that are blue");
//		printCars(cars, new Condition<Car>() {
//
//			@Override
//			public boolean test(Car car) {
//
//				return car.getColor().equals("Blue");
//			}
//		});

		// using lambda expression
		System.out.println("Printing cars between price 18000 and 22000");
		printCars(cars, (car) -> car.getPrice() <= 18000 && car.getPrice() <= 22000);

		System.out.println("Printing cars that are blue");
		printCars(cars, (car) -> car.getColor().equals("Blue"));

		
		/**
		 * Built in Function interface : this interface takes on object of a type
		 *  and returns another object of another type
		 */
		// Converting the a car instance to string
		Function<Car, String> priceAndColor = (car) -> "price : " + car.getPrice() + "  Color : " + car.getColor();
		
		String stringCar = priceAndColor.apply(cars.get(5));
		System.out.println(stringCar);
		
	}

	// using built in Predicate interface
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {

		for (Car car : cars) {

			if (predicate.test(car)) {

				car.printCar();
			}
		}
		
		System.out.println();
	}

	// using CarCondition interface
	
//	public static void printCars(List<Car> cars, Condition<Car> condition) {
//
//		for (Car car : cars) {
//
//			if (condition.test(car)) {
//
//				car.printCar();
//			}
//		}
//	}

	/**
	 * 
	 * @author Rohit
	 *
	 * @param <T>
	 * 
	 *            Instead of making this interface we have a a built in interface
	 *            called Predicate and is similar to the below interface
	 *            there are many built in interfaces :-
	 *            https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
	 */

	@FunctionalInterface
	interface Condition<T> {

		public boolean test(T car);
	}

	/**
	 * @author Rohit
	 *
	 *         The below two methods are printing the cars based on a condition.
	 *
	 *         Instead of having two methods we can convert them into one method and
	 *         we can make a method which takes the list of cars and a CarCondition
	 *         interface as argument and we use it as anonymous class or lambda
	 *         function.
	 *
	 *         And now we can can have any number of conditions and based on it we
	 *         can print the cars.
	 */

	/*
	 * public static void printCarsPriceRange(List<Car> cars, int low, int high) {
	 * 
	 * for(Car c: cars) { if(low <= c.getPrice() && c.getPrice() <= high) {
	 * c.printCar(); } } }
	 * 
	 * 
	 * public static void printCarByColor(List<Car> cars, String color) {
	 * 
	 * for(Car c: cars) { if(c.getColor().equals(color)) { c.printCar(); } } }
	 */

}
