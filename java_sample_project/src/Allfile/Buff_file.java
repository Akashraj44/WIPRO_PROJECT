package Allfile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.*;
public class Buff_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("Text.txt");
		f1.createNewFile();
		// write file
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text.txt"));
		bw.write("Hello Welcome to Python Learning \n Python Python");
		bw.close();
		//read
		BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
        String l1;
       
        while((l1=br.readLine())!=null)
        	
        {
        	System.out.println(l1);
        	l1= l1.replace("Python", "Java"); 
        	System.out.println(l1);
        }
        br.close();
	}
 
}