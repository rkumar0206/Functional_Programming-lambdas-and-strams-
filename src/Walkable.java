
// using this annotation to ensure that only one method 
// is added to this interface

@FunctionalInterface
public interface Walkable {

	public void walk();
	// public void run(); // if we will more than one abstract method, lamdas won't
	// work
}
