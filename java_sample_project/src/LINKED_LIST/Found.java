package LINKED_LIST;
import java.util.*;


public class Found {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();

      
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);

       
        System.out.println("ArrayList: " + li);

      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int n = sc.nextInt();

       
        if (li.contains(n)) {
            System.out.println("Element found in the list."+n);
        } else {
            System.out.println("Element not found in the list."+n);
        }
        sc.close();
    }

	}


