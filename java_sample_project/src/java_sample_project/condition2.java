package java_sample_project;

public class condition2 {

	public static void main(String[] args) {
		float per =108f;
		if(per>=80||per<=100) {
			System.out.println("distict");
			if(per>=85) {
				System.err.println("A+");
			}
			else if(per>95) {
				System.err.println("A++");
			}
		}
		else if (per>=50||per<80){
			System.err.println("first");
		
	}

}
