import java.util.Scanner;

public class MaxAndMinOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] > maximum)
            {
                maximum = arr[i];
            }
            else if(arr[i]< minimum)
            {
                minimum = arr[i];
            }

        }
        System.out.println(maximum);
        System.out.println(minimum);
		
		sc.close();

	}

}
