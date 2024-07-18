import java.util.Scanner;

public class BiggestNumberIn3D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int dim = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][][] array = new int[dim][row][col];
        int largest = Integer.MIN_VALUE;
        
        // Reading the elements from user input
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < row; j++) {
            	for(int k = 0; k < col; k++)
            	{
	                array[i][j][k] = sc.nextInt();
	                // finding largest Element
	            	if(array[i][j][k] > largest)
	            	{
	            		largest = array[i][j][k]; 
	            	}
            	}
            }
        }
        System.out.println(largest);
        sc.close();
	}
}
