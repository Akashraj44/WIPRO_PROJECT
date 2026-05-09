package assignment_10;
import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;


public class wordcnt {
	String filePath = "ss.text";
    String targetWord = "Java";

    int count = 0;

    
        BufferedReader br = new BufferedReader(new FileReader(filePath));
       String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            for (String word : words) {
                if (word.equals(targetWord)) {
                    count++;
                }
            }
        }

 
        System.out.println("Occurrences of '" + targetWord + "': " + count);

    
    }
}

