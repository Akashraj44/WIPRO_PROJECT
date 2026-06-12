package assignement_5;


public class math {
	public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }


	public static void main(String[] args) {
		math m = new math();

        int sum = m.add(50, 10);
        int diff = m.subtract(50, 10);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
    }
	

	}


