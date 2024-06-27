
public class CheckPrimeNumber {
	public static void main(String args[]) 
	   {
	       int n = 81;
	       int count = 0;
	      
	       for(int i = 1; i <= n/2; i++)
	       {
	           if(n%i == 0)
	           {
	               count+=1;
	           }
	       }
	       if(count > 2)
	       {
	           System.out.println("Not Prime Number");
	       }
	       else
	       {
	           System.out.println("Yes Prime Number");
	       }
	   }


}
