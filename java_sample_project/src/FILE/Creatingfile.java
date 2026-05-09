package FILE;
import java.io.*;
import java.util.Scanner;

public class Creatingfile {

	public static void main(String[] args) throws FileNotFoundException {
		File file =new File("ss.text");
		Scanner sc= new Scanner(file);
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
		
				
		
		// TODO Auto-generated method stub

	}

}
