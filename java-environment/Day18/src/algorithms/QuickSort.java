package algorithms;

/*
 * The Quick sort algorithm is a recursive sorting algorithm which 
 * sorts elements by determining a pivot value and swapping values within
 * the collection based on whether other elements should be placed to the
 * left or right of this value.
 * 
 * This algorithm has a Big-O (worst-case) Complexity of:
 * Time : O(n^2)
 * 		The worst-case time complexity of this would result if the pivot value
 * 		chosen was always the highest or lowest value (depending on the sorting
 * 		order, in which case a comparison and swap would have to be made for 
 * 		each element within the smaller partition. Resulting in the same number
 * 		of operations as a worst-case bubble sort.
 * 
 * Space : O(n)
 *		The space complexity of a Quick sort is highly dependent on the 
 *		implementation, since swaps can be made for partitions, or alternatively
 *		new collections can be generated to contain the partitions. In the 
 *		example shown below, no new collections are generated, and as such
 *		an O(n) complexity is the space complexity.
 */
public class QuickSort {
	/* Simulator Method */
	public static void main(String args[]) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		System.out.println("Given Array");
		printArray(arr);
		
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, arr.length-1);
		
		System.out.println("\nSorted array");
		printArray(arr);
	}

	/* A utility method to print array of size n */
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	/*
	 * Recursively sort the elements by finding a pivot element
	 * and swapping elements based on the value of that pivot
	 * element...
	 * This recursive call occurs on all elements on the left
	 * of a partition and all elements on the right of the partition.
	 */
	public void quickSort(int arr[], int begin, int end) {
		if (begin < end) {
			int p_index = partition(arr, begin, end);
			
			quickSort(arr, begin, p_index-1); // recursive sort on left partition
			quickSort(arr, p_index+1, end); // recursive sort on right partition
		}
	}
	
	// How to Find partition
	private int partition(int arr[], int begin, int end) {
		int pivot = arr[end];
		int i = begin - 1;
		
		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot ) {
				i++;
				
				swap(arr, i, j); // swap elements around pivot point
			}
		}
		
		swap(arr, i+1, end);
		
		return i+1; // location of pivot element used for future swaps
	}
	
	/* Swap position of two indexs of an array */
	void swap (int[] arr, int l_index, int r_index) {
		int temp = arr[l_index];
		arr[l_index] = arr[r_index];
		arr[r_index] = temp;
	}
}
