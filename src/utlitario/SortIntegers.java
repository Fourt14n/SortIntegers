package utlitario;

import java.util.ArrayList;

public class SortIntegers {

	public static ArrayList<Integer> sort (ArrayList<Integer> disorderedList){
		
		/*
		 * The algorithm behind this function is to compare the hole list to a selected number
		 * Doing comparisons to found the lowest number, and then assigning this number at the start of the sorted list
		 */
		
		// Here I instantiate the 3 lists we'll need to use
		// The sorted that will be added elements through the process
		// The disordered that going to be received from the parameters
		// And the temp list we gonna use to create the sorted without deleting the disordered
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		ArrayList<Integer> tempDisorderedList = new ArrayList<Integer>();
		// Here I basically clone the disorderedList
		tempDisorderedList.addAll(disorderedList);
		
		// Here I create the variable that will contains the selector to compare into the lists
		int temporarySelector = 0;
		
		// This is the loop responsible for selecting a element to be compared with the hole list
		for(int a = 0; a < tempDisorderedList.size(); a++) {
			temporarySelector = tempDisorderedList.get(a);
			
			for (int i = 0; i < tempDisorderedList.size(); i++) {
				
				if(temporarySelector < tempDisorderedList.get(i)) {
					continue;
				}else {
					temporarySelector = tempDisorderedList.get(i);
				}
				
				
				
			}
			// Here I get the index of the selector and then remove it from the temporary list, to not compare the same value twice
			int indexOfList = tempDisorderedList.indexOf(temporarySelector);
			sortedList.add(temporarySelector);
			tempDisorderedList.remove(indexOfList);
			// Here I decrease by 1 in each iteration to not mismatch the inversely proportional values ( The "a" variable and the size of the "disorderedList")
			a--;
		}
			return sortedList;
	}
	
}
