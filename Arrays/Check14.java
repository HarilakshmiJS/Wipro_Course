import java.util.Scanner;
public class Check14 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		boolean crt = true;
		int[] array = new int[size];
		for(int i = 0; i < size; i++)
		{
			array[i] = sc.nextInt();
			if(array[i] == 1 || array[i] == 4)
			{
				crt = true;
			}
			else
			{
				crt = false;
			}
		}
		System.out.println(crt);
		sc.close();
	}
}
