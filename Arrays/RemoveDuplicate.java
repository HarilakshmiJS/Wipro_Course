//using HashMap
/*import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = new int[] {12,34,12,45,56,67};
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		map.forEach((k,v)-> System.out.print(k + " "));

	}

}*/

//using Set

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = new int[] {12,34,12,45,56,67};
		int n = arr.length;
		Set<Integer> set = new LinkedHashSet<>();
		for(int i = 0; i < n; i++)
		{
			set.add(arr[i]);
		}
		//set.forEach(e -> System.out.print(e+" "));
		
		for (Integer element : set) {
            System.out.print(element + " ");
        }
}
}