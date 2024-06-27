import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int original = sc.nextInt();
		int temp = original;
		int reverse = 0;
		while(temp != 0)
		{
			reverse = reverse * 10 + temp%10;
			temp /= 10;
		}
		if(reverse == original)
		{
			System.out.println(reverse+" is Palindrome");
		}
		else
		{
			System.out.println(reverse+" is not Palindrome");
		}

	}

}
