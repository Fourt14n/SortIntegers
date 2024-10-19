package sistema;

import java.util.ArrayList;

import utlitario.SortIntegers;

public class Sistema {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(21);
		myList.add(1);
		myList.add(12);
		myList.add(42);
		myList.add(37);
		
		System.out.println("Before sort: " + myList);

		myList = SortIntegers.sort(myList);
		
		System.out.println("After the sort: " + myList);
		
	}

}
