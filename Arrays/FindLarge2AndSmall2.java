import java.util.Scanner;

public class FindLarge2AndSmall2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		int largest1 = Integer.MIN_VALUE, largest2 = Integer.MIN_VALUE;
        int smallest1 = Integer.MAX_VALUE, smallest2 = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++)
		{
			array[i] = sc.nextInt();
            if (array[i] > largest1) {
                largest2 = largest1;
                largest1 = array[i];
            } else if (array[i] > largest2) {
                largest2 = array[i];
            }

            if (array[i] < smallest1) {
                smallest2 = smallest1;
                smallest1 = array[i];
            } else if (array[i] < smallest2) {
                smallest2 = array[i];
            }
        }
        System.out.println("Largest two numbers: " + largest1 + ", " + largest2);
        System.out.println("Smallest two numbers: " + smallest1 + ", " + smallest2);
        sc.close();
	}

}
