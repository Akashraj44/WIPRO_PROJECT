package java_sample_project;

public class STUDENT {
	int roll;
	String name1="Hit";
	void branch(String name,String b_name) {
		System.out.println("student name ="+name);
		System.out.println("student roll = "+roll);
		System.out.println("student branchname="+b_name);
		System.out.println("student school="+name1);
		


	}
	void teacher(String name,String teacher_dp) {
		System.out.println("teacher name="+name);
		System.out.println("teacher school="+name1);
		System.out.println("teacher branchname="+teacher_dp);

		
	}

	public static void main(String[] args) {
		STUDENT stu =new STUDENT();
		
		stu.branch("Akash", "CSE");
		stu.teacher("abhi", "ece");

	}

}
