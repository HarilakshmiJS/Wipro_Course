import java.util.Arrays;
public class PrintMiddleElement {

	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {4,5,6,7,8};
		int[] result = new int[2];
		int j = 0;
		for(int i = 0; i <= array1.length/2; i++)
		{
			if(i == array1.length/2)
			{
				result[j++] = array1[i];
			}
		}
		for(int i = 0; i <= array2.length/2; i++)
		{
			if(i == array2.length/2)
			{
				result[j++] = array2[i];
			}
		}
		System.out.print(Arrays.toString(result));
	}

}
