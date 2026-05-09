package assignment_9;

class NumPrint {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try { wait(); } catch (InterruptedException e) {}
            } else {
                System.out.println("Odd: " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                try { wait(); } catch (InterruptedException e) {}
            } else {
                System.out.println("Even: " + number);
                number++;
                notify();
            }
        }
    }
}


public class Evenodd {

		public static void main(String[] args) {
	        NumPrint obj = new NumPrint();

	        new Thread(() -> obj.printOdd()).start();
	        new Thread(() -> obj.printEven()).start();
	    }
		// TODO Auto-generated method stub

	}


