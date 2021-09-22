
public class Practicing_Lambda {

	public static void main(String[] args) {

		ALambdaInterface hello = () -> System.out.println("hello there");
		hello.someMethod();

		Calculate sum = (a,b) -> Math.addExact(a,b);
		System.out.println(sum.compute(50, 50));
		
		Calculate divide = (a,b) -> {
			
			if (a == 0) {
				
				return 0;
			}

			return a / b;
		};
		
		System.out.println(divide.compute(55, 11));
		
		
		MyGenericInterface<String> reverseString = (s) -> {
			
			String result = "";
			
			for (int i = s.length() - 1; i >= 0 ; i--) {
				
				result += s.charAt(i);
			}
			
			return result;
		};
		
		System.out.println(reverseString.work("Rohit"));
		
		
		MyGenericInterface<Integer> factorial = (num) -> {
			
			int fact = 1;
			
			for (int i =1 ; i<= num ; i++) {
				
				fact *= i;
			}
			
			return fact;
		};
		
		
		System.out.println(factorial.work(5));
		
		
	}
	
	@FunctionalInterface
	interface Calculate {
		
		public int compute(int arg1, int arg2);
	}
	
	@FunctionalInterface
	interface MyGenericInterface<T> {
		
		public T work(T t); 
	}


	// convert this function to lambda
	public void sayHell() {

		System.out.println("hello there");
	}

	// convert this to lambda
	public static int sum(int arg1, int arg2) {

		return Math.addExact(arg1, arg2);
		
	}
	
	// convert this to lambda
	public int nonZeroDivide(int arg1, int arg2) {
		
		if (arg1 == 0) {
			
			return 0;
		}

		return arg1 / arg2;
	}
	
	// convert this to lambda
	public String reverse(String s) {
		
		String result = "";
		
		for (int i = s.length() - 1; i >= 0 ; i--) {
			
			result += s.charAt(i);
		}
		
		return result;
		
	}
	
	// convert this to lambda
	public int factorial(int num) {
		
		int fact = 1;
		
		for (int i =1 ; i<= num ; i++) {
			
			fact *= i;
		}
		
		return fact;
	}

}
