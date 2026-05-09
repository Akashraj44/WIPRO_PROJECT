package LINKED_LIST;
import java.util.*;



public class Fruit {

	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();

	      
        li.add("apple");
        li.add("kiwi");
        li.add("banana");
        li.add("lichi");
        li.add("carrot");

       
        System.out.println("ArrayList: " + li);
        li.remove("kiwi");
        System.out.println(li);


	}

}
