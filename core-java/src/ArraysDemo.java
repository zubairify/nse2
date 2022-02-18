public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] ar = {10, 20, 30, 40, 50};
		for (int i = 0; i < ar.length; i++) 
			System.out.println(ar[i]);
		
		for (int i : ar) 
			System.out.println(i);
		
		int[][] mat = { {1,2,3}, {4,5,6}, {7,8,9} };
		// Print this array elements row-wise
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		
		for (int[] row : mat) {
			for (int i : row) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		
		int[] sort = {5,3,2,4,1};	// Sort this array and print
		
	}
}
