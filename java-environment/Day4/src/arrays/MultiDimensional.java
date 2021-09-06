package arrays;

public class MultiDimensional {
	public static void main(String[] args) {
		int[][] twoDee = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println(twoDee[1][1]); // 5
		System.out.println(twoDee[0][2]); // 3
		System.out.println(twoDee[2][0]); // 7
		
		int[][][] threeDee = {
				{
					{1,2,3,4},
					{5,6,7,8,9,10},
					{11,12,13,14,15,16,17}
				},
				{
					{7,8,9},
					{9,8,7},
					{6,5,4,3},
					{2},
					{1,0,-1,-2}
				}
		};
		
		System.out.println(threeDee[0][1][5]); // 10
		
		/*
		 * The following can be done, though not a common
		 * way to represent arrays in Java
		 */
		int[] otherTwoDee[] = {{},{}};
	}
}
