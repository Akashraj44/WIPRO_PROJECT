package FILE;
package IO_Filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read_file {

	
		
		 
			public static void main(String[] args) throws IOException {
		       // File file=new File("sample.txt");
		        File file=new File("demo.txt");// name the file
		        file.createNewFile();// create file
		        FileWriter wr=new FileWriter("demo.txt");
		        wr.write("Let's learn JAva Prgraming\n, Selenium Automation\\n");// override  line
		       // wr.write("");
		        wr.close();
		        FileReader reader = new FileReader("demo.txt");
		        int data;
		        while ((data = reader.read()) != -1) {
		            System.out.print((char) data);
		        }
		        reader.close();
		        B
		 
//		        Scanner sc=new Scanner(file);
		       // file.createNewFile();
//		       Scanner sc=new Scanner(file);
				
		      
//		       while(sc.hasNextLine())
//		       {
//		    	   System.out.println(sc.nextLine());
//		       }
//		       sc.close();
		       
			}
		 
		}
		 
		 
		// TODO Auto-generated method stub

	}

}
