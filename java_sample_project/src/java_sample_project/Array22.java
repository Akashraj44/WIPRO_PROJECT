package java_sample_project;

public class Array22 {

	public static void main(String[] args) {
		
		int n = 4;
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                ar[i][j] = j + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }


	

}
