package calculator;

import java.util.Scanner;

public class app {

	static int num1;
	static int num2;
	static int result;
	static int x;

	public static void main(String[] args) {
		System.out.println("Welcome to Magic Calculator\n\n");
		System.out.println(
				"Just enter a number, then choose the mathmatical operation and if needed the other number.\n\n");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			num1 = scanner.nextInt();
		} else {
			num1 = Function();
		}
		System.out.println(num1);
		System.out.println(
				"\n\n+ = add\n- = subtract\n* = multiply\n/ = divide\nsqd = squared\nsqt = square root\nsin = sine\ncos = cosine\ntan = tangent\nfac = factorial\n\n");
		Function1();
		System.out.println("\n\n");
		System.out.println(result);
		scanner.close();
	}

	private static int Function1() {
		Scanner scanner1 = new Scanner(System.in);
		String calcOpp = scanner1.next();
		System.out.println("\n\n");

		switch (calcOpp) {
		case "sqd": {
			result = Calculator.square(num1);
			break;
		}
		case "sqt": {
			result = MagicCalculator.squareRoot(num1);
			break;
		}
		case "sin": {
			result = MagicCalculator.sine(num1);
			break;
		}
		case "cos": {
			result = MagicCalculator.cosine(num1);
			break;
		}
		case "tan": {
			result = MagicCalculator.tangent(num1);
			break;
		}
		case "fac": {
			result = MagicCalculator.factorial(num1);
			break;
		}
		case "+": {

			if (scanner1.hasNextInt()) {
				num2 = scanner1.nextInt();
			} else {
				num2 = Function();
			}
			result = Calculator.add(num1, num2);
			break;
		}
		case "-": {
			if (scanner1.hasNextInt()) {
				num2 = scanner1.nextInt();
			} else {
				num2 = Function();
			}
			result = Calculator.subtract(num1, num2);
			break;
		}
		case "*": {
			if (scanner1.hasNextInt()) {
				num2 = scanner1.nextInt();
			} else {
				num2 = Function();
			}
			result = Calculator.multiply(num1, num2);
			break;
		}
		case "/": {
			if (scanner1.hasNextInt()) {
				num2 = scanner1.nextInt();
			} else {
				num2 = Function();
			}
			result = Calculator.divide(num1, num2);
			break;
		}
		default: {
			System.out.println("Please Only Enter the Math Operator");
			Function1();
		}
		scanner1.close();
		}
		return result;
	}

	private static int Function() {
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		System.out.println("Please Only Enter Numbers\n\n");
		if (input2.hasNextInt()) {
			x = input2.nextInt();
			return x;
		} else {
			Function();
		}
		return x;
	}
}
