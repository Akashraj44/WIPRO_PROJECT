package ASSIGNMENT_2;
import java.util.Scanner;

public class Qn1_EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt(); 
		switch(num % 2) {
		 case 0: System.out.println("Even"); 
		break; 
		default: System.out.println("Odd"); 
		 } 
		 } 
	}

