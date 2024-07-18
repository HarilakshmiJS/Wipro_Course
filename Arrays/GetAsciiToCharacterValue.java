import java.util.Scanner;

public class GetAsciiToCharacterValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
        System.out.println("Enter elements");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            System.out.print((char)arr[i]+" ");   
        }
        sc.close();

	}

}
