package Code;

import java.util.Arrays;

public class MatrixFlipVertical {
	
	// java.util.* has been imported for this problem.
	// You don't need any other imports.

	public static void flipItVerticalAxis(int[][] matrix) {
		
		for ( int i = 0; i < matrix.length ; i++ ) {
			for ( int j = 0 ; j < matrix[i].length/2; j++ ) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[i].length-j-1];
				matrix[i][matrix[i].length-j-1] = temp;
			}
		}
	    
	}
	
	public static void main( String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,7,6}};
		System.out.println(Arrays.deepToString(matrix));
		flipItVerticalAxis(matrix);
		System.out.println(Arrays.deepToString(matrix));
	}


}
