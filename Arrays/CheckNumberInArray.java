import java.util.Scanner;

public class CheckNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
        System.out.println("Enter num");
        int num = sc.nextInt();
        int index = -1;
        System.out.println("Enter elements");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] == num)
            {
                index = i;
                break;
            }
            
        }
        System.out.println(index);
		sc.close();
	}
}
