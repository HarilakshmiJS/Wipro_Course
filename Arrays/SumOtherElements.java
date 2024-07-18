import java.util.Scanner;

public class SumOtherElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int sum = 0;
		boolean add = true;
		int[] arr = new int[n];
		for(int i = 0; i< n; i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i] != 6 && add == true)
			{
				sum += arr[i];
			}
			else if(arr[i] == 6)
			{
				add = false;	
			}
			else if(arr[i] == 7)
			{
				add = true;
			}
			
		}
		System.out.println(sum);
	}

}
