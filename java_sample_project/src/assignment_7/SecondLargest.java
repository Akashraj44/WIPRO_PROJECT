package assignment_7;
import java.util.*;

public class SecondLargest {

	public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(10, 20, 4, 30, 99, 99);

	        Set<Integer> set = new HashSet<>(list);
	        List<Integer> List2 = new ArrayList<>(set);

	        Collections.sort(List2, Collections.reverseOrder());

	        if (List2.size() >= 2) {
	            System.out.println("Second Largest: " + List2.get(1));
	        } else {
	            System.out.println("Not enough elements");
	        }
		

	}

}
