import java.util.Scanner;

public class Reverse2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] array = new int[row][col];
        int[][] result = new int[row][col];
        
        // Reading the elements from user input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        
        // Reversing the 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = array[row - 1 - i][col - 1 - j];
            }
        }
        
        // reversed 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
