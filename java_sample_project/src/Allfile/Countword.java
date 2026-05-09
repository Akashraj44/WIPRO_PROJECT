package Allfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Countword {

	public static void main(String[] args) throws IOException {
		File f1=new File("Text.txt");
		f1.createNewFile();
		// write file
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text.txt"));
		bw.write("Hello Welcome to Python Learning \n Python Python\n yes it sdet");
		bw.close();
		
		 BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
	        int count = 0;
	        String line;

	        while ((line = br.readLine()) != null) {
	            String[] words = line.split(" ");
	            count = count + words.length;
	        }

	        br.close();

	        System.out.println("Total words: " + count);
	    }
		// TODO Auto-generated method stub

	}


