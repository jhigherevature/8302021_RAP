package algorithms;

import java.util.Arrays;

public class Searching {
	
	public static void main(String[] args) {
		int[] numbers = {4,8,6,2, 8};
		int result = linearSearch(8, numbers);
		System.out.println(result);
		Arrays.sort(numbers); 
		System.out.println(Arrays.toString(numbers));
		System.out.println(binarySearch(90, numbers));
	}

	public static int linearSearch(int target, int[] collection) {
		int index = -1;
		for (int i = 0; i < collection.length; i++) {
			if (collection[i] == target) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int binarySearch(int target, int[] collection) {
		int left = 0;
		int right = collection.length-1;

		while (left <= right) {
			int mid = (right+left)/2;
			if (target < collection[mid]) {
				right = mid - 1;
			} else if (target > collection[mid]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
