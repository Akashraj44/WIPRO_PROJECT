package lmda;
interface Calculator{
    int calculate(int a, int b);
}
public class Calculator1 {
	

	public static void main(String[] args) {
		Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
            return a / b;
        };
        int a = 20;
        int b = 5;
        System.out.println("Addition: " + add.calculate(a,b));
        System.out.println("Subtraction: " + sub.calculate(a,b));
        System.out.println("Multiplication: " + mul.calculate(a,b));
        System.out.println("Division: " + div.calculate(a,b));
	}
	}
		


