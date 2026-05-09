package assignement_5;
interface Calculator {
    void div(int a, int b);
}

class MyCalculator implements Calculator {

    public void div(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}

public class Execp {

	public static void main(String[] args) {
		MyCalculator ob= new MyCalculator();

        ob.div(10, 2); 
        ob.div(10, 0);
		

	}

}
