package java_sample_project;

public class CHECKING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=40;
		if(a>=b && a>=c) {
			System.err.println("largest number"+a);
		}
		else if(b>=a && b>=c) {
			System.err.println("largestnumber"+b);
			
		}
		else {
		System.err.println("largestnumber"+c);
		}

	}

}
