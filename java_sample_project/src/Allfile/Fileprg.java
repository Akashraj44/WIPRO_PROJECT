package Allfile;
import java.io.*;
import java.util.*;

public class Fileprg {

		    public static void main(String[] args) throws Exception {

		      
		        String file1 = "Text1.txt";
		        String file2 = "Text2.txt";

		       
		        BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1));
		        bw1.write("Java is easy");
		        bw1.newLine();
		        bw1.write("Akash is learner");
		        bw1.close();

		        
		        BufferedWriter bw2 = new BufferedWriter(new FileWriter(file2));
		        bw2.write("File handling in Java");
		        bw2.newLine();
		        bw2.write("Sdet in java");
		        bw2.close();

		       // System.out.println("Files created and written successfully");

		        
		        BufferedReader br1 = new BufferedReader(new FileReader(file1));
		        BufferedWriter copy = new BufferedWriter(new FileWriter("Copy.txt"));

		        String line;
		        while ((line = br1.readLine()) != null) {
		            copy.write(line);
		            copy.newLine();
		        }

		        br1.close();
		        copy.close();
		        System.out.println("File copied");
		        //System.out.println(br1);
		        System.out.println(".................................");
		        //4. Largest Word
		        BufferedReader br2 = new BufferedReader(new FileReader(file1));
		        String largest = "";

		        while ((line = br2.readLine()) != null) {
		            String words[] = line.split(" ");
		            for (String w : words) {
		                if (w.length() > largest.length()) {
		                    largest = w;
		                }
		            }
		        }

		        br2.close();
		        System.out.println("Largest word: " + largest);
		        System.out.println(".................................");

		        // 5. Join Files
		        BufferedWriter join = new BufferedWriter(new FileWriter("Join.txt"));

		        BufferedReader r1 = new BufferedReader(new FileReader(file1));
		        BufferedReader r2 = new BufferedReader(new FileReader(file2));

		        while ((line = r1.readLine()) != null) {
		            join.write(line);
		            join.newLine();
		        }

		        while ((line = r2.readLine()) != null) {
		            join.write(line);
		            join.newLine();
		        }

		        r1.close();
		        r2.close();
		        join.close();

		        System.out.println("Files joined");
		        System.out.println(".................................");

		        //  6. Reverse Reading 
		        BufferedReader br3 = new BufferedReader(new FileReader(file1));
		        ArrayList<String> list = new ArrayList<>();

		        while ((line = br3.readLine()) != null) {
		            list.add(line);
		        }

		        br3.close();

		        System.out.println("Reverse reading:");
		        for (int i = list.size() - 1; i >= 0; i--) {
		            System.out.println(list.get(i));
		        }
		        System.out.println(".................................");

		        // 7. Normal Reading 
		        BufferedReader br4 = new BufferedReader(new FileReader(file1));
		        System.out.println("Normal reading:");

		        while ((line = br4.readLine()) != null) {
		            System.out.println(line);
		        }
		        System.out.println(".................................");

		        br4.close();
		    }
		
		

	}


