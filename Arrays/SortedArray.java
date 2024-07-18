import java.util.Scanner;
import java.util.Arrays;
public class SortedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[7];
        int temp;
                
        System.out.println("Enter elements");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
            
        }
        for(int i = 0; i < 7; i++)
        {
            for(int j = i+1; j < 7; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        scan.close();

	}

}
