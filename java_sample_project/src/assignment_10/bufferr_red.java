package assignment_10;
import java.io.*;
import java.util.Scanner;

public class bufferr_red {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        
            // 🔹 Writing (append mode)
            FileWriter fw = new FileWriter("ss.text", true);
            System.out.print("Enter text: ");
            String input = sc.nextLine();

            fw.write(input);
            fw.write("\n");
            fw.close();

            
            BufferedReader br = new BufferedReader(new FileReader("ss.text"));
            String line;

            System.out.println("\nLines containing 'Java':");

            while ((line = br.readLine()) != null) {
                if (line.contains("Java")) {
                    System.out.println(line);
                }
            }

            br.close();
	}
}

