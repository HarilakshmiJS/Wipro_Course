import java.util.Scanner;
import java.util.Arrays;
public class EvenOddOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();  
        }
        System.out.print(Arrays.toString(evenodd(arr)));
		sc.close();

	}
	public static int[] evenodd(int[] arr)
    {
        int[] result = new int[arr.length];
        int j = 0;
        // even
        for(int i = 0; i < result.length; i++)
        {
            if(arr[i]%2 == 0)
            {
                result[j++] = arr[i];
            }                
        }
        // odd
        for(int i = 0; i < result.length; i++)
        {
            if(arr[i]%2 != 0)
            {
                result[j++] = arr[i];
            }                
        }
        return result;
    }

}
