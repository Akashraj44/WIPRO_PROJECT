package assignment_6;

public class Qn1_change {
	static void changeValue(int x) {
        x = x + 2;
        System.out.println("Inside method: " + x);
    }

	public static void main(String[] args) {
		int num = 5;
        System.out.println("Before call: " + num);
        changeValue(num);
        System.out.println("After call: " + num);
    }
		

	}


