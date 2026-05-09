package Allfile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filecount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// write a program to count number of lines
		// ............ replace word
		// ............ count number of words from para
		//............ count number of characters from line
		// ............copy text from one file to another
		//............return largest word from line
		// ............combine two files(join)
		//...........read file from last(reverse reading)
		File f1=new File("Text.txt");
		f1.createNewFile();
		// write file
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text.txt"));
		bw.write("Hello Welcome to Python Learning \n Python Python\n yes it sdet");
		bw.close();
		 int Count = 0;

	       
	           
	            BufferedReader br = new BufferedReader(new FileReader("Text.txt"));

	            
	            while (br.readLine() != null) {
	                Count++;
	            }

	            
	            br.close();
	            System.out.println("Total number of lines: " + Count);

	       
	        
	    }
	//count char
	 BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
     String l1;

     while ((line = br.readLine()) != null) {

         int count = l1.length();  
         System.out.println("Characters in line: " + count);
     }

     br.close();
 }
	
	
		 

	}


