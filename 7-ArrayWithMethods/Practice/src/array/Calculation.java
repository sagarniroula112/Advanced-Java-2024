package array;

public class Calculation {
	public static void main(String[] args) {
		int mat1[][] = {{1,2,3}, {10,15,20}, {9,6,5}};
		int mat2[][] = {{4,5,6}, {1,2,3}, {5,1,3}};
		
		int mat3[][] = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
