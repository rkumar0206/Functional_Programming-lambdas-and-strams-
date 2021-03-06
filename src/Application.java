
public class Application {

	public static void main(String[] args) {

		// using the class instance

		Human human = new Human();
		walker(human);

		Robot robot = new Robot();
		walker(robot);

		// using as anonymous class

		// here we don't need the class instance
		walker(new Walkable() {

			@Override
			public void walk() {

				System.out.println("Custom object walking....");
			}
		});

		// In java-8,lambdas were introduced which somehow similar to anonymous class

		walker(() -> System.out.println("Custom object is walking... using lambdas"));

		// lambdas function also return a value, i.e. functional interface :
		// functional interface is an interface which has only one abstract function
		// example : ALambdaInterface is an interface with only one abstract method

		ALambdaInterface ablockOfCode = () -> {

			System.out.println("Custom object is walking... using lambdas");
			System.out.println("Custom object is walking... using lambdas");
		};

		ablockOfCode.someMethod();
		
	}

	public static void walker(Walkable walkable) {

		walkable.walk();
	}

}
