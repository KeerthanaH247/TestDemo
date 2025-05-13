package Array;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		int rows=a.nextInt();
		int columns=a.nextInt();
		
		int[][] matrix1=new int[rows][columns];
		int[][] matrix2=new int[rows][columns];
		int[][] summatrix=new int[rows][columns];
		
		System.out.println("Enter the elements of firt matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrix1[i][j]=a.nextInt();
				
				}
			System.out.println();
			}
		
		System.out.println("Enter the elements of second matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrix2[i][j]=a.nextInt();
				
			}
			System.out.println();
		}
		
		System.out.println("Sum of two matrices is");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
				summatrix[i][j]=matrix1[i][j]+matrix2[i][j];
				
			}
				
		}
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					System.out.println(summatrix[i][j]+ " ");
				}
				System.out.println();
			}
	}

}
