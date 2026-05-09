package LINKED_LIST;
import java.util.*;

public class List {

	public static void main(String[] args) {
		Set<String> s= new HashSet<String>();
		s.add("red");
		s.add("yellow");
		s.add("blue");
		System.out.println(s);
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// TODO Auto-generated method stub

	}

}
