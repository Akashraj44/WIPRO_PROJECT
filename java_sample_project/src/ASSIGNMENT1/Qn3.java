package ASSIGNMENT1;
import java.util.Scanner;

public class Qn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        if (a > b) {
	            System.out.println("Largest number is: " + a);
	        } else if (b > a) {
	            System.out.println("Largest number is: " + b);
	        } else {
	            System.out.println("Both numbers are equal");
	        }   
	    }
}
