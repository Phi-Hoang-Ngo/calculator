package calculator;

public class Calculator {

	public static int add(int num1, int num2) {
		return Math.addExact(num1, num2);
	}
	
	public static int subtract(int num1, int num2) {
		return Math.subtractExact(num1, num2);
	}
	
	public static int multiply(int num1, int num2) {
		return Math.multiplyExact(num1, num2);
	}
	
	public static int divide(int num1, int num2) {
		return Math.floorDiv(num1, num2);
	}

	public static int square(int num1) {
		int result = num1 * num1;
		return result;
	}


}
