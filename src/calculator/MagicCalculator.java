package calculator;

public class MagicCalculator extends Calculator {
	
	public static int squareRoot(int num1) {
		return (int) Math.sqrt(num1);
	}
	
	public static int sine(int num1) {
		return (int) Math.sin(num1);
	}

	public static int cosine(int num1) {
		return (int) Math.cos(num1);
	}
	
	public static int tangent(int num1) {
		return (int) Math.tan(num1);
	}
	
	public static int factorial(int num1) {
		int i = 1;
		int x = 1;  
		  for(i=1;i<=num1;i++){    
		      x = x * i;    
		  }
		return x;    
	}

}
