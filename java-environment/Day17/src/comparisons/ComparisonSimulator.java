package comparisons;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

/*
 * Arrays Class (not to be confused with Array Objects) is a utility class
 * that allows us to perform built-in functionality using Java Array Objects.
 * The Arrays class is filled with a number of static methods that can perform
 * operations on Array Objects, such as, printing the objects out, performing
 * searches on the data within the Array, sorting the array, etc...
 * 
 * Collections Class (not to be confused with the Collection interface) is a
 * utility class that is filled with static methods that can be used with objects
 * that inherit from the Collection interface (Set, Queue, List). Similar to the
 * Arrays class, the Collections class allows us to sort, shuffle, search, etc...
 * the Collection Object we are looking at. The Collections class utilizes the
 * Comparator interface instead of Comparable, for added flexibility!
 */
public class ComparisonSimulator {
	public static void main(String[] args) {
		Data d_1 = new Data(6, 87.9);
		Data d_2 = new Data(25, 51.5);
		Data d_3 = new Data(99, 8.2);
		Data d_4 = new Data(17, 47.8);
		Data d_5 = new Data(106, 71.3);
		
		Data[] dataArr = new Data[] {d_1,d_2,d_3,d_4,d_5};
		System.out.println("Array Object:");
		System.out.println(dataArr);// "memory address" - Hashcode
		System.out.println(Arrays.toString(dataArr));
		Arrays.sort(dataArr); // Uses Comparable Interface
		System.out.println(Arrays.toString(dataArr));
		
		
		ArrayList<Data> dList = new ArrayList<Data>();
		dList.add(d_1);
		dList.add(d_2);
		dList.add(d_3);
		dList.add(d_4);
		dList.add(d_5);
		System.out.println("Array List:");
		System.out.println(dList);
		Collections.sort(dList, new DataIdComparator());
		System.out.println("ID Comparator:");
		System.out.println(dList);
		Collections.sort(dList, new DataWeightComparator());
		System.out.println("Weight Comparator:");
		System.out.println(dList);
	}
}
