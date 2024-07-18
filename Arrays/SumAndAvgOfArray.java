import java.util.Scanner;

public class SumAndAvgOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		int[] array = new int[n];
		int sum = 0;
		System.out.println(" Enter elements");
		for(int i = 0; i<n; i++)
		{
			array[i]= sc.nextInt();
			sum += array[i];
		}
		double avg = (double)sum/n;
		System.out.println(sum);
		System.out.println(avg);
		
		sc.close();
	}

}
