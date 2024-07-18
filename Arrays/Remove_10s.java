import java.util.Scanner;

public class Remove_10s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
        int j = 0;
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] != 10)
            {
                arr[j++] = arr[i];
            }
            
        }
        while(j < arr.length)
            {
                arr[j++] = 0;
            }

        for(int i = 0; i < j; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        sc.close();

	}

}
