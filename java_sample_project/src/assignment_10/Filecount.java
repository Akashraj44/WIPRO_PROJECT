package assignment_10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Filecount {
	public static void main(String[] args) throws IOException {
        String filePath = "ss.text";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

       
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

              
                if (!line.equals("")) {
                    wordCount += line.split(" ").length;
                }
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } 
}
   
