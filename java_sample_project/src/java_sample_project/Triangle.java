package java_sample_project;

public class Triangle {

	public static void main(String[] args) {
		int row=5;
		
		for (int i = 1; i <= row; i++) {
            for (int j = 1; j >= i;) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

	

}
