package assignment_7;
import java.util.*;

public class SysDifference {

	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        HashSet<Integer> list1 = new HashSet<>(set1);
       list1.addAll(set2);

        HashSet<Integer> list2= new HashSet<>(set1);
        list2.retainAll(set2);

        list1.removeAll(list2);

        System.out.println("Symmetric Difference: " + list1);
    }

	}


