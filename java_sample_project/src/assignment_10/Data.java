package assignment_10;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Data {
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to append: ");
        String input = sc.nextLine();

        
           
            FileWriter fw = new FileWriter("ss.txt", true);

            fw.write(input);
            fw.write("\n"); 

            fw.close();

            System.out.println("Data appended successfully!");

        }
        

       

}
