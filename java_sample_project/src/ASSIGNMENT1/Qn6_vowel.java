package ASSIGNMENT1;
import java.util.Scanner;


public class Qn6_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().charAt(0);

	        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	                System.out.println("Vowel");
	            } else {
	                System.out.println("Consonant");
	            }
	        } else {
	            System.out.println("Not an alphabet");
	        }
	    }
	}

